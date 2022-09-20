package Home_Work_2.arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class WhileOperation implements IArraysOperation{
    public static void main(String[] args){
        WhileOperation array = new WhileOperation();
        int[] arr = arrayFromConsole();
        System.out.println(array.allElementsArray(arr));
        System.out.println(array.everySecondElement(arr));
        System.out.println(array.arrayInReverse(arr));
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
    public String everySecondElement(int[] arr) {
        String result;
        result = "Каждый второй элемент массива через цикл while имеет вид:";
        int i = 1;
        while (i < arr.length) {
            result = result + " " + arr[i];
            i+=2;
        }
        return result;
    }

    @Override
    public String arrayInReverse(int[] arr) {
        String result;
        result = "Массив в обратном порядке через цикл while имеет вид:";
        int i = arr.length - 1;
        while (i >= 0) {
            result = result + " " + arr[i];
            i--;
        }
        return result;
    }
}
