package Home_Work.Home_Work_2.loops;

import Home_Work_2.loops.Task1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_3Test {
    @Test
    public void numberInDegree(){
        Task1_3 temp = new Task1_3();
        Assertions.assertEquals(1889568.0, temp.numberInDegree(18, 5));
    }
    @Test
    public void numberInDegree2(){
        Task1_3 temp = new Task1_3();
        Assertions.assertEquals(56.25, temp.numberInDegree(7.5, 2));
    }
    @Test
    public void numberInDegree3(){
        Task1_3 temp = new Task1_3();
        Assertions.assertEquals(0, temp.numberInDegree(0, 2));
    }
    @Test
    public void numberInDegree4(){
        Task1_3 temp = new Task1_3();
        Assertions.assertEquals(1, temp.numberInDegree(7.5, 0));
    }
    @Test
    public void printResult(){
        Task1_3 temp = new Task1_3();
        Assertions.assertEquals("18.0 ^ 5 = 1889568.0", temp.printResult(18.0,5));
    }
    @Test
    public void printResult2(){
        Task1_3 temp = new Task1_3();
        Assertions.assertEquals("7.5 ^ 2 = 56.25", temp.printResult(7.5,2));
    }
    @Test
    public void printResult3(){
        Task1_3 temp = new Task1_3();
        Assertions.assertEquals("0.0 ^ 2 = 0.0", temp.printResult(0,2));
    }
    @Test
    public void printResult4(){
        Task1_3 temp = new Task1_3();
        Assertions.assertEquals("7.5 ^ 0 = 1.0", temp.printResult(7.5,0));
    }

}
