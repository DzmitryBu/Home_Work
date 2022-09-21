package Home_Work_2.sorts;

import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.*;

public class SortsMain {
    public static void main(String[] args){
        SortsUtils temp = new SortsUtils();

        int[] arr1 = new int[]{1,2,3,4,5,6};
        System.out.println("Массив до сортировки: " + Arrays.toString(arr1));
        int[] arr1ToBubble = Arrays.copyOf(arr1,arr1.length);
        SortsUtils.bubble(arr1ToBubble);
        System.out.println("Массив после сортировки bubble: " + Arrays.toString(arr1ToBubble));
        int[] arr1ToShake = Arrays.copyOf(arr1,arr1.length);
        SortsUtils.shake(arr1ToShake);
        System.out.println("Массив после сортировки shake: " + Arrays.toString(arr1ToShake));

        int[] arr2 = new int[]{1,1,1,1};
        System.out.println("Массив до сортировки: " + Arrays.toString(arr2));
        int[] arr2ToBubble = Arrays.copyOf(arr2,arr2.length);
        SortsUtils.bubble(arr2ToBubble);
        System.out.println("Массив после сортировки bubble: " + Arrays.toString(arr2ToBubble));
        int[] arr2ToShake = Arrays.copyOf(arr2,arr2.length);
        SortsUtils.shake(arr2ToShake);
        System.out.println("Массив после сортировки shake: " + Arrays.toString(arr2ToShake));

        int[] arr3 = new int[]{9,1,5,99,9,9};
        System.out.println("Массив до сортировки: " + Arrays.toString(arr3));
        int[] arr3ToBubble = Arrays.copyOf(arr3,arr3.length);
        SortsUtils.bubble(arr3ToBubble);
        System.out.println("Массив после сортировки bubble: " + Arrays.toString(arr3ToBubble));
        int[] arr3ToShake = Arrays.copyOf(arr3,arr3.length);
        SortsUtils.shake(arr3ToShake);
        System.out.println("Массив после сортировки shake: " + Arrays.toString(arr3ToShake));

        int[] arr4 = new int []{};
        System.out.println("Массив до сортировки: " + Arrays.toString(arr4));
        int[] arr4ToBubble = Arrays.copyOf(arr4,arr4.length);
        SortsUtils.bubble(arr4ToBubble);
        System.out.println("Массив после сортировки bubble: " + Arrays.toString(arr4ToBubble));
        int[] arr4ToShake = Arrays.copyOf(arr4,arr4.length);
        SortsUtils.shake(arr4ToShake);
        System.out.println("Массив после сортировки shake: " + Arrays.toString(arr4ToShake));

        int[] arr5 = new int[]{6,5,4,3,2,1};
        System.out.println("Массив до сортировки: " + Arrays.toString(arr5));
        int[] arr5ToBubble = Arrays.copyOf(arr5,arr5.length);
        SortsUtils.bubble(arr5ToBubble);
        System.out.println("Массив после сортировки bubble: " + Arrays.toString(arr5ToBubble));
        int[] arr5ToShake = Arrays.copyOf(arr5,arr5.length);
        SortsUtils.shake(arr5ToShake);
        System.out.println("Массив после сортировки shake: " + Arrays.toString(arr5ToShake));

        int[] arr6 = arrayRandom(50, 100);
        System.out.println("Массив до сортировки: " + Arrays.toString(arr6));
        int[] arr6ToBubble = Arrays.copyOf(arr6,arr6.length);
        SortsUtils.bubble(arr6ToBubble);
        System.out.println("Массив после сортировки bubble: " + Arrays.toString(arr6ToBubble));
        int[] arr6ToShake = Arrays.copyOf(arr6,arr6.length);
        SortsUtils.shake(arr6ToShake);
        System.out.println("Массив после сортировки shake: " + Arrays.toString(arr6ToShake));

        int[] arr7 = arrayFromConsole();
        System.out.println("Массив до сортировки: " + Arrays.toString(arr7));
        int[] arr7ToBubble = Arrays.copyOf(arr7,arr7.length);
        SortsUtils.bubble(arr7ToBubble);
        System.out.println("Массив после сортировки bubble: " + Arrays.toString(arr7ToBubble));
        int[] arr7ToShake = Arrays.copyOf(arr7,arr7.length);
        SortsUtils.shake(arr7ToShake);
        System.out.println("Массив после сортировки shake: " + Arrays.toString(arr7ToShake));
    }
}
