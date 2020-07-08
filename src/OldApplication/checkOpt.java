package OldApplication;

import javafx.scene.control.Button;

public class checkOpt {
    public static String opt(Button een, Button twee, Button drie) {
        if (een.getStyleClass().contains("X")) {
            if (twee.getStyleClass().contains("X")) {
                if (drie.getStyleClass().contains("X")) {
                    return "X Wins";
                }
            }
        }
        if (een.getStyleClass().contains("O")) {
            if (twee.getStyleClass().contains("O")) {
                if (drie.getStyleClass().contains("O")) {
                    return "O Wins";
                }
            }
        }

        return "";
    }
}
