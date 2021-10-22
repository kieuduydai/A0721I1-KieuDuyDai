package bai_tap.Triangle;

public class Test {
	public static void main(String[] args) {
		Triangle obj = new Triangle("red",true,3,4,5);
		System.out.print(obj);
		System.out.print("\nArea = " +obj.getArea());
		System.out.print("\nPerimeter = " +obj.getPerimeter());
	}
}
