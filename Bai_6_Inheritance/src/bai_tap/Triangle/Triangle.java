package bai_tap.Triangle;

import thuc_hanh.*;

public class Triangle extends Shape {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
	 
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(String color, boolean filled,double side1, double side2, double side3 ) {
		super(color,filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	//side1
	public double getSide1() {
		return this.side1;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	//side2
	public double getSide2() {
		return this.side2;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	//side3
	public double getSide3() {
		return this.side3;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public double getArea() {
		double halfPerimeter = getPerimeter()/2.0;
		return Math.sqrt(halfPerimeter*(halfPerimeter-this.side1)*(halfPerimeter-this.side2)*(halfPerimeter-this.side3));
	}
	
	public String toString() {
		return "A Triangle with 3 side\n"
				+ "side1 = " +getSide1()
				+ "\nside2 = " +getSide2()
			    + "\nside3 = " +getSide3()
			    + ", which is a subclass of "
                + super.toString();
	}
	
}