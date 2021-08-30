
public class rightTriangle {
	
	double base;
	double height;
	
	public rightTriangle(double newBase, double newHeight){
		base = newBase;
		height = newHeight;
	}
	
	public static void main(String[] args) {
		rightTriangle rt = new rightTriangle(3.6,8.1);
		System.out.println(rt.getArea());
		System.out.println(rt.base);
	}
	
	public double getArea(){
		return (base * height) / 2.0;
	}

}
