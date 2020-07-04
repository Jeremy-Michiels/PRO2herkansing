package Main;

import Optionchecker.checkOpt;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
    private final Rectangle2D screen = Screen.getPrimary().getVisualBounds();

    private static BorderPane Layout = new BorderPane();

    private final Button een = new Button("1");
    private final Button twee = new Button("2");
    private final Button drie = new Button("3");
    private final Button vier = new Button("4");
    private final Button vijf = new Button("5");
    private final Button zes = new Button("6");
    private final Button zeven = new Button("7");
    private final Button acht = new Button("8");
    private final Button negen = new Button("9");

    private final HBox rij1 = new HBox(10);
    private final HBox rij2 = new HBox(10);
    private final HBox rij3 = new HBox(10);

    private final VBox last = new VBox(10);
    private final Label WinLose = new Label();

    private static Stage window;

    private static void btnStyle(Button button) {
        button.getStyleClass().addAll("TictactoeBtn", "Empty");
        }

    private void addXO(Button button, String newStyle){
        if(button.getStyleClass().contains("Empty")) {
            button.getStyleClass().remove("Empty");
            button.getStyleClass().addAll(newStyle);
            Image APImg = new Image(getClass().getResourceAsStream("../Pictures/"+ newStyle +".jpg"));
            ImageView APIV = new ImageView(APImg);
            APIV.setFitWidth(100);
            APIV.setFitHeight(100);
            button.setGraphic(APIV);
        }
        if(checkWin() != ""){
            WinLose.setText(checkWin());
        }
        }

        private void addO(){
        int Random = RNG.generateRandomButton();
        if(Random == 1) {
            if(een.getStyleClass().contains("Empty")) {
                addXO(een, "O");
            }
        }
        else if(Random == 2) {
            if(twee.getStyleClass().contains("Empty")) {
                addXO(twee, "O");
            }
        }
        else if(Random == 3) {
            if(drie.getStyleClass().contains("Empty")) {
                addXO(drie, "O");
            }
        }
        else if(Random == 4) {
            if(vier.getStyleClass().contains("Empty")) {
                addXO(vier, "O");
            }
        }
        else if(Random == 5) {
            if(vijf.getStyleClass().contains("Empty")) {
                addXO(vijf, "O");
            }
        }
        else if(Random == 6) {
            if(zes.getStyleClass().contains("Empty")) {
                addXO(zes, "O");
            }
        }
        else if(Random == 7) {
            if(zeven.getStyleClass().contains("Empty")) {
                addXO(zeven, "O");
            }
        }
        else if(Random == 8) {
            if(acht.getStyleClass().contains("Empty")) {
                addXO(acht, "O");
            }
        }
        else if(Random == 9) {
            if(negen.getStyleClass().contains("Empty")) {
                addXO(negen, "O");
            }
        }



            }
            private void setBtn(Button button){
                    btnStyle(button);
                    button.setOnAction(event -> {
                        try {
                            addXO(button, "X");
                            button.setText("");
                            addO();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
            }
    private String checkWin(){
        String opt1 = checkOpt.opt(een, twee, drie);
        String opt2 = checkOpt.opt(vier, vijf, zes);
        String opt3 = checkOpt.opt(zeven, acht, negen);

        String opt4 = checkOpt.opt(een, vier, zeven);
        String opt5 = checkOpt.opt(twee, vijf, acht);
        String opt6 = checkOpt.opt(drie, zes, negen);

        String opt7 = checkOpt.opt(een, vijf, negen);
        String opt8 = checkOpt.opt(drie, vijf, zeven);
        return opt1 + opt2 + opt3 + opt4 + opt5 + opt6 + opt7 + opt8;
    }
    private void setButtons(){
        setBtn(een);
        setBtn(twee);
        setBtn(drie);
        setBtn(vier);
        setBtn(vijf);
        setBtn(zes);
        setBtn(zeven);
        setBtn(acht);
        setBtn(negen);
    }

    private static void initiate() {
        Scene scn = new Scene(Layout, 400, 400);
        scn.getStylesheets().add(Main.class.getResource("../CSS/Style.css").toExternalForm());
        window.setScene(scn);
        window.setMaximized(false);
    }
    private void setLayout() {
        rij1.getChildren().addAll(een, twee, drie);
        rij2.getChildren().addAll(vier, vijf, zes);
        rij3.getChildren().addAll(zeven, acht, negen);

        rij1.setAlignment(Pos.CENTER);
        rij2.setAlignment(Pos.CENTER);
        rij3.setAlignment(Pos.CENTER);
        last.getChildren().addAll(WinLose, rij1, rij2, rij3);

        last.getStyleClass().addAll("home");
        last.setMaxWidth(screen.getWidth());
        last.setMaxHeight(screen.getHeight());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        initiate();
        Mains();
        window.setTitle("Tic Tac Toe");
        window.show();
    }
    public static void setLineLayout(Line line){
        line.setStrokeWidth(5);
        line.setStroke(Color.WHITE);
    }


    public void Mains(){
        setLayout();
        setButtons();
        Layout.setCenter(last);


    }
    public static void main(String[] args) {
        launch(args);
    }
}
