
public class student {
	
	private double midterm;
	private double finalExam;
	private double project;
	private String name;
	
	public student(String name, double midterm, double project, double finalExam){
		this.name = name;
		this.midterm = midterm;
		this.project = project;
		this.finalExam = finalExam;
	}

	public double getAverage(){
		return (midterm + project + finalExam) / 3.0;
	}

	public double getMidterm(){
		return midterm;
	}
	
	public double getFinal(){
		return finalExam;
	}
	
	public double getProject(){
		return project;
	}
	
	public String getName(){
		return name;
	}
}
