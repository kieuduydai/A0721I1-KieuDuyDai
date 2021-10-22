package bai_tap.Point_MoveablePoint;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    public MoveAblePoint() {
    	
    }
    
    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MoveAblePoint(float[] array) {
        super(array[0], array[1]);
    }
    
    public double getxSpeed() {
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

    public MoveAblePoint move() {
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = {this.xSpeed, this.ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return super.toString() +
                "+ speed: (" + this.xSpeed + "," + this.ySpeed + ")" + "\n";
    }
    
}
