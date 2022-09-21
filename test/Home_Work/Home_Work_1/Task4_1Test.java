package Home_Work.Home_Work_1;

import Home_Work_1.Task4_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_1Test {
    @Test
    public void even(){
        Task4_1 number = new Task4_1();
        Assertions.assertEquals("Введенное число 2 является чётным", number.evenOrNot(2));
    }
    @Test
    public void zero(){
        Task4_1 number = new Task4_1();
        Assertions.assertEquals("Введенное число 0 является чётным", number.evenOrNot(0));
    }
    @Test
    public void notEven(){
        Task4_1 number = new Task4_1();
        Assertions.assertEquals("Введенное число 3 является нечётным", number.evenOrNot(3));
    }
    @Test
    public void notEvenMinus(){
        Task4_1 number = new Task4_1();
        Assertions.assertEquals("Введенное число -3 является нечётным", number.evenOrNot(-3));
    }
    @Test
    public void evenMinus(){
        Task4_1 number = new Task4_1();
        Assertions.assertEquals("Введенное число -6 является чётным", number.evenOrNot(-6));
    }
}
