
import au.edu.uts.ap.javafx.*;
import javafx.stage.*;
import javafx.application.Application;
import javafx.scene.image.Image;
import model.*;

public class NBAfxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        primaryStage.getIcons().add(new Image("view/nba.png"));
        primaryStage.setX(ViewLoader.X);
        primaryStage.setY(ViewLoader.Y);
        ViewLoader.showStage(new Association(), "/view/AssociationView.fxml", "NBAfx View", primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
