package Gas;

import measurements.PermeanceExperiment;

public class Gas {

    private String gasName;

    private PermeanceExperiment permeanceExperiment;

    public Gas(String gasName) {
        this.gasName = gasName;
    }

    public Gas(String gasName, PermeanceExperiment permeanceExperiment) {
        this.gasName = gasName;
        this.permeanceExperiment = permeanceExperiment;
    }

    public Gas() {
    }

    public String getGasName() {
        return gasName;
    }

    public void setGasName(String gasName) {
        this.gasName = gasName;
    }

    public PermeanceExperiment getPermeanceExperiment() {
        return permeanceExperiment;
    }

    public void setPermeanceExperiment(PermeanceExperiment permeanceExperiment) {
        this.permeanceExperiment = permeanceExperiment;
    }
}
