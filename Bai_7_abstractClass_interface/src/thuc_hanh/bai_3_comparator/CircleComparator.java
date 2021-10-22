package thuc_hanh.bai_3_comparator;
import java.util.Comparator;
import thuc_hanh.bai_2_comparable.*;

public class CircleComparator implements Comparator<Circle> {
	@Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
