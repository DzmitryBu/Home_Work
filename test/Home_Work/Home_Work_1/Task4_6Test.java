package Home_Work.Home_Work_1;

import Home_Work_1.Task4_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_6Test {
    @Test
    public void leapYear(){
        Task4_6 temp = new Task4_6();
        Assertions.assertEquals("Вы ввели 2048 год и он является високосным", temp.leapYear(2048));
    }
    @Test
    public void leapYear2(){
        Task4_6 temp = new Task4_6();
        Assertions.assertEquals("Вы ввели 2004 год и он является високосным", temp.leapYear(2004));
    }
    @Test
    public void leapYear3(){
        Task4_6 temp = new Task4_6();
        Assertions.assertEquals("Вы ввели 4000 год и он является НЕвисокосным", temp.leapYear(4000));
    }
    @Test
    public void leapYear4(){
        Task4_6 temp = new Task4_6();
        Assertions.assertEquals("Вы ввели 2032 год и он является високосным", temp.leapYear(2032));
    }
    @Test
    public void leapYear5(){
        Task4_6 temp = new Task4_6();
        Assertions.assertEquals("Вы ввели 2033 год и он является НЕвисокосным", temp.leapYear(2033));
    }
    @Test
    public void leapYear6(){
        Task4_6 temp = new Task4_6();
        Assertions.assertEquals("Вы ввели 2035 год и он является НЕвисокосным", temp.leapYear(2035));
    }
}
