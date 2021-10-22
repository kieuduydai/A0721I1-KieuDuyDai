package bai_tap.point2D_point3D;

public class Point2D {
	private float x = 0.0f;
	private float y = 0.0f;
	
	public Point2D() {
	
	}
	
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public float [] getXY() {
		float []array = new float [2];
		array[0] = this.x;
		array[1] = this.y;
		return array;
	}
	
	public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
	
	public String toString() {
		return "(x,y) = "+"("+ this.x + "," + this.y;
	}

}
