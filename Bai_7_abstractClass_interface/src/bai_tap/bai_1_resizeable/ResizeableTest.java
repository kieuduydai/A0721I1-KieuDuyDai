package bai_tap.bai_1_resizeable;
import thuc_hanh.bai_2_comparable.*;

public class ResizeableTest {
	public static void main(String[] args) {
        
		Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Square(9);
        shapes[2] = new Rectangle(4, 1);
        System.out.println("Pre-resized is a area: ");
        
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle: "+((Circle) shape).getArea());
            }else if(shape instanceof Square){
                System.out.println("Square: "+((Square)shape).getArea());
            }
            else {
                System.out.println("Rectangle: "+((Rectangle) shape).getArea());
            }
        }

        System.out.println("\nAfter resized is a area: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(7);
                System.out.println("Circle: "+((Circle) shape).getArea());
            }else if(shape instanceof Square){
                ((Square) shape).resize(2);
                System.out.println("Square: "+((Square)shape).getArea());
            }
            else {
                ((Rectangle) shape).resize(3);
                System.out.println("Rectangle: "+((Rectangle) shape).getArea());
            }
        }
    }
}
