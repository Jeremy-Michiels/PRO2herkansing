package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class Main extends Application {
    Button een = new Button("Knop 1");
    Button twee = new Button("Knop 2");
    Button drie = new Button("Knop 3");

    Button vier = new Button("Knop 4");
    Button vijf = new Button("Knop 5");
    Button zes = new Button("Knop 6");

    Button zeven = new Button("Knop 7");
    Button acht = new Button("Knop 8");
    Button negen = new Button("Knop 9");

    VBox rij1 = new VBox();
    VBox rij2 = new VBox();
    VBox rij3 = new VBox();

    HBox last = new HBox();

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
