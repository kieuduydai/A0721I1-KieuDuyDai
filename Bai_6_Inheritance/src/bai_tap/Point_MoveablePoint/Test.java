package bai_tap.Point_MoveablePoint;


public class Test {
	public static void main(String[] args) {
    	Point unknownPoint = new Point(20,30);
        System.out.println(unknownPoint);
        
        unknownPoint.setXY(10,20);
        System.out.println(unknownPoint);
        
        unknownPoint = new MoveAblePoint(unknownPoint.getX(),unknownPoint.getY(),10,20);
        System.out.println(unknownPoint);
        
        ((MoveAblePoint) unknownPoint).move();
        System.out.println(unknownPoint);
        
        MoveAblePoint anotherPoint = new MoveAblePoint(20,20);
        System.out.println(anotherPoint);
        
        anotherPoint.move();
        System.out.println(anotherPoint);
        System.out.println(anotherPoint);
        
	}
}
