package bai_tap;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
	}
	
	public Circle(double r){
		this.radius = r;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public double setRadius(double r){
		return this.radius = r;
	}
	
	
	public double getArea(){
		return this.radius*this.radius*Math.PI;
	}
	public String toString() {
        return "r = " + getRadius() + "\n" + "area = " +getArea();
    }
}
