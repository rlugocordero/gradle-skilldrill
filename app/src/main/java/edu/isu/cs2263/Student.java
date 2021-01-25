import javafx.application.Application;
import javafx.stage.Stage;

public class Student extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("First JavaFX Application");
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
