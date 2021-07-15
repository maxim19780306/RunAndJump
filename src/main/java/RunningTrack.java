public class RunningTrack {
    private double lengthTrack;
    private double timeTrack;

    public RunningTrack(double lengthTrack, double timeTrack) {
        this.lengthTrack = lengthTrack;
        this.timeTrack = timeTrack;

    }


    public double getLengthTrack() {
        return lengthTrack;
    }


    public void setLengthTrack(double lengthTrack) {
        this.lengthTrack = lengthTrack;

    }

    public double getTimeTrack() {

        return timeTrack;
    }


    public void setTimeTrack(double timeTrack) {
        this.timeTrack = timeTrack;
    }

    public double getTimeToOvercomeTrack(CanRunAndJump canRunAndJump) {
        return canRunAndJump.run(this);
    }
}
