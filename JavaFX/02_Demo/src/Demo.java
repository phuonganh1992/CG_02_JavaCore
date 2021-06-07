import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class Demo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        Button button1=new Button();
        button1.setText("Click for say hello");
        Button button2=new Button();
        button2.setText("Add");
        StackPane layout=new StackPane();
        layout.getChildren().addAll(button1,button2);
        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
