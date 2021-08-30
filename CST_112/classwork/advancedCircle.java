
public class advancedCircle {

	double radius;
	static int numberOfCircles = 0;
	
	advancedCircle(double newRadius){
		radius = newRadius;
		numberOfCircles++;
	}
	
	double getArea(){
		return Math.PI * (radius * radius);
	}
	
	public static void main(String[] args) {
		advancedCircle c1 = new advancedCircle(1.0);
		advancedCircle c2 = new advancedCircle(5.0);
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		System.out.println(advancedCircle.numberOfCircles);
	}

}
