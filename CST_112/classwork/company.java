import java.util.ArrayList;

public class company {
	ArrayList <employee> employees;
	
	public company(ArrayList <employee> employees){
		this.employees = employees;
	}
	
	public static void main(String args[]){
		employee emp1 = new employee("Dylan", 80000, 10000);
		employee emp2 = new employee("Steve", 70000, 15000);
		employee emp3 = new employee("Rick", 85000, 5000);
		
		ArrayList <employee> gEmployees = new ArrayList<employee>();
		gEmployees.add(emp1);
		gEmployees.add(emp2);
		gEmployees.add(emp3);
		
		company google = new company(gEmployees);
		
		System.out.println(google.totalSalaries());
		System.out.println(google.totalProfit());
		
		employee emp4 = new employee("Tom", 110000, 20000);
		
		google.hireEmployee(emp4);
		//google.fireEmployee(emp3);
		
		System.out.println(google.mostProfitable());
	}

	public double totalSalaries(){
		double sum = 0;
		for(int i = 0; i < employees.size(); i++)
			sum += employees.get(0).getSalary();
		return sum;
	}

	public double totalProfit(){
		double sum = 0;
		for(int i = 0; i < employees.size(); i++)
			sum += employees.get(i).getRevenue();
		return sum;
	}
	
	public String mostProfitable(){
		String emp = "";
		double highest = 0;
		for(int i = 0; i < employees.size(); i++){
			if(employees.get(i).getRevenue() > highest){
				highest = employees.get(i).getRevenue();
				emp = employees.get(i).getName();
			}
		}
		return emp;
	}
	
	public void hireEmployee(employee e){
		employees.add(e);
	}

	/*public void fireEmployee(employee e){
		employees.remove(e);
	}*/
}
