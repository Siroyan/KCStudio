package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception{
        Main.primaryStage = stage;
        Main.primaryStage.setTitle("KCStudio");
        changeScene("../views/root.fxml");
        Main.primaryStage.show();
    }

    /* stage上のsceneを差し替えてページ遷移 */
    public static void changeScene(String fxml) throws Exception{
        Parent root = FXMLLoader.load(Main.class.getResource(fxml));
        primaryStage.setScene(new Scene(root, 600, 400));
    }

    public static void main(String[] args) {
        launch(args);
    }
}