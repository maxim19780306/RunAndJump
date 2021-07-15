public class Wall {
    private int heightWall;

    public Wall(int heightWall){
        this.heightWall = heightWall;
    }

    public int getHeightWall() {

        return heightWall;
    }

    public void setHeightWall(int heightWall) {

        this.heightWall = heightWall;
    }

    public double getCanJump(CanRunAndJump canRunAndJump) {
        return canRunAndJump.jump(this);
    }
}
