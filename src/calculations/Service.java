package calculations;

import Gas.Gas;
import measurements.PermeanceExperiment;
import membranes.Membrane;
import messaging.Communication;

import java.util.*;

public class Service {
    public Service() {
    }

    public static void collectDataFromUser(Communication communication, Scanner scanner, Membrane membrane, Map<String, Float> gasPermeances, List<String> gasList, Integer numberOfGases) {
        for (int i = 0; i < numberOfGases; i++) {
            communication.queryForGasName();
            Gas gas = new Gas(scanner.next());
            gasList.add(gas.getGasName());
            communication.queryForMeasurementPressure();
            int pressure = scanner.nextInt();
            communication.queryForMeasuredVolume();
            float volume = scanner.nextFloat();
            communication.queryForMeasuredTime();
            float time = scanner.nextFloat();
            PermeanceExperiment permeanceExperiment = new PermeanceExperiment(time, volume, pressure);
            PermeanceCalculator permeanceCalculator = new PermeanceCalculator(membrane, permeanceExperiment);
            float permeanceGPU = permeanceCalculator.calculatePermeance();

            gasPermeances.put(gas.getGasName(), permeanceGPU);
            System.out.println("Gas permeance for " + gas
                    .getGasName() + " is: " + permeanceGPU);
            System.out.println();
        }
    }

    public static Map<String, Float> calculateSelectivitesForAllPairs(Map gasPermeances) {
        SelectivityCalculator selectivityCalculator = new SelectivityCalculator();
        Map<String, Float> calculatedSeletivities = new HashMap<>();
        Set gasSet = gasPermeances.keySet();
        ArrayList gasList = new ArrayList<>(gasSet);

        for (int i = 0; i < gasList.size(); i++) {
            for (int j = 0; j < gasList.size(); j++) {
                float selectivityForThisPair = selectivityCalculator
                        .calculateSelectivity((Float) gasPermeances.get(gasList.get(i)), (Float) gasPermeances.get(gasList.get(j)));
                String selectivityAnnotation = gasList.get(i) + "/" + gasList.get(j);

                if (!(gasList.get(i).equals(gasList.get(j))) && selectivityForThisPair > 1) {
                    calculatedSeletivities.put(selectivityAnnotation, selectivityForThisPair);
                }
            }
        }
        return calculatedSeletivities;
    }
}