package bai_tap.circle_cylinder;

public class Cylinder extends Circle {
private double height = 1.0;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double radius , String color , double height) {
		super(radius,color);
		this.height = height;
	}
	
	public double getHeight () {
		return this.height;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	public double getVolume() {
		return getArea() * this.height;
	}
	
	
	@Override
	public String toString() {
		return "A Cylinder with height = " + getHeight() + 
				", which is a subclass of " + super.toString() + 
				" and volume = " + getVolume() + " m3";
	}
}
