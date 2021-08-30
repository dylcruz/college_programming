
public class Student extends Person {
	
	private final String classStatus;
	
	public Student(String name, String address, String phone, String email, String classStatus) {
		super(name, address, phone, email);
		this.classStatus = classStatus;
		
	}

	public String getClassStatus() {
		return classStatus;
	}
	
	public String toString(){
		return this.getClass().getName() + " " + this.getName();
	}
	
}
