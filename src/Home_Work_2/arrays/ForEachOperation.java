package Home_Work_2.arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ForEachOperation implements IArraysOperation{
    public static void main(String[] args){
        ForEachOperation array = new ForEachOperation();
        int[] arr = arrayFromConsole();
        System.out.println(array.allElementsArray(arr));
        System.out.println(array.everySecondElement(arr));
        System.out.println(array.arrayInReverse(arr));
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
    public String everySecondElement(int[] arr) {
        String result;
        int count = 0;
        result = "Каждый второй элемент массива через цикл foreach имеет вид:";
        for (int element : arr) {
            count++;
            if(count % 2 == 0){
                result = result + " " + element;
            }
        }
        return result;
    }

    @Override
    public String arrayInReverse(int[] arr) {
        String result = "";
        boolean firstElement = true;
        for (int element : arr) {
            if(firstElement){
                result = element + "";
                firstElement = false;
            }else {
                result = element + " " + result;
            }
        }
        return "Массив в обратном порядке через цикл foreach имеет вид: " + result;
    }
}
