package Home_Work.Home_Work_2.arrays;

import Home_Work_2.arrays.Task2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_4Test {
    @Test
    public void sumOfEvenElements(){
        Task2_4 temp = new Task2_4();
        Assertions.assertEquals(56,
                temp.sumOfEvenElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
    }
    @Test
    public void maximumOfEvenIndexed(){
        Task2_4 temp = new Task2_4();
        Assertions.assertEquals(83,
                temp.maximumOfEvenIndexed(new int[]{1, 2, 83, 4, 5, 6, 7,8 ,9, 10, 11, 12, 13, 14, 15}));
    }
    @Test
    public void maximumOfEvenIndexed2(){
        Task2_4 temp = new Task2_4();
        Assertions.assertEquals(15,
                temp.maximumOfEvenIndexed(new int[]{1, 82, 3, 4, 5, 6, 7,8 ,9, 10, 11, 12, 13, 14, 15}));
    }
    @Test
    public void elementsLessThanArithmeticMean(){
        Task2_4 temp = new Task2_4();
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7},
                temp.elementsLessThanArithmeticMean(new int[]{1, 2, 3, 4, 5, 6, 7 ,8 ,9 , 10, 11, 12, 13, 14, 15}));
    }
    @Test
    public void twoSmallestArrayElements(){
        Task2_4 temp = new Task2_4();
        Assertions.assertArrayEquals(new int[]{0, 1},
                temp.twoSmallestArrayElements(new int[]{1, 2, 3, 4, 5, 6, 7 ,8 ,9 , 0, 11, 12, 13, 14, 15}));
    }
    @Test
    public void compressArray(){
        Task2_4 temp = new Task2_4();
        Assertions.assertArrayEquals(new int[]{1, 2, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                temp.compressArray(new int[]{1, 2, 3, 4, 5, 6, 7 ,8 ,9 , 10, 11, 12, 13, 14, 15}, 3, 13));
    }
    @Test
    public void sumOfArrayDigits(){
        Task2_4 temp = new Task2_4();
        Assertions.assertEquals(66,
                temp.sumOfArrayDigits(new int[]{1, 2, 3, 4, 5, 6, 7 ,8 ,9 , 10, 11, 12, 13, 14, 15}));
    }
}
