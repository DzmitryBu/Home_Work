package Home_Work_2.sorts;

import java.util.Arrays;

public class SortsUtils {
    /**
     *  Метод сортирует переданный ему массив от меньшего элемента к большему
     *  при помощи алгоритма пузырьковой сортировки.
     * @param arr в метод передается массив целочисленного типа.
     */
    public String bubble(int[] arr){
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return "Массив после сортировки bubble: " + Arrays.toString(arr);
    }

    /**
     * Метод сортирует переданный ему массив от меньшего элемента к большему
     * при помощи алгоритма шейкерной сортировки.
     * @param arr в метод передается массив целочисленного типа.
     */
    public String shake(int[] arr){
        int temp;
        int left = 0;
        int right = arr.length - 1;
        int flag = 1;
        while(left < right && flag > 0){
            flag = 0;
            for(int i = left; i < right; i++){
                if(arr[i] > arr[i + 1]){
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    flag = 1;
                }
            }
            right--;
            for(int j = right; j > left; j--){
                if(arr[j] < arr[j - 1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = 1;
                }
            }
            left++;
        }
        return "Массив после сортировки shake: " + Arrays.toString(arr);
    }
}
