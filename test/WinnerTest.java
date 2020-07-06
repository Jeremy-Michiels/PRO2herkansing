import Optionchecker.checkOpt;
import javafx.embed.swing.JFXPanel;
import javafx.scene.control.Button;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WinnerTest {
    JFXPanel fxPanel = new JFXPanel();

    @Test

    public void WinnerTest1(){

        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        b1.getStyleClass().addAll("X");
        b2.getStyleClass().addAll("X");
        b3.getStyleClass().addAll("X");
        assertEquals("X Wins", checkOpt.opt(b1, b2, b3));
    }

    @Test
    public void WinnerTest2(){
        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        b1.getStyleClass().addAll("O");
        b2.getStyleClass().addAll("O");
        b3.getStyleClass().addAll("O");
        assertEquals("O Wins", checkOpt.opt(b1, b2, b3));
    }

}
