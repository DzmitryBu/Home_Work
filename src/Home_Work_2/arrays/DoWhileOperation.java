package Home_Work_2.arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class DoWhileOperation implements IArraysOperation{
    public static void main(String[] args){
        DoWhileOperation array = new DoWhileOperation();
        int[] arr = arrayFromConsole();
        System.out.println(array.allElementsArray(arr));
        System.out.println(array.everySecondElement(arr));
        System.out.println(array.arrayInReverse(arr));
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
    public String everySecondElement(int[] arr) {

//Каждый второй элемент массива через цикл do...while
        String result;
        int i = 1;
        result = "Каждый второй элемент массива через цикл do...while имеет вид:";
        do {
            result = result + " " + arr[i];
            i+=2;
        }
        while (i < arr.length);
        return result;
    }

    @Override
    public String arrayInReverse(int[] arr) {

//Вывести все элементы массива в обратном порядке через цикл do...while
        String result;
        int i = arr.length - 1;
        result = "Массив в обратном порядке через цикл do...while имеет вид:";
        do {
            result = result + " " + arr[i];
            i--;
        }
        while (i >= 0);
        return result;
    }
}
