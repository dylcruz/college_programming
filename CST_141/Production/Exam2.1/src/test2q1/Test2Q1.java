package test2q1;

public class Test2Q1
{
    public static void main(String[] args)
    {
        int houseIndex = 0;
        House[] houses = new House[5];
        
        houses[0] = new House(0,.25,2400.0,5.0);
        //have student create a clone for houses[1] but must modify
        //the clone method in House.java to perform a Deep Copy:
        //pages 515 - 516.
        houses[1] = (House)houses[0].clone();
        houses[2] = new House(2,1.5,3200.0,6.0);
        houses[3] = new House(3,.25,2400.0,4.0);
        houses[4] = new House(4,6.0,1200.0,2.0);
        java.util.Arrays.sort(houses);
        for (houseIndex = 0; houseIndex < houses.length; houseIndex++)
        {
            System.out.println("House #" + houseIndex + ": " +
                houses[houseIndex].toString());
        }
    }
    
}