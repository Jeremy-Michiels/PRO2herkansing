package setOnAction;

import Main.Buttons;
import Main.Field;
import Main.PlayScreen;
import Main.RNG;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventHandlerAddO {
    private static Field field;
    private PlayScreen playScreen;

    public EventHandlerAddO(PlayScreen playScreen) {
        this.playScreen = playScreen;
    }
    public static void addO(){
        int R = RNG.generateRandomButton();
        for (Buttons buttons: field.buttons) {
            if (buttons.getNumber() == R) {
                if(buttons.getTaken().equals("Empty")) {
                    buttons.setTaken("O");
                    break;
                }
                else{
                    int p = RNG.generateRandomButton();
                    if(buttons.getNumber() == p){
                        if(buttons.getTaken().equals("Empty")){
                            buttons.setTaken("O");
                            break;
                        }
                    }
                }
            }
        }
    }
}
