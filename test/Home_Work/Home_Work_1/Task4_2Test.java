package Home_Work.Home_Work_1;

import Home_Work_1.Task4_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_2Test {
    @Test
    public void compar1(){
        Task4_2 temp = new Task4_2();
        Assertions.assertEquals("Среди введенных чисел 1 2 3 среднее: 2",
                temp.compar(1, 2, 3));
    }
    @Test
    public void compar2(){
        Task4_2 temp = new Task4_2();
        Assertions.assertEquals("Среди введенных чисел 2 3 1 среднее: 2",
                temp.compar(2, 3, 1));
    }
    @Test
    public void compar3(){
        Task4_2 temp = new Task4_2();
        Assertions.assertEquals("Среди введенных чисел 3 1 2 среднее: 2",
                temp.compar(3, 1, 2));
    }
    @Test
    public void compar4(){
        Task4_2 temp = new Task4_2();
        Assertions.assertEquals("Среди введенных чисел 13 12 1 среднее: 12",
                temp.compar(13, 12, 1));
    }
    @Test
    public void compar5(){
        Task4_2 temp = new Task4_2();
        Assertions.assertEquals("Среди введенных чисел 6 1 13 среднее: 6",
                temp.compar(6, 1, 13));
    }
    @Test
    public void compar6(){
        Task4_2 temp = new Task4_2();
        Assertions.assertEquals("Среди введенных чисел 1 9 6 среднее: 6",
                temp.compar(1, 9, 6));
    }

    @Test
    public void compar7(){
        Task4_2 temp = new Task4_2();
        Assertions.assertEquals("Среди введенных чисел 1 1 6 среднее: 1",
                temp.compar(1, 1, 6));
    }
}
