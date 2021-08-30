
public class personTest {

	public static void main(String[] args) {
		Person p = new Person("Dylan", "123 Elm St", "631-555-1234", "test@test.net");
		System.out.println(p.toString());
		
		Student s = new Student("Steve", "test", "test", "test", "freshman");
		System.out.println(s.toString());
		
		Employee e = new Employee("Joe", null, null, null, 0, null, null);
		System.out.println(e.toString());
		
		Faculty f = new Faculty("Rick", null, null, null, 0, null, null, null, null);
		System.out.println(f.toString());
		
		Staff st = new Staff("Bob", null, null, null, 0, null, null, null);
		System.out.println(st.toString());
	}

}
