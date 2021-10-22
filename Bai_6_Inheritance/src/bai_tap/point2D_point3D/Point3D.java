package bai_tap.point2D_point3D;

public class Point3D extends Point2D {
private float z ;
	
	public Point3D() {
	
	}
	
	public Point3D(float x, float y , float z) {
		super(x,y);
		this.z = z;
	}
	
	public float getZ() {
		return this.z;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	

	public void setXYZ(float x,float y, float z) {
		setXY(x, y);
		this.z = z;
	}
	
	public float [] getXYZ () {
		float []array = new float[3];
		getXY();
		array[2] = this.z;
		return array;
	}
	
	public String toString() {
		return "(x,y,z) = "+"(" + super.getX() + "," + super.getY() + "," + this.z + ")"; 
	}
}
