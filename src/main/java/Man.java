public class Man implements CanRunAndJump {

    private double runningSpeed;
    private int jumpingHeight;

    public Man(double runningSpeed, int jumpingHeight) {
        this.runningSpeed = runningSpeed;
        this.jumpingHeight = jumpingHeight;
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public int getJumpingHeight() {
        return jumpingHeight;
    }

    public void setJumpingHeight(int jumpingHeight) {
        this.jumpingHeight = jumpingHeight;
    }

    public double run(RunningTrack runningTrack) {
        System.out.println("Человек бежит");
        double timeOfRun = runningTrack.getLengthTrack() / getRunningSpeed();
        double didYouMeetTheDeadline = runningTrack.getLengthTrack()/runningTrack.getTimeTrack() - getRunningSpeed();
        if (didYouMeetTheDeadline > 0)
            System.out.println("Не уложился во времени");
        else
            System.out.println("Уложился во времени");
        return timeOfRun;
    }

    public int jump(Wall wall) {
        System.out.println("Человек прыгает");

        int jumpResult = jumpingHeight - wall.getHeightWall();
        if (jumpResult > 0)
            System.out.println("Преодолел стену!");
        else
            System.out.println("Не преодолел стену!");
        return jumpResult;
    }

}

