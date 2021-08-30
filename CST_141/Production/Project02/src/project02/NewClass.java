import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
/**
* Class: ReadFileFromWebOutputSummaryToFile.java
* By: Prof. H. - CST141 – Spring 2017
*
* Description: Program to show some logical processes required for Project 02.
*
* @author hassile
*/
public class NewClass
{
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args)
 {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter a URL: ");
 String url = input.nextLine();
 processFile(url); // Traverse the Web from the a starting url
 }
 private static void processFile(String urlString)
 {
 try
 {
 URL url = new URL(urlString); //URL as a source for I/O
 File outputFilename = new File("ProfHCST141Project02Output.txt");
 PrintWriter outputToFile; //Output file
 Scanner inputFromFile; //Input File
 int linesWithAtLeastOneWord = 0;
 String inputLine;
 String[] wordSubstrings;

 //Read in the lines from the file on the Web and update counters

 inputFromFile = new Scanner(url.openStream()); //Open Input File
 while (inputFromFile.hasNextLine())
 {
 inputLine = inputFromFile.nextLine();
 wordSubstrings = inputLine.split("\\s");
 if (wordSubstrings.length > 0)
 {
 linesWithAtLeastOneWord++;
 }
 }

 //Output the results to a file
 if (outputFilename.exists())
 {
 System.out.println("ProfHCST141FA15Project02Output.txt "+
 "already exists. Overwriting file!");
 }
 outputToFile = new PrintWriter(outputFilename);
 outputToFile.println("Prof. Hassildine, CST141");
 outputToFile.println("Project #02 Example Processes #1");
 outputToFile.println("");
 outputToFile.println("");
 outputToFile.println("# of lines with at least 1 word in it: " +
 linesWithAtLeastOneWord);
 outputToFile.println("Total # of lines: hint-simply count lines " +
 "read in using a variable.");
 outputToFile.println("Characters: hint-simply total the length " +
 "of the String read in each time.");
 outputToFile.println("Word in file: hint-simply total length of " +
 "each wordStrings[] array above ... or whatever you call your " +
 "array.");
 outputToFile.println("The arrayLists were not demonstrated here.");
 outputToFile.close();
 }
 catch(Exception e)
 {
 System.out.println("ERROR: " + e);
 }

 } //processFile() method.

} //ReadFileFromWebOutputSummaryToFile class.
