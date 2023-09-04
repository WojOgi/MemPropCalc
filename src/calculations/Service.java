package calculations;

import Gas.Gas;
import communication.Communication;
import measurements.PermeanceExperiment;
import membranes.Membrane;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Service {
    public Service() {
    }
    public static void collectDataFromUser(Communication communication, Scanner scanner, Membrane membrane, Map<String, Float> gasPermeances, List<String> gasList, int numberOfGases) {
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
        }
    }

}
