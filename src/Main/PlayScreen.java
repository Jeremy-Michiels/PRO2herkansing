package Main;

import Optionchecker.checkOptNew;
import setOnAction.EventHandlerAddXO;
import setOnAction.EventHandlerClose;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import setOnAction.EventHandlerReset;

import java.util.Observable;
import java.util.Observer;

public class PlayScreen extends Stage implements Observer {
    private static final Label een = new Label("");
    private Field field;
    private Pane rootPane;
    public PlayScreen(Field field){
        this.field = field;
        this.rootPane = new Pane();
        for(Buttons buttons : field.buttons){
            buttons.addObserver(this);
        }
        setTitle("Tic tac toe");
        this.rootPane.setMinSize(400, 500);
        draw();
        Scene scene = new Scene(rootPane);
        setScene(scene);
        setOnCloseRequest(new EventHandlerClose(field, this ));
        show();
    }
    public void draw(){
        this.rootPane.getChildren().clear();
        VBox vBox = new VBox(20);
        VBox vbox2 = new VBox();
        HBox fin = new HBox(20);
        this.rootPane.getChildren().add(fin);
        HBox r1 = new HBox();
        HBox r2 = new HBox();
        HBox r3 = new HBox();
        HBox r4 = new HBox(20);


        if(checkOptNew.optX(field) == true){
                een.setText("X has won");
            }
            if(checkOptNew.optO(field) == true){
                een.setText("O has won");
            }
            Button Reset = new Button("Reset");
            Reset.setOnAction(new EventHandlerReset(field, this));

        r4.getChildren().addAll(een, Reset);
        vBox.getChildren().addAll(r4);
        vbox2.getChildren().addAll(r1, r2, r3);
        fin.getChildren().addAll(vBox, vbox2);
        int tel = 2;
        for(Buttons buttons: field.buttons){
            tel++;
            Button button = new Button(buttons.getTaken());
            if(een.getText().equals("")) {
                button.setOnAction(new EventHandlerAddXO(buttons, this, field));
            }
            else{
                button.setOnAction(null);
            }




            if(tel/3 == 1){
                r1.getChildren().addAll(button);
            }
            if(tel/3 == 2){
                r2.getChildren().addAll(button);
            }
            if(tel/3 == 3){
                r3.getChildren().addAll(button);
            }

        }

    }

    @Override
    public void update(Observable o, Object arg) {
        draw();
    }
    public static String getEenText(){
        return een.getText();
    }
    public static void setEenText(String n){
        een.setText(n);
    }
}
