import javafx.embed.swing.JFXPanel;
import javafx.scene.control.Button;
import org.junit.Test;
import Optionchecker.checkOptNew;
import org.junit.jupiter.api.Order;

import static Optionchecker.checkOptNew.checkOpt;
import static org.junit.Assert.assertEquals;

public class checkOptNewTest {

    int[] i = new int[3];
    //Alleen rij 1 wordt getest
    @Test
    @Order(1)
    public void checktest1(){
        i[0] = 1;
        i[1] = 1;
        i[2] = 1;
        assertEquals(checkOpt(i, 0, 1, 2),true );
    }
    @Test
    @Order(2)
    public void checktest2(){
        i[0] = 1;
        i[1] = 1;
        i[2] = 0;
        assertEquals(checkOpt(i, 0, 1, 2),false );
    }
    @Test
    @Order(3)
    public void checktest3(){
        i[0] = 1;
        i[1] = 0;
        i[2] = 1;
        assertEquals(checkOpt(i, 0, 1, 2),false );
    }
    @Test
    @Order(4)
    public void checktest4(){
        i[0] = 1;
        i[1] = 0;
        i[2] = 0;
        assertEquals(checkOpt(i, 0, 1, 2),false );
    }
    @Test
    @Order(5)
    public void checktest5(){
        i[0] = 0;
        i[1] = 1;
        i[2] = 1;
        assertEquals(checkOpt(i, 0, 1, 2),false );
    }
    @Test
    @Order(6)
    public void checktest6(){
        i[0] = 0;
        i[1] = 1;
        i[2] = 0;
        assertEquals(checkOpt(i, 0, 1, 2),false );
    }
    @Test
    @Order(7)
    public void checktest7(){
        i[0] = 0;
        i[1] = 0;
        i[2] = 1;
        assertEquals(checkOpt(i, 0, 1, 2),false );
    }
    @Test
    @Order(8)
    public void checktest8(){
        i[0] = 0;
        i[1] = 0;
        i[2] = 0;
        assertEquals(checkOpt(i, 0, 1, 2),false );
    }


}
