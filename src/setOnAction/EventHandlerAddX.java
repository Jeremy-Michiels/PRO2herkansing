package setOnAction;

import Main.Buttons;
import Main.PlayScreen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventHandlerAddX implements EventHandler<ActionEvent> {
    private Buttons buttons;
    private PlayScreen playScreen;

    public EventHandlerAddX(Buttons buttons, PlayScreen playScreen){
        this.buttons = buttons;
        this.playScreen = playScreen;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        if(this.buttons.getTaken().equals("Empty")) {
            this.buttons.setTaken("X");
            this.playScreen.draw();

        }
    }
}
