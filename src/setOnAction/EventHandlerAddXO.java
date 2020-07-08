package setOnAction;

import Main.Buttons;
import Main.Field;
import Main.PlayScreen;
import Main.RNG;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventHandlerAddXO implements EventHandler<ActionEvent> {
    private Field field;
    private Buttons buttons;
    private PlayScreen playScreen;

    public EventHandlerAddXO(Buttons buttons, PlayScreen playScreen, Field field) {
        this.buttons = buttons;
        this.playScreen = playScreen;
        this.field = field;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        if (this.buttons.getTaken().equals("/")) {
            this.buttons.setTaken("X");
            this.playScreen.draw();
            int R = RNG.generateRandomButton();
            if(field.buttons[R].getTaken().equals("/")){
                field.buttons[R].setTaken("O");
            }
        }
    }
}
