package Main;

import java.util.ArrayList;
import java.util.List;

public class Field {
    public final List<Buttons> buttons;

    public Field() {
        this.buttons = new ArrayList<Buttons>();
        this.buttons.add(new Buttons(1));
        this.buttons.add(new Buttons(2));
        this.buttons.add(new Buttons(3));
        this.buttons.add(new Buttons(4));
        this.buttons.add(new Buttons(5));
        this.buttons.add(new Buttons(6));
        this.buttons.add(new Buttons(7));
        this.buttons.add(new Buttons(8));
        this.buttons.add(new Buttons(9));
    }
}
