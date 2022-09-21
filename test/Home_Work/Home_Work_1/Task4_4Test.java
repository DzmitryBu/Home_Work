package Home_Work.Home_Work_1;

import Home_Work_1.Task4_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_4Test {
    @Test
    public void bytToKb(){
        Task4_4 temp = new Task4_4();
        Assertions.assertEquals(1.0, temp.bytToKb(1024));
    }
    @Test
    public void bytToKb2(){
        Task4_4 temp = new Task4_4();
        Assertions.assertEquals(0.0, temp.bytToKb(0));
    }
    @Test
    public void bytToKb3(){
        Task4_4 temp = new Task4_4();
        Assertions.assertEquals(2.0, temp.bytToKb(2048));
    }
    @Test
    public void kbToByt(){
        Task4_4 temp = new Task4_4();
        Assertions.assertEquals(1024, temp.kbToByt(1));
    }
    @Test
    public void kbToByt2(){
        Task4_4 temp = new Task4_4();
        Assertions.assertEquals(0, temp.kbToByt(0));
    }
    @Test
    public void kbToByt3(){
        Task4_4 temp = new Task4_4();
        Assertions.assertEquals(2048, temp.kbToByt(2));
    }
}
