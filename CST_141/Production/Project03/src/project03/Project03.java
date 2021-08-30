package project03;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Project03 - JavaFX Application to view information in a text file
 *             in form view. Template by Prof. Hassildine.
 * Name: Dylan Cruz
 * CST141 - FA17
 * Due: 5/01 by 11:59PM
 *
 * @author Dylan Cruz
 */
public class Project03 extends Application
{
    private TextField tfCourse;
    private TextField tfLastName;
    private TextField tfFirstName;
    private TextField tfQuiz1;
    private TextField tfQuiz2;
    private TextField tfQuiz3;
    private TextField tfMidterm;
    private TextField tfFinal;
    private TextField tfFinalGrade;
    private TextField tfLetterGrade;
    private Label lblRecordNumber;
    private Label lblMainTitle;
    private ArrayList<String> fileRecords;
    private int currentRecordIndex;
        
    @Override
    public void start(Stage primaryStage)
    {
        int top, right, bottom, left;
        
        String[] fields;
        
        try
        {
            fileRecords = getRecords();
            setFields(0);
        }
        catch (Exception e)
        {
            System.out.println("Error! Problem opening file.\nError was: " + e);
        }   
        
        GridPane centerPane = new GridPane();
        centerPane.setHgap(5);
        centerPane.setVgap(5);
        centerPane.setPadding(new Insets(top = 25, right = 10, bottom = 10,
           left = 10));
        
        Label lblCourse = new Label("Course:");
        lblCourse.setTextFill(Color.WHITE);
        centerPane.add(lblCourse,0,0);
        centerPane.add(tfCourse,1,0);
        Label lblLastName = new Label("Last Name:");
        lblLastName.setTextFill(Color.WHITE);
        centerPane.add(lblLastName,0,1);
        centerPane.add(tfLastName,1,1);
        Label lblFirstName = new Label("First Name:");
        lblFirstName.setTextFill(Color.WHITE);
        centerPane.add(lblFirstName,0,2);
        centerPane.add(tfFirstName,1,2);
        
        //Add text fields (Step 1)
        Label lblQuiz1 = new Label("Quiz 1:");
        lblQuiz1.setTextFill(Color.WHITE);
        centerPane.add(lblQuiz1,0,3);
        centerPane.add(tfQuiz1,1,3);
        Label lblQuiz2 = new Label("Quiz 2:");
        lblQuiz2.setTextFill(Color.WHITE);
        centerPane.add(lblQuiz2,0,4);
        centerPane.add(tfQuiz2,1,4);
        Label lblQuiz3 = new Label("Quiz 3:");
        lblQuiz3.setTextFill(Color.WHITE);
        centerPane.add(lblQuiz3,0,5);
        centerPane.add(tfQuiz3,1,5);
        Label lblMidterm = new Label("Midterm:");
        lblMidterm.setTextFill(Color.WHITE);
        centerPane.add(lblMidterm,0,6);
        centerPane.add(tfMidterm,1,6);
        Label lblFinal = new Label("Final:");
        lblFinal.setTextFill(Color.WHITE);
        centerPane.add(lblFinal,0,7);
        centerPane.add(tfFinal,1,7);
        Label lblFinalGrade = new Label("Final Grade:");
        lblFinalGrade.setTextFill(Color.WHITE);
        centerPane.add(lblFinalGrade,0,8);
        centerPane.add(tfFinalGrade,1,8);
        Label lblLetterGrade = new Label("Letter Grade:");
        lblLetterGrade.setTextFill(Color.WHITE);
        centerPane.add(lblLetterGrade,0,9);
        centerPane.add(tfLetterGrade,1,9);
        
        Button butPrevious = new Button("<-Previous");
        butPrevious.setStyle("-fx-background-color: #ffff4f");
        butPrevious.setId("PreviousButton");
        butPrevious.setOnAction(defineActionEvent("PreviousButton"));
        
        Button butNext = new Button("Next->");
        butNext.setStyle("-fx-background-color: #ffff4f");
        butNext.setId("NextButton");
        butNext.setOnAction(defineActionEvent("NextButton"));
        
        //Setup first and last buttons (Step 5)
        Button butFirst = new Button("|<- First");
        butFirst.setStyle("-fx-background-color: #89bcff");
        butFirst.setId("FirstButton");
        butFirst.setOnAction(defineActionEvent("FirstButton"));
        
        Button butLast = new Button("Last ->|");
        butLast.setStyle("-fx-background-color: #89bcff");
        butLast.setId("LastButton");
        butLast.setOnAction(defineActionEvent("LastButton"));
        
        //Define HBox and it's properties (Step 4)
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(top = 10, right = 10, bottom = 10, 
            left = 10));
        hbox.getChildren().addAll(butFirst, butPrevious, butNext, butLast);
                
        lblRecordNumber.setTextFill(Color.WHITE);
        centerPane.add(lblRecordNumber,1,11);       
        
        //Define BorderPane and it's properties (Step 3)
        BorderPane mainBorderPane = new BorderPane();
        lblMainTitle.setText("Cruz's Project #3");
        lblMainTitle.setFont(new Font(20));
        lblMainTitle.setTextFill(Color.AQUA);
        mainBorderPane.setPadding(new Insets(top = 10, right = 10, bottom = 10,
            left = 10));
        BorderPane.setAlignment(lblMainTitle, Pos.CENTER);
        mainBorderPane.setTop(lblMainTitle);
        mainBorderPane.setCenter(centerPane);
        mainBorderPane.setBottom(hbox);
        mainBorderPane.setStyle("-fx-background-color: #000000;");
        
