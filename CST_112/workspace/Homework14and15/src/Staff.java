import java.util.Date;

public class Staff extends Employee {

	private String title;
	
	public Staff(String name, String address, String phone, String email, int salary, String office, Date hireDate, String title) {
		super(name, address, phone, email, salary, office, hireDate);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String toString(){
		return this.getClass().getName() + " " + this.getName();
	}
}
