package Home_Work_2.arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ForEachOperation implements IArraysOperation{
    public static void main(String[] args){
        ForEachOperation array = new ForEachOperation();
        int[] arr = arrayFromConsole();
        array.allElementsArray(arr);
        array.everySecondElement(arr);
        array.arrayInReverse(arr);
    }

    @Override
    public void allElementsArray(int[] arr) {
        System.out.print("Перебор массива через цикл foreach имеет вид: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {
        System.out.print("Каждый второй элемент массива через цикл foreach имеет вид: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public void arrayInReverse(int[] arr) {
        System.out.print("Массив в обратном порядке через цикл foreach имеет вид: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