        //Set properties of UI Nodes
        tfCourse.setEditable(false);
        tfLastName.setEditable(false);
        tfFirstName.setEditable(false);
        GridPane.setHalignment(butPrevious, HPos.LEFT);
        GridPane.setHalignment(butNext, HPos.RIGHT);
        GridPane.setHalignment(lblRecordNumber, HPos.RIGHT);
               
        Scene mainScene = new Scene(mainBorderPane, 375, 475);
        
        primaryStage.setTitle("Student Record Viewer");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    
    public Project03()
    {
        tfCourse = new TextField();
        tfLastName = new TextField();
        tfFirstName = new TextField();
        tfQuiz1 = new TextField();
        tfQuiz2 = new TextField();
        tfQuiz3 = new TextField();
        tfMidterm = new TextField();
        tfFinal = new TextField();
        tfFinalGrade = new TextField();
        tfLetterGrade = new TextField();
        lblRecordNumber = new Label();
        lblMainTitle = new Label();
        currentRecordIndex = 0;
    } //Project03 Constructor
    
    private EventHandler<ActionEvent> defineActionEvent(final String forNode)
    {
        EventHandler<ActionEvent> theHandlerObject = null;

        theHandlerObject = new EventHandler<ActionEvent>() {
            
           @Override
           public void handle(ActionEvent event) 
           {
               switch (forNode)
               {
                   case "PreviousButton":
                      if (currentRecordIndex > 0)
                      {
                          currentRecordIndex--;
                          setFields(currentRecordIndex);
                      }
                      else
                      {
                          System.out.println("Reached BEGINNING of Records.");
                      }
                      break;
                   case "NextButton":
                      if (currentRecordIndex < (fileRecords.size() -1))
                      {
                          currentRecordIndex++;
                          setFields(currentRecordIndex);
                      }
                      else
                      {
                          System.out.println("Reached END of Records.");
                      }
                      break;
                   case "FirstButton":
                       if (currentRecordIndex == 0)
                       {
                           System.out.println("You're already at the first " + 
                                   "record.");
                       }
                       else
                       {
                           currentRecordIndex = 0;
                           setFields(currentRecordIndex);
                       }
                       break;
                   case "LastButton":
                       if (currentRecordIndex == fileRecords.size() - 1)
                       {
                           System.out.println("You're already at the last " + 
                                   "record.");
                       }
                       else
                       {
                           currentRecordIndex = fileRecords.size() - 1;
                           setFields(currentRecordIndex);
                       }
                       break;
                   default:
                      System.out.println("Error. Undefined object.");
                      break;
               }
           }
        };
        
        return theHandlerObject;
    } //defineActionEventdefineActionEvent() method.
    
    private static ArrayList<String> getRecords() throws Exception
    {
        ArrayList<String> theRecords = new ArrayList<>();
        Scanner inputFile;
        
        inputFile = new Scanner(new File("studentdata.txt"));
        while(inputFile.hasNextLine())
        {
           theRecords.add(inputFile.nextLine());
        }
        
        return theRecords;
    }
    
    private void setFields(int theIndex)
    {
       String[] fields = fileRecords.get(theIndex).split(",");
        
       //Determine final grade and leter grade (Step 2)
       double q1 = Double.parseDouble(fields[3]);
       double q2 = Double.parseDouble(fields[4]);
       double q3 = Double.parseDouble(fields[5]);
       double midterm = Double.parseDouble(fields[6]);
       double finalTest = Double.parseDouble(fields[7]);
       String letterGrade = "";
       
       double quizGrade = (((q1 * 10) + (q2 * 10) + (q3 * 10)) / 3) * .30;
       double midtermGrade = midterm * .35;
       double finalTestGrade = finalTest * .35;
       double finalGrade = Math.round(quizGrade + midtermGrade + 
            finalTestGrade);
       
       if(finalGrade >= 90){
           letterGrade = "A";
       }
       else if(finalGrade >= 85){
           letterGrade = "B+";
       }
       else if(finalGrade >= 80){
           letterGrade = "B";
       }
       else if(finalGrade >= 75){
           letterGrade = "C+";
       }
       else if(finalGrade >= 70){
           letterGrade = "C";
       }
       else if(finalGrade >= 65){
           letterGrade = "D+";
       }
       else if(finalGrade >= 60){
           letterGrade = "D";
       }
       else{
           letterGrade = "F";
       }
       
       tfCourse.setText(fields[0]);
       tfLastName.setText(fields[1]);
       tfFirstName.setText(fields[2]);
       tfQuiz1.setText(fields[3]);
       tfQuiz2.setText(fields[4]);
       tfQuiz3.setText(fields[5]);
       tfMidterm.setText(fields[6]);
       tfFinal.setText(fields[7]);
       tfFinalGrade.setText(String.valueOf(finalGrade));
       tfLetterGrade.setText(letterGrade);
       lblRecordNumber.setText(String.format("Record #%3d",
            theIndex));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}