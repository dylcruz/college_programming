package cruzexam1;

/**
 * Dylan Cruz
 * CST141-SP17
 * Exam 1 - Part II
 */
public class Animal {
    private String species;
    private String breed;
    
    public Animal(){
        species = "dog";
        breed = "lab";
    }
    
    public Animal(String species, String breed){
        this.species = species;
        this.breed = breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String toString(){
        return "Species: " + this.species + " Breed: " + this.breed;
    }
}
