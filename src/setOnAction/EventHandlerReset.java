package setOnAction;

import Main.Buttons;
import Main.Field;
import Main.PlayScreen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

public class EventHandlerReset implements EventHandler<ActionEvent> {
    private Field field;
    private PlayScreen playScreen;

    public EventHandlerReset(Field field, PlayScreen playScreen){
        this.field = field;
        this.playScreen = playScreen;
    }
    @Override
    public void handle(ActionEvent actionEvent){
        for(Buttons buttons : field.buttons){
            buttons.setTaken("/");
            PlayScreen.setEenText("");
        }

        }
    }
