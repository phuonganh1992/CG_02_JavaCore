package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main2 extends Application {
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window=primaryStage;
        //scene 1
        Label label=new Label(" Welcome to school");
        Button button1=new Button("Click 1");
        button1.setOnAction(event -> {
            window.setScene(scene2);
        });

        VBox layout1=new VBox();
        layout1.getChildren().addAll(label,button1);
        scene1=new Scene(layout1,300,200);

        //scene 2
        Label label2=new Label("Welcome class");
        Button button2=new Button("Click 2");
        button2.setOnAction(event -> {
            window.setScene(scene1);
        });
        StackPane layout2=new StackPane();
        layout2.getChildren().addAll(label2,button2);
        scene2=new Scene(layout2, 200,400);

        window.setScene(scene1);
        window.show();

    }
}
