package measurements;

public class PermeanceExperiment {

    private final float timeInSeconds;
    private final float volumeInMl;
    private final int pressureInBar;

    public PermeanceExperiment(float timeInSeconds, float volumeInMl, int pressureInBar) {
        this.timeInSeconds = timeInSeconds;
        this.volumeInMl = volumeInMl;
        this.pressureInBar = pressureInBar;
    }

    public float getTimeInSeconds() {
        return timeInSeconds;
    }


    public float getVolumeInMl() {
        return volumeInMl;
    }


    public int getPressureInBar() {
        return pressureInBar;
    }

}
