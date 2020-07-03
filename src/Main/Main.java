package Main;

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
    private final Button een = new Button("Knop 1");
    private final Button twee = new Button("Knop 2");
    private final Button drie = new Button("Knop 3");

    private final Button vier = new Button("Knop 4");
    private final Button vijf = new Button("Knop 5");
    private final Button zes = new Button("Knop 6");

    private final Button zeven = new Button("Knop 7");
    private final Button acht = new Button("Knop 8");
    private final Button negen = new Button("Knop 9");

    private final HBox rij1 = new HBox(10);
    private final HBox rij2 = new HBox(10);
    private final HBox rij3 = new HBox(10);

    private final VBox last = new VBox(10);

    Label x = new Label("X");
    Label o = new Label("O");
    private static Stage window;
    private static void btnStyle(Button button) {
        button.getStyleClass().addAll("TictactoeBtn", "Empty");
        }
    private void addX(Button button){
        button.getStyleClass().remove("Empty");
        button.getStyleClass().addAll("X");
            Image APImg = new Image(getClass().getResourceAsStream("../Pictures/X...jpg"));
            ImageView APIV = new ImageView(APImg);
            APIV.setFitWidth(100);
            APIV.setFitHeight(100);
            button.setGraphic(APIV);
        }


    private void setBtnEen() {
        btnStyle(een);
        een.setOnAction(event -> {
            try {
                addX(een);
                een.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void setBtnTwee() {
        btnStyle(twee);
        twee.setOnAction(event -> {
            try {
                addX(twee);
                twee.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void setBtnDrie() {
        btnStyle(drie);
        drie.setOnAction(event -> {
            try {
                addX(drie);
                drie.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void setBtnVier() {
        btnStyle(vier);
        vier.setOnAction(event -> {
            try {
                addX(vier);
                vier.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void setBtnVijf() {
        btnStyle(vijf);
        vijf.setOnAction(event -> {
            try {
                addX(vijf);
                vijf.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void setBtnZes() {
        btnStyle(zes);
        zes.setOnAction(event -> {
            try {
                addX(zes);
                zes.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void setBtnZeven() {
        btnStyle(zeven);
        zeven.setOnAction(event -> {
            try {
                addX(zeven);
                zeven.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void setBtnAcht() {
        btnStyle(acht);
        acht.setOnAction(event -> {
            try {
                addX(acht);
                acht.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void setBtnNegen() {
        btnStyle(negen);
        negen.setOnAction(event -> {
            try {
                addX(negen);
                negen.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void checkWin(){}
    private void setButtons(){
        setBtnEen();
        setBtnTwee();
        setBtnDrie();
        setBtnVier();
        setBtnVijf();
        setBtnZes();
        setBtnZeven();
        setBtnAcht();
        setBtnNegen();
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
        last.getChildren().addAll(rij1, rij2, rij3);

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
