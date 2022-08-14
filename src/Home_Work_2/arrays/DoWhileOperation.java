package Home_Work_2.arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class DoWhileOperation implements IArraysOperation{
    public static void main(String[] args){
        DoWhileOperation array = new DoWhileOperation();
        int[] arr = arrayFromConsole();
        array.allElementsArray(arr);
        array.everySecondElement(arr);
        array.arrayInReverse(arr);
    }
    /**
     * метод вызывает метод arrayFromConsole, что бы получить массив, и выводит все элементы
     * массива в консоль
     */
    @Override
    public void allElementsArray(int[] arr) {

//Перебор массива через цикл do...while
        int i = 0;
        System.out.print("Перебор массива через цикл do...while имеет вид: ");
        do {
            System.out.print(arr[i] + " ");
            i++;
        }
        while (i < arr.length);
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {

//Каждый второй элемент массива через цикл do...while
        int i = 1;
        System.out.print("Каждый второй элемент массива через цикл do...while имеет вид: ");
        do {
            System.out.print(arr[i] + " ");
            i+=2;
        }
        while (i < arr.length);
        System.out.println();
    }

    @Override
    public void arrayInReverse(int[] arr) {

//Вывести все элементы массива в обратном порядке через цикл do...while
        int i = arr.length - 1;
        System.out.print("Массив в обратном порядке через цикл do...while имеет вид: ");
        do {
            System.out.print(arr[i] + " ");
            i--;
        }
        while (i >= 0);
        System.out.println();
    }
}
