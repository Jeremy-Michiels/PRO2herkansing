package setOnAction;

import Main.Field;
import Main.PlayScreen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventHandlerNewPlayscreen implements EventHandler<ActionEvent> {

    private Field field;
    public EventHandlerNewPlayscreen(Field field){
        this.field = field;
    }
    @Override
    public void handle(ActionEvent actionEvent){
        new PlayScreen(this.field);
    }

}
