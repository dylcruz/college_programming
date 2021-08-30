
public class MyPoint {
	double x, y;
	
	public MyPoint(){
		this(0.0,0.0);
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public static void main(String[] args){
		MyPoint p1 = new MyPoint(0,0);
		MyPoint p2 = new MyPoint(10,30.5);
		
		System.out.println(p1.distance(p1, 10, 30.5));
		System.out.println(p1.distance(p1, p2));
	}

	public double distance(MyPoint p1, double x, double y){
		return Math.sqrt(Math.pow(x - p1.getX(), 2) + Math.pow(y - p1.getY(), 2));
	}
	
	public double distance(MyPoint p1, MyPoint p2){
		return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
	}
}
