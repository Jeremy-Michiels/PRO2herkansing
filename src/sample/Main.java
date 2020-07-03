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
import javafx.scene.layout.BorderPane;

public class Main extends Application {
    private static final BorderPane Layout = new BorderPane();
    private static final Button een = new Button("Knop 1");
    private static final Button twee = new Button("Knop 2");
    private static final Button drie = new Button("Knop 3");

    private static Button vier = new Button("Knop 4");
    private static Button vijf = new Button("Knop 5");
    private static Button zes = new Button("Knop 6");

    private static Button zeven = new Button("Knop 7");
    private static Button acht = new Button("Knop 8");
    private static Button negen = new Button("Knop 9");

    private static VBox rij1 = new VBox();
    private static VBox rij2 = new VBox();
    private static VBox rij3 = new VBox();

    HBox last = new HBox();
    private static Stage window;

    private static void initiate() {
        Scene scn = new Scene(Layout, 800, 600);
        scn.getStylesheets().add(Main.class.getResource("../css/Style.css").toExternalForm());
        window.setScene(scn);
        window.setMaximized(false);
        window.show();
    }

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
