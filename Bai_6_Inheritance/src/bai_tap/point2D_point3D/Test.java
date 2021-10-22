package bai_tap.point2D_point3D;

public class Test {
	public static void main(String[] args) {
		Point3D obj = new Point3D(3,3,3);
		System.out.print(obj+"\n");
		
		
		for(int i = 0; i< obj.getXYZ().length ; i++) {
			System.out.print(obj.getXYZ()[i]+"\t");
		}
		
		Point2D obj1 = new Point2D(2,1);
		System.out.println("\n"+obj1+")");
		
	}
}
