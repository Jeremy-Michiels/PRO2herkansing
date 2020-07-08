package Main;


import OldApplication.Main;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import setOnAction.EventHandlerNewPlayscreen;


public class startApplication extends Application {
    private static Pane Layout = new Pane();
    private final Button newScreen = new Button("Press to add new screen");

    private Field field;


    private static void initiate(Stage stage, Pane bp) {
        Scene scn = new Scene(bp, 400, 500);
        scn.getStylesheets().add(Main.class.getResource("../CSS/Style.css").toExternalForm());
        stage.setScene(scn);
        stage.setMaximized(false);

    }
    public startApplication(){
        this.field = new Field();
    }
    public void start(Stage primaryStage) throws Exception {
        Layout.setMinSize(400, 500);
        Scene startScene = new Scene(Layout);
        newScreen.setOnAction(new EventHandlerNewPlayscreen(field));
        Layout.getChildren().add(newScreen);

        primaryStage.setScene(startScene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

    }
