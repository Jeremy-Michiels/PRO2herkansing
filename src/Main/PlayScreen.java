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

import java.util.Observable;
import java.util.Observer;

public class PlayScreen extends Stage implements Observer {
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
        VBox vBox = new VBox();
        this.rootPane.getChildren().add(vBox);
        HBox r1 = new HBox();
        HBox r2 = new HBox();
        HBox r3 = new HBox();
        HBox r4 = new HBox();

        final Label een = new Label("");
        if(checkOptNew.optX(field) == true){
                een.setText("X has won");
            }
            if(checkOptNew.optO(field) == true){
                een.setText("O has won");
            }

        r4.getChildren().addAll(een);
        vBox.getChildren().addAll(r1, r2, r3, r4);
        int tel = 2;
        for(Buttons buttons: field.buttons){
            tel++;
            Button button = new Button(buttons.getTaken());
            button.setOnAction(new EventHandlerAddXO(buttons, this, field));
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
}
