package Home_Work.Home_Work_1;

import Home_Work_1.Task5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {
    @Test
    public void sleepIn(){
        Task5 temp = new Task5();
        Assertions.assertEquals(true, temp.sleepIn(true, true));
    }
    @Test
    public void sleepIn2(){
        Task5 temp = new Task5();
        Assertions.assertEquals(false, temp.sleepIn(true, false));
    }
    @Test
    public void sleepIn3(){
        Task5 temp = new Task5();
        Assertions.assertEquals(true, temp.sleepIn(false, true));
    }
    @Test
    public void sleepIn4(){
        Task5 temp = new Task5();
        Assertions.assertEquals(true, temp.sleepIn(false, false));
    }
    @Test
    public void printSleep(){
        Task5 temp = new Task5();
        Assertions.assertEquals("Вы можете спать дальше", temp.printSleep(true, true));
    }
    @Test
    public void printSleep2(){
        Task5 temp = new Task5();
        Assertions.assertEquals("Пора вставать на работу", temp.printSleep(true, false));
    }
    @Test
    public void printSleep3(){
        Task5 temp = new Task5();
        Assertions.assertEquals("Вы можете спать дальше", temp.printSleep(false, true));
    }
    @Test
    public void printSleep4(){
        Task5 temp = new Task5();
        Assertions.assertEquals("Вы можете спать дальше", temp.printSleep(false, false));
    }
}
