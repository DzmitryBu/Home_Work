package Home_Work_2.arrays;

import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ForEachOperation implements IArraysOperation{
    public static void main(String[] args){
        ForEachOperation array = new ForEachOperation();
        int[] arr = arrayFromConsole();
        System.out.println(array.allElementsArray(arr));
        System.out.println("Каждый второй элемент массива через цикл foreach имеет вид:"
                + Arrays.toString(array.everySecondElement(arr)));
        System.out.println("Массив в обратном порядке через цикл foreach имеет вид:"
                + Arrays.toString(array.arrayInReverse(arr)));
    }

    @Override
    public String allElementsArray(int[] arr) {
        String result;
        result = "Перебор массива через цикл foreach имеет вид:";
        for (int element : arr) {
            result = result + " " + element;
        }
        return result;
    }
    @Override
    public int[] everySecondElement(int[] arr) {
        int [] result = new int[0];
        int i = 0;
        int j = 0;
        for (int element : arr) {
            i++;
            if(i % 2 == 0){
                result = Arrays.copyOf(result, result.length + 1);
                result[j] = arr[i - 1];
                j++;
            }
            if(i == arr.length){
                break;
            }
        }
        return result;
    }
    @Override
    public int[] arrayInReverse(int[] arr) {
        int[] result = new int[arr.length];
        int i = arr.length - 1;
        for (int element : arr) {
            result[i] = element;
            i--;
        }
        return result;
    }
}
