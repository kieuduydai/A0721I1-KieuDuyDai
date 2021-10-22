package thuc_hanh.bai_2_comparable;

public class ComparableCircle extends Circle
implements Comparable<ComparableCircle> {
	
	public ComparableCircle() {
	}

	public ComparableCircle(double radius) {
		super(radius);
	}

	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
	}

	@Override
	public int compareTo(ComparableCircle obj) {
		if (getRadius() > obj.getRadius()) return 1;
		else if (getRadius() < obj.getRadius()) return -1;
		else return 1;
	}
}
