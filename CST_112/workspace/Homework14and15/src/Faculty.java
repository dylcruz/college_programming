import java.util.Date;

public class Faculty extends Employee {

	private String officeHours;
	private String rank;
	
	public Faculty(String name, String address, String phone, String email, int salary, String office, Date hireDate, String officeHours, String rank) {
		super(name, address, phone, email, salary, office, hireDate);
		this.officeHours = officeHours;
		this.rank = rank;
		
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		return rank;
	}

	public String toString(){
		return this.getClass().getName() + " " + this.getName();
	}
}
