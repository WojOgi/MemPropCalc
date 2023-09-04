package calculations;

public class SelectivityCalculator {

    float permeanceGasA;
    float permeanceGasB;

    public SelectivityCalculator() {
    }

    public float calculateSelectivity(float permeanceGasA, float permeanceGasB) {
        if (permeanceGasA > permeanceGasB) {
            return permeanceGasA / permeanceGasB;
        }
        return permeanceGasB / permeanceGasA;
    }

    public float getPermeanceGasA() {
        return permeanceGasA;
    }

    public void setPermeanceGasA(float permeanceGasA) {
        this.permeanceGasA = permeanceGasA;
    }

    public float getPermeanceGasB() {
        return permeanceGasB;
    }

    public void setPermeanceGasB(float permeanceGasB) {
        this.permeanceGasB = permeanceGasB;
    }
}
