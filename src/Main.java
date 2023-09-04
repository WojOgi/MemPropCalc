import calculations.SelectivityCalculator;
import communication.Communication;
import membranes.Membrane;

import java.util.*;

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

        System.out.println(gasPermeances);

        System.out.println("Do you want to calculate selectivity?");
        String query = scanner.next();

        while (!query.equals("No")) {
            communication.whichSelectivityDoYouNeed();
            String gas1 = scanner.next();
            String gas2 = scanner.next();
            SelectivityCalculator selectivityCalculator = new SelectivityCalculator();
            float selectivity = selectivityCalculator
                    .calculateSelectivity(gasPermeances.get(gas1), gasPermeances.get(gas2));
            System.out.println("The selectivity for gas pair: " + gas1 + " and " + gas2 + " is: " + selectivity);
            System.out.println(gasPermeances);
            communication.needContinue();
            query = scanner.next();
        }
    }
}