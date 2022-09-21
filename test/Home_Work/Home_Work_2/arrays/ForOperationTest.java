package Home_Work.Home_Work_2.arrays;

import Home_Work_2.arrays.ForOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForOperationTest {
    @Test
    public void allElementsArray(){
        ForOperation temp = new ForOperation();
        Assertions.assertEquals("Перебор массива через цикл for имеет вид: 1 2 3 4 5 6 7 8 9",
                temp.allElementsArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
    @Test
    public void everySecondElement(){
        ForOperation temp = new ForOperation();
        Assertions.assertArrayEquals( new int[]{2, 4, 6, 8},
                temp.everySecondElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
    @Test
    public void everySecondElement2(){
        ForOperation temp = new ForOperation();
        Assertions.assertArrayEquals( new int[]{1, 3, 5, 7, 9},
                temp.everySecondElement(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
    @Test
    public void arrayInReverse(){
        ForOperation temp = new ForOperation();
        Assertions.assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1},
                temp.arrayInReverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}
