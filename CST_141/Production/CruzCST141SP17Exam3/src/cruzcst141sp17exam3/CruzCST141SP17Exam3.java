package cruzcst141sp17exam3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author Dylan Cruz
 * CST 141 - SP17
 * Exam 3
 */
public class CruzCST141SP17Exam3 extends Application {
    
    private Label facInputLabel = new Label ("Positive Input #: ");
    private Label facResultLabel = new Label ("Result: ");
    private Label errorLabel = new Label("Error Message: ");
    private TextField facInputText = new TextField();
    private TextField facResultText = new TextField();
    private TextField errorTextField = new TextField();
    
    private Button calcFac = new Button("Compute Factorial");
    private int top, right, bottom, left;        
    
    public void start(Stage primaryStage) throws IOException {
        
        facResultText.setEditable(false);
        errorTextField.setEditable(false);
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setPadding(new Insets(top = 10, right = 10, bottom = 10, left = 10));
        pane.add(calcFac, 1, 0);
        pane.add(facInputLabel,0,2);
        pane.add(facInputText,1,2);
        pane.add(facResultLabel,0,3);
        pane.add(facResultText,1,3);
        pane.add(errorLabel,0,4);
        pane.add(errorTextField,1,4);
        
        
        calcFac.setOnAction(e ->{
            errorTextField.setText("");
            facResultText.setText("");
            int facNum = Integer.parseInt(facInputText.getText());
            if(facNum < 0){
                System.out.println("Error: Input can't be negative.");
                errorTextField.setText("Input can't be negative.");
            }
            else{
                facResultText.setText(Long.toString(factorial(facNum)));
            }
        });
        
        Scene mainScene = new Scene(pane, 350, 125);
        primaryStage.setTitle(readDataFile());
        primaryStage.setScene(mainScene);
        primaryStage.show();    
    }
    
    public static long factorial(int n) {
        if (n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
    
    public static String readDataFile() throws IOException{
        String utf1;
        int int1;
        int int2;
        
        try(
        DataInputStream input = new DataInputStream(new FileInputStream("exam3input.dat"));
        ){
            utf1 = input.readUTF();
            int1 = input.readInt();
            int2 = input.readInt();           
        }
        return "Exam 3 Cruz " + utf1 + " " + (int1 + int2);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
