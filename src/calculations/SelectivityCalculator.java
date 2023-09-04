package calculations;

public class SelectivityCalculator {

    public SelectivityCalculator() {
    }

    public float calculateSelectivity(float permeanceGasA, float permeanceGasB) {

        return permeanceGasA / permeanceGasB;
    }


}
