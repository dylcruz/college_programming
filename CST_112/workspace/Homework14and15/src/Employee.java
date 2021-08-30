import java.util.Date;
public class Employee extends Person {

	private int salary;
	private String office;
	private Date hireDate = new Date();
	
	public Employee(String name, String address, String phone, String email, int salary, String office, Date hireDate) {
		super(name, address, phone, email);
		this.salary = salary;
		this.office = office;
		this.hireDate = hireDate;
	}

	public int getSalary() {
		return salary;
	}


	public String getOffice() {
		return office;
	}


	public Date getHireDate() {
		return hireDate;
	}

	public String toString(){
		return this.getClass().getName() + " " + this.getName();
	}
}
