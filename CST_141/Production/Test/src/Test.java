
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class Test{
    
    public static void main(String[] args) throws IOException{
        String utf1 = "";
        int int1;
        int int2;
                
        try(
        DataInputStream input = new DataInputStream(new FileInputStream("exam3input.dat"));
        ){
            utf1 = input.readUTF();
            int1 = input.readInt();
            int2 = input.readInt();           
        }
        
        System.out.println("Exam 3 Cruz " + utf1 + (int1 + int2));
        
        String s = "Exam 3 Cruz" + uf1 
    }
}