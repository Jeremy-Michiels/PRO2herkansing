package Optionchecker;

import Main.Buttons;
import Main.Field;
import Main.PlayScreen;

import java.lang.reflect.Array;

public class checkOptNew {
    private Field field;
    private PlayScreen playScreen;
    private Buttons buttons;

    public checkOptNew(Field field, PlayScreen playScreen) {
        this.field = field;
        this.playScreen = playScreen;
    }



    public static Boolean optX(Field field) {
        int[] checkOptX = new int[9];
        int i = 0;
        for (Buttons buttons : field.buttons) {
            if (buttons.getTaken().equals("X")) {
                checkOptX[i] = 1;
            } else {
                checkOptX[i] = 0;
            }
            i++;
        }
        boolean opt1 = checkOptX[0] == 1 && checkOptX[1] == 1 && checkOptX[2] == 1;
        boolean opt2 = checkOptX[3] == 1 && checkOptX[4] == 1 && checkOptX[5] == 1;
        boolean opt3 = checkOptX[6] == 1 && checkOptX[7] == 1 && checkOptX[8] == 1;

        boolean opt4 = checkOptX[0] == 1 && checkOptX[3] == 1 && checkOptX[6] == 1;
        boolean opt5 = checkOptX[1] == 1 && checkOptX[4] == 1 && checkOptX[7] == 1;
        boolean opt6 = checkOptX[2] == 1 && checkOptX[5] == 1 && checkOptX[8] == 1;

        boolean opt7 = checkOptX[0] == 1 && checkOptX[4] == 1 && checkOptX[8] == 1;
        boolean opt8 = checkOptX[2] == 1 && checkOptX[4] == 1 && checkOptX[6] == 1;
        if (opt1 || opt2 || opt3 || opt4 || opt5 || opt6 || opt7 || opt8) {
            return true;
        }


        return false;
    }

    public static boolean optO(Field field) {
        int[] checkOptO = new int[9];
        int i = 0;
        for (Buttons buttons : field.buttons) {
            if (buttons.getTaken().equals("O")) {
                checkOptO[i] = 1;
            } else {
                checkOptO[i] = 0;
            }
            i++;
        }
        boolean opt1 = checkOptO[0] == 1 && checkOptO[1] == 1 && checkOptO[2] == 1;
        boolean opt2 = checkOptO[3] == 1 && checkOptO[4] == 1 && checkOptO[5] == 1;
        boolean opt3 = checkOptO[6] == 1 && checkOptO[7] == 1 && checkOptO[8] == 1;

        boolean opt4 = checkOptO[0] == 1 && checkOptO[3] == 1 && checkOptO[6] == 1;
        boolean opt5 = checkOptO[1] == 1 && checkOptO[4] == 1 && checkOptO[7] == 1;
        boolean opt6 = checkOptO[2] == 1 && checkOptO[5] == 1 && checkOptO[8] == 1;

        boolean opt7 = checkOptO[0] == 1 && checkOptO[4] == 1 && checkOptO[8] == 1;
        boolean opt8 = checkOptO[2] == 1 && checkOptO[4] == 1 && checkOptO[6] == 1;
        if (opt1 || opt2 || opt3 || opt4 || opt5 || opt6 || opt7 || opt8) {
            return true;
        }


        return false;
    }
}
