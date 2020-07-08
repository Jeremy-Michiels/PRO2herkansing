package OldApplication;

import Optionchecker.checkOpt;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private final Button restart = new Button("Restart");
    private final Button close = new Button("Shut off");
    private final HBox rij1 = new HBox(10);
    private final HBox rij2 = new HBox(10);
    private final HBox rij3 = new HBox(10);
    private final HBox rij4 = new HBox(5);


    private final VBox last = new VBox(10);
    private final Label WinLose = new Label("");
    private final Label checkPos = new Label("");
    private final Button newScreen = new Button( "New Screen");


    private static Stage window;

    private static void btnStyle(Button button) {
        button.getStyleClass().removeAll("X", "O");
        button.getStyleClass().addAll("TictactoeBtn", "Empty");
        }

    private void addXO(Button button, String newStyle){
        if(WinLose.getText() == "") {
            if (button.getStyleClass().contains("Empty")) {
                button.getStyleClass().removeAll("Empty");
                button.getStyleClass().addAll(newStyle);
                Image APImg = new Image(getClass().getResourceAsStream("../Pictures/" + newStyle + ".jpg"));
                ImageView APIV = new ImageView(APImg);
                APIV.setFitWidth(100);
                APIV.setFitHeight(100);
                button.setGraphic(APIV);
            }
        }
        else{}
        if(checkWin() != ""){
            WinLose.setText(checkWin());
        }
        }
        private String checkEmpty(Button button){
        if(button.getStyleClass().contains("Empty")){
            return "x";
        }
        return "";
        }



        private void addORef(Button button){
                if(button.getStyleClass().contains("Empty")) {
                    addXO(button, "O");
                }
                else{
                    String a = checkEmpty(een);
                    String b = checkEmpty(twee);
                    String c = checkEmpty(drie);
                    String d = checkEmpty(vier);
                    String e = checkEmpty(vijf);
                    String f = checkEmpty(zes);
                    String g = checkEmpty(zeven);
                    String h = checkEmpty(acht);
                    String i = checkEmpty(negen);
                    if(a+b+c+d+e+f+g+h+i != "") {
                        addO();
                    }
                }
            }

        private void addO(){
            int Random = RNG.generateRandomButton();
            if (Random == 1) {
                addORef(een);
            } else if (Random == 2) {
                addORef(twee);
            } else if (Random == 3) {
                addORef(drie);
            } else if (Random == 4) {
                addORef(vier);
            } else if (Random == 5) {
                addORef(vijf);
            } else if (Random == 6) {
                addORef(zes);
            } else if (Random == 7) {
                addORef(zeven);
            } else if (Random == 8) {
                addORef(acht);
            } else if (Random == 9) {
                addORef(negen);
            }
        }
            private void setBtn(Button button){
                    btnStyle(button);
                    button.setGraphic(null);

                    button.setOnAction(event -> {
                        try {
                            if(checkEmpty(button) == "x") {
                                addXO(button, "X");
                                button.setText("");
                                addO();
                                checkPos.setText("");
                            }
                            else {
                                if (WinLose.getText() == "") {
                                    checkPos.setText("Choose another button");
                                }
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
            }
    private String checkWin() {
        String opt1 = checkOpt.opt(een, twee, drie);
        String opt2 = checkOpt.opt(vier, vijf, zes);
        String opt3 = checkOpt.opt(zeven, acht, negen);

        String opt4 = checkOpt.opt(een, vier, zeven);
        String opt5 = checkOpt.opt(twee, vijf, acht);
        String opt6 = checkOpt.opt(drie, zes, negen);

        String opt7 = checkOpt.opt(een, vijf, negen);
        String opt8 = checkOpt.opt(drie, vijf, zeven);

        String allOpt = opt1 + opt2 + opt3 + opt4 + opt5 + opt6 + opt7 + opt8;
        return allOpt;
    }
    private void resetBtn(Button button){
        button.getStyleClass().removeAll("X", "O");
        button.getStyleClass().addAll("Empty");
    }
    private void setExit(){
        close.setOnAction(e -> System.exit(0));
    }
    private void setRestart(){
            restart.setOnAction(event -> {
                try {
                    WinLose.setText("");
                    resetBtn(een);
                    resetBtn(twee);
                    resetBtn(drie);
                    resetBtn(vier);
                    resetBtn(vijf);
                    resetBtn(zes);
                    resetBtn(zeven);
                    resetBtn(acht);
                    resetBtn(negen);
                    Main(Layout);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        private void setNewScreen() {
            final Stage newWin = new Stage();
            final BorderPane newBP = new BorderPane();
        newScreen.setOnAction(event -> {
            try{
                rij1.getChildren().clear();
                rij2.getChildren().clear();
                rij3.getChildren().clear();
                rij4.getChildren().clear();
                last.getChildren().clear();
                initiate(newWin, newBP);
                Main(newBP);
                setLayout();
                newWin.setTitle("Tic Tac Toe");
                newWin.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        }
    private void setButtons() throws Exception {
        setBtn(een);
        setBtn(twee);
        setBtn(drie);
        setBtn(vier);
        setBtn(vijf);
        setBtn(zes);
        setBtn(zeven);
        setBtn(acht);
        setBtn(negen);
        setRestart();
        setExit();
        setNewScreen();
    }

    private static void initiate(Stage stage, BorderPane bp) {
        Scene scn = new Scene(bp, 400, 500);
        scn.getStylesheets().add(Main.class.getResource("../CSS/Style.css").toExternalForm());
        stage.setScene(scn);
        stage.setMaximized(false);

    }
    private void setLayout() {
        rij1.getChildren().addAll(een, twee, drie);
        rij2.getChildren().addAll(vier, vijf, zes);
        rij3.getChildren().addAll(zeven, acht, negen);
        rij4.getChildren().addAll(close, WinLose, restart, newScreen);

        rij1.setAlignment(Pos.CENTER);
        rij2.setAlignment(Pos.CENTER);
        rij3.setAlignment(Pos.CENTER);
        rij4.setAlignment(Pos.CENTER);
        checkPos.setAlignment(Pos.CENTER);
        if(WinLose.getText()==("")) {
            last.getChildren().addAll(checkPos, rij4, rij1, rij2, rij3);
        }
        last.getStyleClass().addAll("home");
        last.setMaxWidth(screen.getWidth());
        last.setMaxHeight(screen.getHeight());
    }





    public void Main(BorderPane bp) throws Exception {
        setButtons();
        setLayout();

        bp.setCenter(last);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        initiate(window, Layout);
        setButtons();
        setLayout();
        Layout.setCenter(last);
        window.setTitle("Tic Tac Toe");
        window.show();
    }
}
