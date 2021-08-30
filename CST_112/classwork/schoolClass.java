
public class schoolClass {
	
	private student[] students;
	private String name;
	
	public static void main(String[] Args){
		student dylan = new student("Dylan", 90,92,98);
		student bob = new student("Bob", 82,87,80);
		student steve = new student("Steve", 91,95,89);
		
		student[] students = {dylan, bob, steve};
		schoolClass sc = new schoolClass(students, "Algebra");
		
		System.out.println(sc.getClassAverage());
		System.out.println(sc.getMidtermAverage());
		System.out.println(sc.getMidtermMax());
	}
	
	public schoolClass(student[] students, String name){
		this.students = students;
		this.name = name;
	}
	
	public double getClassAverage(){
		int sum = 0;
		for(int i = 0; i < students.length; i++)
			sum += students[i].getAverage();
		return sum / (students.length + 0.0);
	}
	
	public double getMidtermAverage(){
		int sum = 0;
		for(int i = 0; i < students.length; i++)
			sum += students[i].getMidterm();
		return sum / (students.length + 0.0);
	}
	
	public String getMidtermMax(){
		double max = -1;
		String maxStu = "";
		for(int i = 0; i < students.length; i++){
			if(students[i].getMidterm() > max){
				max = students[i].getMidterm();
				maxStu = students[i].getName();
			}
		}
		return maxStu;
	}

	public String getMidtermMid(){
		double min = 1000.0;
		String minStu = "";
		for(int i = 0; i < students.length; i++){
			if(students[i].getMidterm() < min){
				min = students[i].getMidterm();
				minStu = students[i].getName();
			}
		}
		return minStu;
	}
}
