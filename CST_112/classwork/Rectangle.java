
public class Rectangle {

	double width = 1.0;
	double height = 1.0;
	
	Rectangle(){
		
	}
	
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	double getArea(){
		return width * height;
	}
	
	double getPerimeter(){
		return (2 * width) + (2 * height);
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5.0,5.0);
		
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
	}

}
