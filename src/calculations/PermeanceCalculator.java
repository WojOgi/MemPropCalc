package calculations;

import measurements.PermeanceExperiment;
import membranes.Membrane;

public class PermeanceCalculator {

    private Membrane membrane;

    private PermeanceExperiment permeanceExperiment;

    public PermeanceCalculator(Membrane membrane, PermeanceExperiment permeanceExperiment) {
        this.membrane = membrane;
        this.permeanceExperiment = permeanceExperiment;
    }

    public float calculatePermeance() {
        float flux = permeanceExperiment.getVolumeInMl() / permeanceExperiment.getTimeInSeconds();
        float pressureHg = permeanceExperiment.getPressureInBar() * 75.00617F;
        float permeanceT = flux / (membrane.getActiveArea() * pressureHg);

        return permeanceT / 0.000001F;
    }

    public Membrane getMembrane() {
        return membrane;
    }

    public void setMembrane(Membrane membrane) {
        this.membrane = membrane;
    }

    public PermeanceExperiment getPermeanceExperiment() {
        return permeanceExperiment;
    }

    public void setPermeanceExperiment(PermeanceExperiment permeanceExperiment) {
        this.permeanceExperiment = permeanceExperiment;
    }
}
