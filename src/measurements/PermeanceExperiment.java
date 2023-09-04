package measurements;

public class PermeanceExperiment {

    private float timeInSeconds;
    private float volumeInMl;
    private int pressureInBar;

    public PermeanceExperiment(float timeInSeconds, float volumeInMl, int pressureInBar) {
        this.timeInSeconds = timeInSeconds;
        this.volumeInMl = volumeInMl;
        this.pressureInBar = pressureInBar;
    }

    public float getTimeInSeconds() {
        return timeInSeconds;
    }

    public void setTimeInSeconds(float timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public float getVolumeInMl() {
        return volumeInMl;
    }

    public void setVolumeInMl(float volumeInMl) {
        this.volumeInMl = volumeInMl;
    }

    public int getPressureInBar() {
        return pressureInBar;
    }

    public void setPressureInBar(int pressureInBar) {
        this.pressureInBar = pressureInBar;
    }
}
