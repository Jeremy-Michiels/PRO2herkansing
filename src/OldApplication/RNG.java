package OldApplication;

public class RNG {
    public static int generateRandomButton() {

        int min = 1;
        int max = 9;
        int random_int = (int) (Math.random() * (max - min + 1) + min);
        return random_int;
    }
}
