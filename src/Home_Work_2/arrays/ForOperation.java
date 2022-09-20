package Home_Work_2.arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ForOperation implements IArraysOperation{
    public static void main(String[] args){
        ForOperation array = new ForOperation();
        int[] arr = arrayFromConsole();
        System.out.println(array.allElementsArray(arr));
        System.out.println(array.everySecondElement(arr));
        System.out.println(array.arrayInReverse(arr));
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
    public String everySecondElement(int[] arr) {
        String result;
        result = "Каждый второй элемент массива через цикл for имеет вид:";
        for (int i = 1; i < arr.length; i+=2) {
            result = result + " " + arr[i];
        }
        return result;
    }

    @Override
    public String arrayInReverse(int[] arr) {
        String result;
        result = "Массив в обратном порядке через цикл for имеет вид:";
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + " " + arr[i];
        }
        return result;
    }
}
