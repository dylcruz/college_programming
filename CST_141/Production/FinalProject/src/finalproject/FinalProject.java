package finalproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author Dylan Cruz
 * CST 141 - SP17
 * Final Project
 */
public class FinalProject extends Application {
    
    private Slider fibSlider = new Slider(0,10,0);
    private Label sliderIndexLabel = new Label ("Index: ");
    private Label fibNumberLabel = new Label ("Fibonacci #: ");
    private TextField sliderIndexText = new TextField("0");
    private TextField fibNumberText = new TextField();
    private Button calcFib = new Button("Calculate Fibonacci");
    private int top, right, bottom, left;        
    
    public void start(Stage primaryStage) {
        
        
        fibSlider.setMajorTickUnit(1);
        fibSlider.setMinorTickCount(0);
        fibSlider.setShowTickLabels(true);
        fibSlider.setShowTickMarks(true);
        fibSlider.setSnapToTicks(true);
        
        sliderIndexText.setEditable(false);
        fibNumberText.setEditable(false);
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setPadding(new Insets(top = 10, right = 10, bottom = 10, left = 10));
        pane.add(calcFib, 1, 0);
        pane.add(sliderIndexLabel,0,1);
        pane.add(sliderIndexText,1,1);
        pane.add(fibNumberLabel,0,2);
        pane.add(fibNumberText,1,2);
        pane.add(fibSlider, 1, 3);
        
        fibSlider.valueProperty().addListener(e ->{
            sliderIndexText.setText(Long.toString((long)fibSlider.getValue()));
            fibNumberText.setText("");
        });
        
        calcFib.setOnAction(e ->{
            fibNumberText.setText(Long.toString(fib2((long)fibSlider.getValue())));
        });
        
        Scene mainScene = new Scene(pane, 400, 150);
        primaryStage.setTitle("Cruz - Fibonacci Calculator - Additional 10");
        primaryStage.setScene(mainScene);
        primaryStage.show();    
    }
    
    public static long fib(long index) {
        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else  // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
    }
    
    public static long fib2(long index) {
        long f0 = 0;         
	long f1 = 1;
	long currentFib = 0;  

	if (index == 0)
            return f0;
	else if (index == 1)
            return f1;       
        else {
            for (int i = 1; i < index; i++) {
		currentFib = f0 + f1;     
		f0 = f1;                  
		f1 = currentFib;          
	} 
            return currentFib;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
