import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){

    }
    public MovablePoint(float xSpeed, float ySpeed, float x, float y){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{super.getX(),getY(),xSpeed,ySpeed};

    }

    @Override
    public String toString() {
        return "MovablePoint" +Arrays.toString(getSpeed());
    }

    public MovablePoint move(){
        setXY(getX() + xSpeed, getY() + ySpeed) ;// khi muon thay doi thi dung set
        return this;
    }
}