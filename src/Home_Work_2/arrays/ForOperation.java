package Home_Work_2.arrays;

import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ForOperation implements IArraysOperation{
    public static void main(String[] args){
        ForOperation array = new ForOperation();
        int[] arr = arrayFromConsole();
        System.out.println(array.allElementsArray(arr));
        System.out.println("Каждый второй элемент массива через цикл for имеет вид:"
                + Arrays.toString(array.everySecondElement(arr)));
        System.out.println("Массив в обратном порядке через цикл for имеет вид:"
                + Arrays.toString(array.arrayInReverse(arr)));
    }

    @Override
    public String allElementsArray(int[] arr) {
        String result;
        result = "Перебор массива через цикл for имеет вид:";
        for (int i = 0; i < arr.length; i++) {
           result = result + " " + arr[i];
        }
        return result;
    }

    @Override
    public int[] everySecondElement(int[] arr) {
        int[] result = new int[0];
        int j = 0;
        for (int i = 1; i < arr.length; i+=2) {
            result = Arrays.copyOf(result, result.length + 1);
            result[j] = arr[i];
            j++;
        }
        return result;
    }

    @Override
    public int[] arrayInReverse(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j] = arr[i];
            j++;
        }
        return result;
    }
}
