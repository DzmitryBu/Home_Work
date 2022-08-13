package Home_Work_2.arrays;
import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ArraysIteration {
    /**
     * метод вызывает метод arrayFromConsole, что бы получить массив, и выводит все элементы
     * массива в консоль
     */
    public static void allElementsArray(){
        int[] arr = arrayFromConsole();

//Перебор массива через цикл do...while
        int i = 0;
        System.out.print("Перебор массива через цикл do...while имеет вид: ");
        do {
            System.out.print(arr[i] + " ");
            i++;
        }
        while (i < arr.length);
        System.out.println();

//перебор массива через цикл while
        System.out.print("Перебор массива через цикл while имеет вид: ");
        i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

//Перебор массива через цикл for
        System.out.print("Перебор массива через цикл for имеет вид: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//Перебор массива через цикл foreach
        System.out.print("Перебор массива через цикл foreach имеет вид: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * метод вызывает метод arrayFromConsole, что бы получить массив, и выводит каждый второй элемент
     * массива в консоль, за исключением цикла foreach (данный цикл этого не позволяет сделать)
     */
    public static void everySecondElement(){
        int[] arr = arrayFromConsole();

//Каждый второй элемент массива через цикл do...while
        int i = 1;
        System.out.print("Каждый второй элемент массива через цикл do...while имеет вид: ");
        do {
            System.out.print(arr[i] + " ");
            i+=2;
        }
        while (i < arr.length);
        System.out.println();

//Каждый второй элемент массива через цикл while
        System.out.print("Каждый второй элемент массива через цикл while имеет вид: ");
        i = 1;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i+=2;
        }
        System.out.println();

//Каждый второй элемент массива через цикл for
        System.out.print("Каждый второй элемент массива через цикл for имеет вид: ");
        for (i = 1; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//Каждый второй элемент массива через цикл foreach не получится вывести, т.к. foreach обрабатывает все элементы.
        System.out.print("Каждый второй элемент массива через цикл foreach имеет вид: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * метод вызывает метод arrayFromConsole, что бы получить массив, и выводит все элементы
     * массива в обратном порядке в консоль, за исключением цикла foreach
     * (данный цикл этого не позволяет сделать)
     */
    public static void arrayInReverse(){
        int[] arr = arrayFromConsole();

//Вывести все элементы массива в обратном порядке через цикл do...while
        int i = arr.length - 1;
        System.out.print("Массив в обратном порядке через цикл do...while имеет вид: ");
        do {
            System.out.print(arr[i] + " ");
            i--;
        }
        while (i >= 0);
        System.out.println();

//Вывести все элементы массива в обратном порядке через цикл while
        System.out.print("Массив в обратном порядке через цикл while имеет вид: ");
        i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println();

//Вывести все элементы массива в обратном порядке через цикл for
        System.out.print("Массив в обратном порядке через цикл for имеет вид: ");
        for (i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//Вывести все элементы массива в обратном порядке через цикл foreach не получится,
// т.к. foreach обрабатывает все элементы от первого до последнего элемента.
        System.out.print("Массив в обратном порядке через цикл foreach имеет вид: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
