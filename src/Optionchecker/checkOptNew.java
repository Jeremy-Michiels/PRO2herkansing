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
        if (optCheck("X", field)) {
            return true;
        }


        return false;
    }

    private static boolean optCheck(String k, Field field){
        int[] check = new int[9];
        int i = 0;
        for (Buttons buttons : field.buttons) {
            if (buttons.getTaken().equals(k)) {
                check[i] = 1;
            } else {
                check[i] = 0;
            }
            i++;
        }
        boolean opt1 = check[0] == 1 && check[1] == 1 && check[2] == 1;
        boolean opt2 = check[3] == 1 && check[4] == 1 && check[5] == 1;
        boolean opt3 = check[6] == 1 && check[7] == 1 && check[8] == 1;

        boolean opt4 = check[0] == 1 && check[3] == 1 && check[6] == 1;
        boolean opt5 = check[1] == 1 && check[4] == 1 && check[7] == 1;
        boolean opt6 = check[2] == 1 && check[5] == 1 && check[8] == 1;

        boolean opt7 = check[0] == 1 && check[4] == 1 && check[8] == 1;
        boolean opt8 = check[2] == 1 && check[4] == 1 && check[6] == 1;



        return opt1 || opt2 || opt3 || opt4 || opt5 || opt6 || opt7 || opt8;
    }
    public static boolean optO(Field field) {

        if (optCheck("O", field)) {
            return true;
        }


        return false;
    }
}
