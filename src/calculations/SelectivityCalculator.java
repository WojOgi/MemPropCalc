package calculations;

public class SelectivityCalculator {

    float permeanceGasA;
    float permeanceGasB;

    public SelectivityCalculator() {
    }

    public float calculateSelectivity(float permeanceGasA, float permeanceGasB) {

        return permeanceGasA / permeanceGasB;
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
