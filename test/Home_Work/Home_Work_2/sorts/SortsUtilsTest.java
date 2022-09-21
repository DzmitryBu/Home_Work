package Home_Work.Home_Work_2.sorts;

import Home_Work_2.sorts.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortsUtilsTest {
    @Test
    public void bubble(){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        SortsUtils.bubble(arr);
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, arr);
    }
    @Test
    public void bubble2(){
        int[] arr = new int[]{1, 1, 1, 1};
        SortsUtils.bubble(arr);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, arr);
    }
    @Test
    public void bubble3(){
        int[] arr = new int[]{9, 1, 5, 99, 9, 9};
        SortsUtils.bubble(arr);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arr);
    }
    @Test
    public void bubble4(){
        int[] arr = new int[]{};
        SortsUtils.bubble(arr);
        Assertions.assertArrayEquals(new int[]{}, arr);
    }
    @Test
    public void bubble5(){
        int[] arr = new int[]{6, 5, 4, 3, 2, 1};
        SortsUtils.bubble(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6},arr);
    }
    @Test
    public void bubble6(){
        int[] arr = new int[]{1, 222, 13, 4, 555, 76, -99};
        SortsUtils.bubble(arr);
        Assertions.assertArrayEquals(new int[]{-99, 1, 4, 13, 76, 222, 555},arr);
    }
    @Test
    public void shake(){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        SortsUtils.shake(arr);
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, arr);
    }
    @Test
    public void shake2(){
        int[] arr = new int[]{1, 1, 1, 1};
        SortsUtils.shake(arr);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, arr);
    }
    @Test
    public void shake3(){
        int[] arr = new int[]{9, 1, 5, 99, 9, 9};
        SortsUtils.shake(arr);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arr);
    }
    @Test
    public void shake4(){
        int[] arr = new int[]{};
        SortsUtils.shake(arr);
        Assertions.assertArrayEquals(new int[]{}, arr);
    }
    @Test
    public void shake5(){
        int[] arr = new int[]{6, 5, 4, 3, 2, 1};
        SortsUtils.shake(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6},arr);
    }
    @Test
    public void shake6(){
        int[] arr = new int[]{1, 222, 13, 4, 555, 76, -99};
        SortsUtils.shake(arr);
        Assertions.assertArrayEquals(new int[]{-99, 1, 4, 13, 76, 222, 555},arr);
    }
}
