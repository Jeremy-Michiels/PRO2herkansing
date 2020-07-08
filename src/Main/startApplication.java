package Main;


import OldApplication.Main;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class startApplication extends Application {
    private final Rectangle2D screen = Screen.getPrimary().getVisualBounds();
    private static Stage window;
    private final VBox box = new VBox();
    private static BorderPane Layout = new BorderPane();
    private final Button newScreen = new Button("Press to add new screen");
    private static void initiate(Stage stage, BorderPane bp) {
        Scene scn = new Scene(bp, 400, 500);
        scn.getStylesheets().add(Main.class.getResource("../CSS/Style.css").toExternalForm());
        stage.setScene(scn);
        stage.setMaximized(false);

    }
    public startApplication(){

    }
    private void setLayout(){
        box.getChildren().addAll(newScreen);
        box.setAlignment(Pos.CENTER);

    }
    private void setButton(){
        newScreen.setOnAction(event -> {
            try {
                new Main();
                }

             catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        initiate(window, Layout);
        setButton();
        setLayout();
        Layout.setCenter(box);
        window.setTitle("Tic Tac Toe");
        window.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

    }
