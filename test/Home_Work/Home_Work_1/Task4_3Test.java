package Home_Work.Home_Work_1;

import Home_Work_1.Task4_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_3Test {
    @Test
    public void divisibility1(){
        Task4_3 temp = new Task4_3();
        Assertions.assertEquals("Число 4 делится на число 2 без остатка", temp.divisibility(4,2));
    }
    @Test
    public void divisibility2(){
        Task4_3 temp = new Task4_3();
        Assertions.assertEquals("Число 9 делится на число 3 без остатка", temp.divisibility(3,9));
    }
    @Test
    public void divisibility3(){
        Task4_3 temp = new Task4_3();
        Assertions.assertEquals("Остаток от деления числа 3 на 5: 3" +
                "\nОстаток от деления числа 5 на 3: 2", temp.divisibility(3,5));
    }

}
