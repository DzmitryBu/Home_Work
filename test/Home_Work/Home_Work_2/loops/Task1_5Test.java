package Home_Work.Home_Work_2.loops;

import Home_Work_2.loops.Task1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_5Test {
    @Test
    public void maxNumber(){
        Assertions.assertEquals(9, Task1_5.maxNumber(157895));
    }
    @Test
    public void maxNumber2(){
        Assertions.assertEquals(0, Task1_5.maxNumber(00000));
    }
    @Test
    public void evenAndOddNumber(){
        Assertions.assertEquals("В числе 157895 чётных цифр: 1" +
        "\nВ числе 157895 нечётных цифр: 5", Task1_5.evenAndOddNumber(157895));
    }
    @Test
    public void evenAndOddNumber2(){
        Assertions.assertEquals("В числе 0 чётных цифр: 1" +
                "\nВ числе 0 нечётных цифр: 0", Task1_5.evenAndOddNumber(0));
    }
    @Test
    public void fibonachi(){
        Assertions.assertEquals("1 2 3 5 8", Task1_5.fibonachi(5));
    }
    @Test
    public void fibonachi2(){
        Assertions.assertEquals("0", Task1_5.fibonachi(0));
    }
    @Test
    public void fibonachi3(){
        Assertions.assertEquals("1", Task1_5.fibonachi(1));
    }
    @Test
    public void seriesOfNumbers(){
        Assertions.assertEquals("1 3 5 7", Task1_5.seriesOfNumbers(1, 8, 2));
    }
    @Test
    public void seriesOfNumbers2(){
        Assertions.assertEquals("0", Task1_5.seriesOfNumbers(0, 0, 2));
    }
    @Test
    public void seriesOfNumbers3(){
        Assertions.assertEquals("Произойдет зацикливание!",
                Task1_5.seriesOfNumbers(0, 0, 0));
    }
    @Test
    public void numberFlip(){
        Assertions.assertEquals("987654321", Task1_5.numberFlip(123456789));
    }
    @Test
    public void numberFlip2(){
        Assertions.assertEquals("88760323", Task1_5.numberFlip(32306788));
    }
}
