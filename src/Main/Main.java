package Main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
    private static final BorderPane Layout = new BorderPane();
    private static Button een = new Button("Knop 1");
    private static Button twee = new Button("Knop 2");
    private static Button drie = new Button("Knop 3");

    private static Button vier = new Button("Knop 4");
    private static Button vijf = new Button("Knop 5");
    private static Button zes = new Button("Knop 6");

    private static Button zeven = new Button("Knop 7");
    private static Button acht = new Button("Knop 8");
    private static Button negen = new Button("Knop 9");

    private static HBox rij1 = new HBox();
    private static HBox rij2 = new HBox();
    private static HBox rij3 = new HBox();

    private static VBox last = new VBox();
    private final static VBox Center = new VBox(20);

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

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void checkWin(){}
    private void setButtons(){
        setBtnEen();
    }

    private static void initiate() {
        Scene scn = new Scene(Layout, 400, 400);
        scn.getStylesheets().add(Main.class.getResource("../css/Style.css").toExternalForm());
        window.setScene(scn);
        window.setMaximized(false);
        window.show();
    }
    private static void setLayout() {
        rij1.getChildren().addAll(een, twee, drie);
        rij2.getChildren().addAll(vier, vijf, zes);
        rij3.getChildren().addAll(zeven, acht, negen);
        Line Vt1 = new Line(150, 350, 150, 50);
        Line Vt2 = new Line(250, 350, 250, 50);
        Line Hz1 = new Line(350, 150, 50, 150);
        Line Hz2 = new Line(350, 150, 50, 150);
        setLineLayout(Vt1);
        setLineLayout(Vt2);
        setLineLayout(Hz1);
        setLineLayout(Hz2);

        rij1.setAlignment(Pos.CENTER);
        rij2.setAlignment(Pos.CENTER);
        rij3.setAlignment(Pos.CENTER);
        Center.getChildren().addAll(rij1, Vt1, rij2, Vt2, rij3, Hz1, Hz2);


        Center.getStyleClass().addAll("HomeVBox");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(javafx.stage.StageStyle.UNDECORATED);
        window = primaryStage;
        initiate();
        setLayout();
        window.setTitle("Tic Tac Toe");
    }
    public static void setLineLayout(Line line){
        line.setStrokeWidth(5);
        line.setStroke(Color.WHITE);
    }


    public void Main(){
        setLayout();
        setButtons();


    }
}
