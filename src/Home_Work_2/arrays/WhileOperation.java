package Home_Work_2.arrays;

import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class WhileOperation implements IArraysOperation{
    public static void main(String[] args){
        WhileOperation array = new WhileOperation();
        int[] arr = arrayFromConsole();
        System.out.println(array.allElementsArray(arr));
        System.out.println("Каждый второй элемент массива через цикл while имеет вид:"
                + Arrays.toString(array.everySecondElement(arr)));
        System.out.println("Массив в обратном порядке через цикл while имеет вид:"
                + Arrays.toString(array.arrayInReverse(arr)));
    }

    @Override
    public String allElementsArray(int[] arr) {
        String result;
        result = "Перебор массива через цикл while имеет вид:";
        int i = 0;
        while (i < arr.length) {
            result = result + " " + arr[i];
            i++;
        }
        return result;
    }

    @Override
    public int[] everySecondElement(int[] arr) {
        int[] result = new int[0];
        int i = 1;
        int j = 0;
        while (i < arr.length) {
            result = Arrays.copyOf(result, result.length + 1);
            result[j] = arr[i];
            i+=2;
            j++;
        }
        return result;
    }

    @Override
    public int[] arrayInReverse(int[] arr) {
        int[] result = new int[arr.length];
        int i = arr.length - 1;
        int j = 0;
        while (i >= 0) {
            result[j] = arr[i];
            i--;
            j++;
        }
        return result;
    }
}
