//Cameron Mendez
//10-05-2025
//Module-11
//HBoxGridDemo.java


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class HBoxGridDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        //create HBox toolbar
        HBox toolbar = new HBox(10);
        toolbar.setPadding(new Insets(10));
        toolbar.setAlignment(Pos.CENTER_LEFT);
        toolbar.getChildren().addAll(new Button("New"), new Button("Open"), new Button("Save"));
        
        //create GridPane form
        GridPane form = new GridPane();
        form.setPadding(new Insets(10));
        form.setHgap(5);
        form.setVgap(5);
        form.setAlignment(Pos.CENTER);
        form.add(new Label("First Name"), 0, 0);
        form.add(new TextField(), 1, 0);
        form.add(new Label("Last Name"), 0, 1);
        form.add(new TextField(), 1, 1);
        form.add(new Button("Submit"), 0, 2);
        form.add(new Button("Clear"), 1, 2);
        
        //layout- place toolbar above, form below using VBox
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(toolbar, form);
        
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("HBox & GridPane Demo");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
