package bai_tap.circle_cylinder;

public class Circle {
	private double radius;
	private String color = "yellow";
	
	public Circle() {
    }

    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
    	return this.color;
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
    
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    @Override
    public String toString() {
    	return "A Circle with color of "+ getColor() + " ,radius = " + getRadius() + " m" ;
    }
}
