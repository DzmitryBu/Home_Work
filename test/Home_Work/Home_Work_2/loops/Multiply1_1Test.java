package Home_Work.Home_Work_2.loops;

import Home_Work_2.loops.Multiply1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Multiply1_1Test {
    @Test
    public void multiply(){
        Multiply1_1 temp = new Multiply1_1();
        Assertions.assertEquals(120, temp.multiply(5));
    }
    @Test
    public void multiply2(){
        Multiply1_1 temp = new Multiply1_1();
        Assertions.assertEquals(0, temp.multiply(0));
    }
    @Test
    public void multiply3(){
        Multiply1_1 temp = new Multiply1_1();
        Assertions.assertEquals(5040, temp.multiply(7));
    }
    @Test
    public void recursion(){
        Multiply1_1 temp = new Multiply1_1();
        Assertions.assertEquals(120, temp.recursion(5));
    }
    @Test
    public void recursion2(){
        Multiply1_1 temp = new Multiply1_1();
        Assertions.assertEquals(0, temp.recursion(0));
    }
    @Test
    public void recursion3(){
        Multiply1_1 temp = new Multiply1_1();
        Assertions.assertEquals(40320, temp.recursion(8));
    }
    @Test
    public void printResult(){
        Multiply1_1 temp = new Multiply1_1();
        Assertions.assertEquals("Рещультат метода multiply: 1 * 2 * 3 * 4 * 5 = 120" +
                "\nРещультат метода recursion: 1 * 2 * 3 * 4 * 5 = 120", temp.printResult(5));
    }
    @Test
    public void printResult2(){
        Multiply1_1 temp = new Multiply1_1();
        Assertions.assertEquals("Рещультат метода multiply: 1 = 1" +
                "\nРещультат метода recursion: 1 = 1", temp.printResult(1));
    }
    @Test
    public void printResult3(){
        Multiply1_1 temp = new Multiply1_1();
        Assertions.assertEquals("Рещультат метода multiply: 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040" +
                "\nРещультат метода recursion: 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040", temp.printResult(7));
    }
}
