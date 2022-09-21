package Home_Work.Home_Work_2.loops;

import Home_Work_2.loops.Multiply1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Multiply1_2Test {
    @Test
    public void input(){
        Multiply1_2 temp = new Multiply1_2();
        Assertions.assertEquals(181232375,
                temp.input("181232375"));
    }
    @Test
    public void input1(){
        Multiply1_2 temp = new Multiply1_2();
        Assertions.assertEquals("Вы ввели не число: ", temp.input("Привет"));
    }
    @Test
    public void input2(){
        Multiply1_2 temp = new Multiply1_2();
        Assertions.assertEquals("Вы ввели вещественное число, введите целое число: ",
                temp.input("99.2"));
    }
    @Test
    public void format(){
        Multiply1_2 temp = new Multiply1_2();
        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = ",
                temp.format(181232375));
    }
    @Test
    public void format2(){
        Multiply1_2 temp = new Multiply1_2();
        Assertions.assertEquals("0 = ",
                temp.format(0));
    }
    @Test
    public void multiply(){
        Multiply1_2 temp = new Multiply1_2();
        Assertions.assertEquals(25, temp.multiply(55));
    }
    @Test
    public void multiply2(){
        Multiply1_2 temp = new Multiply1_2();
        Assertions.assertEquals(10080, temp.multiply(181232375));
    }
    @Test
    public void multiply3(){
        Multiply1_2 temp = new Multiply1_2();
        Assertions.assertEquals(0, temp.multiply(0));
    }
}
