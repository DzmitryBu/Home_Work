package Home_Work_2.sorts;

import java.util.Arrays;

import static Home_Work_2.sorts.SortsUtils.*;
import static Home_Work_2.utils.ArraysUtils.*;

public class SortsMain {
    public static void main(String[] args){
        SortsUtils temp = new SortsUtils();

        int[] arr1 = new int[]{1,2,3,4,5,6};
        System.out.print("Массив до сортировки: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(temp.bubble(arr1));
        System.out.println(temp.shake(arr1));

        int[] arr2 = new int[]{1,1,1,1};
        System.out.print("Массив до сортировки: ");
        System.out.println(Arrays.toString(arr2));
        System.out.println(temp.bubble(arr2));
        System.out.println(temp.shake(arr2));

        int[] arr3 = new int[]{9,1,5,99,9,9};
        System.out.print("Массив до сортировки: ");
        System.out.println(Arrays.toString(arr3));
        System.out.println(temp.bubble(arr3));
        System.out.println(temp.shake(arr3));

        int[] arr4 = new int []{};
        System.out.print("Массив до сортировки: ");
        System.out.println(Arrays.toString(arr4));
        System.out.println(temp.bubble(arr4));
        System.out.println(temp.shake(arr4));

        int[] arr5 = new int[]{6,5,4,3,2,1};
        System.out.print("Массив до сортировки: ");
        System.out.println(Arrays.toString(arr5));
        System.out.println(temp.bubble(arr5));
        System.out.println(temp.shake(arr5));

        int[] arr6 = arrayRandom(50, 100);
        System.out.print("Массив до сортировки: ");
        System.out.println(Arrays.toString(arr6));
        System.out.println(temp.bubble(arr6));
        System.out.println(temp.shake(arr6));

        int[] arr7 = arrayFromConsole();
        System.out.print("Массив до сортировки");
        System.out.println(Arrays.toString(arr7));
        System.out.println(temp.bubble(arr7));
        System.out.println(temp.shake(arr7));
    }
}
