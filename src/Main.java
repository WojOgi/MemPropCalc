import calculations.SelectivityCalculator;
import communication.Communication;
import membranes.Membrane;

import java.util.*;

import static calculations.Service.calculateSelectivitesForAllPairs;
import static calculations.Service.collectDataFromUser;

public class Main {
    public static void main(String[] args) {

        Communication communication = new Communication();
        Scanner scanner = new Scanner(System.in);

        communication.welcomeMessage();

        communication.queryForActiveMembraneArea();

        Membrane membrane = new Membrane(scanner.nextFloat());
        Map<String, Float> gasPermeances = new HashMap<>();
        List<String> gasList = new ArrayList<>();

        communication.queryForNumberOfGasesMeasured();
        int numberOfGases = scanner.nextInt();

        collectDataFromUser(communication, scanner, membrane, gasPermeances, gasList, numberOfGases);
        System.out.println();
        System.out.println("Table of gas permeances (GPU)");
        for (Map.Entry<String, Float> entry : gasPermeances.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();

        System.out.println("Table of gas ideal selectivities (-)");
        Map<String, Float> selectivities = calculateSelectivitesForAllPairs(gasPermeances);
        for (Map.Entry<String, Float> entry : selectivities.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }
}