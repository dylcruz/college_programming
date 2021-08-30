import java.util.Date;
import javafx.geometry.Point2D;
public class dateAndPointTest {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.toString());
		Date d2 = new Date();
		System.out.println(d2.after(d1));
		
		Point2D p1 = new Point2D(4, 2);
		System.out.println(p1.toString());
		Point2D p2 = new Point2D(8.5, 9.2);
		System.out.println(p2.toString());
		System.out.println(p1.distance(p2));
		System.out.println(p1.add(p2));
	}

}
