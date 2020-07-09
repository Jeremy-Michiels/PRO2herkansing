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
        int[] check = new int[8];
        int i = 0;
        for (Buttons buttons : field.buttons) {
            if (buttons.getTaken().equals(k)) {
                check[i] = 1;
            } else {
                check[i] = 0;
            }
            i++;
        }
        boolean opt1 = checkOpt(check,0, 1, 2);
        boolean opt2 = checkOpt(check,3, 4, 5);
        boolean opt3 = checkOpt(check,6, 7, 8);

        boolean opt4 = checkOpt(check,0, 3, 6);
        boolean opt5 = checkOpt(check,1, 4, 7);
        boolean opt6 = checkOpt(check,2, 5, 8);

        boolean opt7 = checkOpt(check,0, 4,8);
        boolean opt8 = checkOpt(check,2, 4,6);



        return opt1 || opt2 || opt3 || opt4 || opt5 || opt6 || opt7 || opt8;
    }
    public static boolean checkOpt(int[] i, int j, int k, int l){
        return i[j] == 1 && i[k] == 1 && i[l] == 1;
    }
    public static boolean optO(Field field) {

        if (optCheck("O", field)) {
            return true;
        }


        return false;
    }
}
