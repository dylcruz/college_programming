package snippetw10a;

import java.io.File;
import java.util.Scanner;
/**
* SnippetW10 - Program to read entire lines of text as Strings from
* a text file using the Scanner Class. Throws a Custom Exception
* By Prof. Hassildine - CST141-SP17
* Modified by: Dylan Cruz
* Due: 4/9/17
*
* Note: Set the Working Directory under Properties/Run
* for the Project to the package folder of the src folder. 
*/
public class SnippetW10
{
   /**
   * @param args the command line arguments
   */
   public static void main(String[] args)
   {
      String inputRecord, formattedInt, field[];
      int recordNumber = 0;
      Scanner inputFile;
      //Attempt to open the file. If successful, read in a record (line),
      //print out the line (String) read in, and get the next line if one
      //exists.
      try
      {
         inputFile = new Scanner(new File("studentdatawitherrors.txt"));
         while(inputFile.hasNextLine())
         {
            recordNumber++;
            formattedInt = String.format("%2d",recordNumber);
            inputRecord = inputFile.nextLine();
            field = inputRecord.split(",");
            try{
                testLength(field);
                System.out.println("Record #"+formattedInt+": "+inputRecord);
            }
            catch (InvalidFieldCountException ex){
                System.out.println("Error with record " + recordNumber + "! " + ex);
            }
         }
      }
      catch (Exception e)
      {
         System.out.println("Error! Problem opening file.\nError was: " + e);
      }
   } //main() method.
   
   public static void testLength(String field[]) throws InvalidFieldCountException{
       if(field.length != 8){
           throw new InvalidFieldCountException(field.length);
       }
   }
   
} //SnippetW10 Class.