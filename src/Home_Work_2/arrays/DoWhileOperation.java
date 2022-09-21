package Home_Work_2.arrays;

import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class DoWhileOperation implements IArraysOperation{
    public static void main(String[] args){
        DoWhileOperation array = new DoWhileOperation();
        int[] arr = arrayFromConsole();
        System.out.println(array.allElementsArray(arr));
        System.out.println("Каждый второй элемент массива через цикл do...while имеет вид:"
                + Arrays.toString(array.everySecondElement(arr)));
        System.out.println("Массив в обратном порядке через цикл do...while имеет вид:"
                + Arrays.toString(array.arrayInReverse(arr)));
    }
    /**
     * метод вызывает метод arrayFromConsole, что бы получить массив, и выводит все элементы
     * массива в консоль
     */
    @Override
    public String allElementsArray(int[] arr) {

//Перебор массива через цикл do...while
        String result;
        int i = 0;
        result = "Перебор массива через цикл do...while имеет вид:";
        do {
            result = result + " " + arr[i];
            i++;
        }
        while (i < arr.length);
        return  result;
    }

    @Override
    public int[] everySecondElement(int[] arr) {
        int[] result = new int[0];
        int i = 1;
        int j = 0;
        do {
            result = Arrays.copyOf(result, result.length + 1);
            result[j] = arr[i];
            i+=2;
            j++;
        }
        while (i < arr.length);
        return result;
    }

    @Override
    public int[] arrayInReverse(int[] arr) {
        int i = arr.length - 1;
        int j = 0;
        int[] result = new int[arr.length];
        do {
            result[i] = arr[j];
            i--;
            j++;
        }
        while (i >= 0);
        return result;
    }
}
