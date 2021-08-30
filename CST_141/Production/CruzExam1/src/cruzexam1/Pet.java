package cruzexam1;

/**
 * Dylan Cruz
 * CST141-SP17
 * Exam 1 - Part II
 */
public class Pet extends Animal {
    
    private String name;
    private int age;
    
    public Pet(){
        super();
        name = "Sparky";
        age = 2;
    }
    
    public Pet(String species, String breed, String name, int age){
        super(species, breed);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return super.toString() + " Name: " + this.name + " Age: " + this.age;
    }
}
