package Home_Work.Home_Work_1;

import Home_Work_1.Task4_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_5Test {
    @Test
    public void whatChar(){
        Task4_5 temp = new Task4_5();
        Assertions.assertEquals("Введенный код - это буква латинского алфавита в верхнем регистре",
                temp.whatChar(66));
    }
    @Test
    public void whatChar2(){
        Task4_5 temp = new Task4_5();
        Assertions.assertEquals("Введенный код - это буква латинского алфавита в нижнем регистре",
                temp.whatChar(99));
    }
    @Test
    public void whatChar3(){
        Task4_5 temp = new Task4_5();
        Assertions.assertEquals("Введенный код - это буква латинского алфавита в верхнем регистре",
                temp.whatChar(65));
    }
    @Test
    public void whatChar4(){
        Task4_5 temp = new Task4_5();
        Assertions.assertEquals("Веденный код - это символ или цифра",
                temp.whatChar(123));
    }


}
