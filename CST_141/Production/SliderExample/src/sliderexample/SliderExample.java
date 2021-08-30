package sliderexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 
 * SliderExample.java - Program to demonstrate using some of the methods
 * of the Slider Class to customize the appearance of a Slider object on the
 * screen.
 * 
 * by Prof. Hassildine, CST141-SP17
 * 
 */
public class SliderExample extends Application {

    //Static Variables
    private static Slider indexSelector = new Slider(0,10,0);
    private static Label helpInfo = new Label("Let go of the Slide Control "+
            "between ticks and see what happens.\n"+
            "Notice there are no minor tick marks.");
    private static int colIndex = 0;
    private static int rowIndex = 0; 
    private static int topIndex = 0;
    private static int rightIndex = 0;  
    private static int leftIndex = 0;
    private static int bottomIndex = 0; 
    
    @Override
    public void start(Stage primaryStage) {
        
        //Set the characteristics of the Slider Object.
        indexSelector.setMajorTickUnit(1);
        indexSelector.setMinorTickCount(0);
        indexSelector.setShowTickLabels(true);
        indexSelector.setShowTickMarks(true);
        indexSelector.setSnapToTicks(true);
        
        //Add Listener to Slider Object. Notice the Type-Cast to long that
        //is necessary to convert getValue()'s double value so it can be
        //passed to the DoOtherThingsMethod() that requires a long argument.
        indexSelector.valueProperty().addListener(sl -> {
           System.out.println("Moved slider to: "+indexSelector.getValue());
           DoOtherThingsMethod((long)indexSelector.getValue());
        });
        
        //Build the Main Pane for the JavaFX Application using a method.
        GridPane mainGPane = buildMainGPane();
        
        Scene mainScene = new Scene(mainGPane, 500, 200);
        
        primaryStage.setTitle("CST141-SP17 Slider Example");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    
    public static GridPane buildMainGPane() {
        GridPane gPane = new GridPane();
        
        gPane.setAlignment(Pos.CENTER);
        gPane.setPadding(new Insets(topIndex=10,rightIndex=10,
           bottomIndex=10,leftIndex=10));
        gPane.setHgap(5.5);
        gPane.setVgap(5.5);
        gPane.add(indexSelector,colIndex=1,rowIndex=3);
        gPane.add(helpInfo,colIndex=1,rowIndex=5);
        
        return gPane;
    }
    
    private static void DoOtherThingsMethod(long sliderIndexValue) {
        System.out.println("Long Integer Value of Slider Index: "+
          sliderIndexValue);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}