package setOnAction;

import Main.Buttons;
import Main.Field;
import Main.PlayScreen;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

import java.awt.*;

public class EventHandlerClose implements EventHandler<WindowEvent> {
    private Field field;
    private PlayScreen playScreen;

    public EventHandlerClose(Field field, PlayScreen playScreen){
        this.field = field;
        this.playScreen = playScreen;
    }
    @Override
    public void handle(WindowEvent windowEvent){
        for(Buttons buttons : field.buttons){
            buttons.deleteObserver(this.playScreen);
        }
    }

}
