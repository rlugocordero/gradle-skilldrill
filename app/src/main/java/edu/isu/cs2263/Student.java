package edu.isu.cs2263;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.*;

public class Student extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Course View");

        Label label = new Label("Hello World");
        Scene scene = new Scene(label,400,200);

        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
