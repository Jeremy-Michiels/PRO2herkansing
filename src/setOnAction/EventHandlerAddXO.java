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

    public EventHandlerAddXO(Buttons buttons, PlayScreen playScreen){
        this.buttons = buttons;
        this.playScreen = playScreen;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        if(this.buttons.getTaken().equals("Empty")) {
            this.buttons.setTaken("X");
            this.playScreen.draw();

            int R = RNG.generateRandomButton();
            for (Buttons buttons : field.buttons) {
                if (buttons.getNumber() == R) {
                    buttons.setTaken("O");
                    break;
                }
            }
        }
    }
}
