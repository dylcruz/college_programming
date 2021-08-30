
public class employee {
	private String name;
	private double salary;
	private double revenue;
	
	public employee(String name, double salary, double revenue){
		this.name = name;
		this.salary = salary;
		this.revenue = revenue;
	}

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}
	
	public double getRevenue(){
		return revenue;
	}
}
