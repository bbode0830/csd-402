/*
Ben bode
8/23/2026
purpose: show how vbox and hbox work in javafx
*/



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.Group;
import javafx.geometry.*;


public class Main extends Application {
    
    //override the abstract class application
    @Override
    public void start(Stage vboxStage){
        //name the stages
        Stage hboxStage = new Stage();
        hboxStage.setTitle("Horizontal Boxes Example");
        vboxStage.setTitle("Vertical Boxes Example");
        
        //------make a new vbox--------

        VBox vbox = new VBox(20);
        
        //demonstrate making a label
        Label vboxLabel = new Label("Here is the vbox label!");
        
        //add the label to the vbox
        vbox.getChildren().add(vboxLabel);
        
        //display the column of buttons in the center of the stage
        vbox.setAlignment(Pos.CENTER);

        //make a new button called 'tom'
        Button tom = new Button("Tom");
        //format it a little bit, change the boarder color
        tom.setStyle("-fx-border-color: blue;");

        //make a second button called 'jerry'
        Button jerry = new Button("Jerry");
        jerry.setStyle("-fx-border-color: green;");

        //make a third button called 'mickeyMouse'
        Button mickeyMouse = new Button("Mickey Mouse");
        mickeyMouse.setStyle("-fx-border-color: white;");

        //add the buttons to the vbox
        vbox.getChildren().add(tom);
        vbox.getChildren().add(jerry);
        vbox.getChildren().add(mickeyMouse);

        //------ make a new hbox ---------

        HBox hbox = new HBox(10);

        //align the boxes to the center
        hbox.setAlignment(Pos.CENTER);

        //give the hbox a label
        Label hboxLabel = new Label("Here is the hbox label!");

        //add the label to the hbox
        hbox.getChildren().add(hboxLabel);

        //define buttons to be added to the hbox
        Button green = new Button("Green");
        //give the buttons a color
        green.setStyle("-fx-border-color: green");
        Button blue = new Button("Blue");
        blue.setStyle("-fx-border-color: blue");
        Button yellow = new Button("Yellow");
        yellow.setStyle("-fx-border-color: yellow");
        Button purple = new Button("Purple");
        purple.setStyle("-fx-border-color: purple");

        //add the buttons to the hbox
        hbox.getChildren().add(green);
        hbox.getChildren().add(blue);
        hbox.getChildren().add(yellow);
        hbox.getChildren().add(purple);

        
        //make new scenes
        Scene vboxScene = new Scene(vbox, 300, 300);
        Scene hboxScene = new Scene(hbox, 600, 300);
        
        //set the scenes and show the results
        vboxStage.setScene(vboxScene);
        vboxStage.show();
        hboxStage.setScene(hboxScene);
        hboxStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
