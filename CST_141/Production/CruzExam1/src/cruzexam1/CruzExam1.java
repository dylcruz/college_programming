package cruzexam1;

import java.util.Scanner;

/**
 * Dylan Cruz CST141-SP17 Exam 1 - Part II
 */
public class CruzExam1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter species for animal 1: ");
        String animal1Species = scan.nextLine();
        System.out.print("Enter breed for animal 1: ");
        String animal1Breed = scan.nextLine();
        Animal animal1 = new Animal(animal1Species, animal1Breed);

        System.out.print("Enter species for animal 2: ");
        String animal2Species = scan.nextLine();
        System.out.print("Enter breed for animal 2: ");
        String animal2Breed = scan.nextLine();
        Animal animal2 = new Animal(animal2Species, animal2Breed);

        Pet pet[] = new Pet[2];
        pet[0] = new Pet("Dog", "Beagle", "Max", 2);
        pet[1] = new Pet("Cat", "Egyptian", "Felix", 5);
        System.out.println("");
        System.out.println(pet[0].toString());
        System.out.println(pet[1].toString());

        System.out.println("");

        String statement = "I like coffee, I like tee";
        String[] tokens = statement.split(",");
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);

        System.out.println("");

        String stringNum = "345.8";
        double nowANumber = Double.parseDouble(stringNum);
        System.out.println("The converted number is " + nowANumber + " and adding 10 we have " + (nowANumber + 10));

        System.out.println("");

        System.out.print("Enter an integer: ");
        int testInt = scan.nextInt();
        try {
            exceptionTest(testInt);
            System.out.println("You entered: " + testInt);
        } catch (ArithmeticException ex) {
            System.out.println("ERROR: " + testInt);
        }

        System.out.print("Enter an integer: ");
        testInt = scan.nextInt();
        try {
            exceptionTest(testInt);
            System.out.println("You entered: " + testInt);
        } catch (ArithmeticException ex) {
            System.out.println("ERROR: " + testInt);
        }

        System.out.print("Enter an integer: ");
        testInt = scan.nextInt();
        try {
            exceptionTest(testInt);
            System.out.println("You entered: " + testInt);
        } catch (ArithmeticException ex) {
            System.out.println("ERROR: " + testInt);
        }

    }

    public static void exceptionTest(int number) {
        if (number > 10) {
            throw new ArithmeticException("Number > 10");
        }

    }

}
