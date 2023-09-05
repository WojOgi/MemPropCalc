package messaging;

public class Communication {

    public Communication() {
    }

    public void welcomeMessage() {
        System.out.println("Welcome to Membrane Gas Separation Properties Calculator!");
    }

    public void queryForActiveMembraneArea() {
        System.out.println("What is the active area of the membrane?");
    }

    public void queryForNumberOfGasesMeasured(){
        System.out.println("How many gases did you measure?");
    }

    public void queryForGasName(){
        System.out.println("What is the name of the gas to be calculated?");
    }

    public void queryForMeasurementPressure() {
        System.out.println("What is the pressure of the measurement in bar?");
    }

    public void queryForMeasuredVolume() {
        System.out.println("Enter the measured volume:");;
    }
    public void queryForMeasuredTime() {
        System.out.println("Enter the measured time:");;
    }

}
