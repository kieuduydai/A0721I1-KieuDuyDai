package bai_tap;
import java.util.Scanner;

public class Quadratic2 {
	public static Scanner sc = new Scanner(System.in);
	
	private double a,b,c;
	
	public Quadratic2() {
	}
	
	public Quadratic2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminant() {
		return (this.b*this.b) - (4*this.a*this.c); 
	}
	
	public double getRoot1() {
		return (-this.b + Math.sqrt(getDiscriminant()))/(2*this.a);
	}
	
	public double getRoot2() {
		return (-this.b - Math.sqrt(getDiscriminant()))/(2*this.a);
	}
	public static void main(String[] args) {
		System.out.print("Nhap a:");
		double a = sc.nextDouble();
		
		System.out.print("Nhap b:");
		double b = sc.nextDouble();
		
		System.out.print("Nhap c:");
		double c = sc.nextDouble();
		
		Quadratic2 obj = new Quadratic2(a,b,c);
		
		
		if( obj.getDiscriminant() < 0 ) 
			System.out.print("Pt co vo nghiem");
		
		else if ( obj.getDiscriminant() == 0 ) 
			System.out.print("Pt co 1 nghiem kep x = "+ obj.getRoot1());
		
		else {
			System.out.print("Pt co 2 nghiem phan biet\n");
			System.out.print("x1 = "+obj.getRoot1());
			System.out.print("\nx2 = "+obj.getRoot2());
		}
	}
	
}