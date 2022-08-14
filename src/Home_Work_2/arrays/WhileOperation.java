package Home_Work_2.arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class WhileOperation implements IArraysOperation{
    public static void main(String[] args){
        WhileOperation array = new WhileOperation();
        int[] arr = arrayFromConsole();
        array.allElementsArray(arr);
        array.everySecondElement(arr);
        array.arrayInReverse(arr);
    }

    @Override
    public void allElementsArray(int[] arr) {
        System.out.print("Перебор массива через цикл while имеет вид: ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {
        System.out.print("Каждый второй элемент массива через цикл while имеет вид: ");
        int i = 1;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i+=2;
        }
        System.out.println();
    }

    @Override
    public void arrayInReverse(int[] arr) {
        System.out.print("Массив в обратном порядке через цикл while имеет вид: ");
        int i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println();
    }
}
