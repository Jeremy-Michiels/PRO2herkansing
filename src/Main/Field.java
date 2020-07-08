package Main;

import java.util.ArrayList;
import java.util.List;

public class Field {
    public final Buttons[] buttons;

    public Field() {
        this.buttons = new Buttons[9];
        this.buttons[0] = (new Buttons(1));
        this.buttons[1] =(new Buttons(2));
        this.buttons[2] = (new Buttons(3));
        this.buttons[3] = (new Buttons(4));
        this.buttons[4] =(new Buttons(5));
        this.buttons[5] =(new Buttons(6));
        this.buttons[6] =(new Buttons(7));
        this.buttons[7] =(new Buttons(8));
        this.buttons[8] = (new Buttons(9));
    }
}
