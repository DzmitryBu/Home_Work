package Home_Work.Home_Work_2.loops;

import Home_Work_2.loops.Task1_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_4Test {
    @Test
    public void multiply(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals(0l, temp.multiply(0));
    }
    @Test
    public void multiply1(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals(1l, temp.multiply(1));
    }
    @Test
    public void multiply2(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals(4052555153018976267l, temp.multiply(3));
    }
    @Test
    public void multiply3(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals(1560496482665168896l, temp.multiply(188));
    }
    @Test
    public void multiply4(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals(799006685782884121l, temp.multiply(-19));
    }
    @Test
    public void printResult(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals("Значение результата до переполнения: 1\n" +
                "Значение результата после переполнения: 1", temp.printResult(1));
    }
    @Test
    public void printResult2(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals("Значение результата до переполнения: 4052555153018976267\n" +
                "Значение результата после переполнения: -6289078614652622815", temp.printResult(3));
    }
    @Test
    public void printResult3(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals("Значение результата до переполнения: 1560496482665168896\n" +
                "Значение результата после переполнения: -1774566438301073408", temp.printResult(188));
    }
    @Test
    public void printResult4(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals("Значение результата до переполнения: 799006685782884121\n" +
                "Значение результата после переполнения: 3265617043834753317", temp.printResult(-19));
    }
    @Test
    public void printResult5(){
        Task1_4 temp = new Task1_4();
        Assertions.assertEquals("Значение результата до переполнения: 0\n" +
                "Значение результата после переполнения: 0", temp.printResult(0));
    }
}
