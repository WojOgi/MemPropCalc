import membranes.Membrane;
import messaging.Communication;
import messaging.Printer;

import java.util.*;

import static calculations.Service.collectDataFromUser;

public class Main {
    public static void main(String[] args) {

        Communication communication = new Communication();
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();

        communication.welcomeMessage();

        communication.queryForActiveMembraneArea();

        Membrane membrane = new Membrane(scanner.nextFloat());

        Map<String, Float> gasPermeances = new HashMap<>();
        List<String> gasList = new ArrayList<>();
        Integer numberOfGases;


        try {
            communication.queryForNumberOfGasesMeasured();

            numberOfGases = scanner.nextInt();
            collectDataFromUser(communication, scanner, membrane, gasPermeances, gasList, numberOfGases);

            printer.createATableOfSelectivities(gasPermeances);
            printer.createATableOfPermeances(gasPermeances);

        } catch (InputMismatchException e) {
            System.out.println("Input has to be an integer! Restart the progam.");

        }
    }
}