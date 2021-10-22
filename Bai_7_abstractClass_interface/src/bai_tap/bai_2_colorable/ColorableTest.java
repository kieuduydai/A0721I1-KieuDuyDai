package bai_tap.bai_2_colorable;

public class ColorableTest {
	public static void main(String[] args) {
        
		Shape[] shapes = new Shape[4];
		shapes[0] = new Square(4);
		shapes[1] = new Circle(2);
		shapes[2] = new Circle(5);
		shapes[3] = new Rectangle(7,6);
		
		for(Shape shape : shapes) {
			System.out.println(shape.getArea());
			
			if (shape instanceof Square)
			{
				Colorable obj = (Square) shape;
				System.out.println(obj.howToColor());
			}
			
		}
		
    }
}
