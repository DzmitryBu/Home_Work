package Home_Work_2.arrays;

import java.util.Scanner;

import static Home_Work_2.arrays.ArraysUtils.arrayFromConsole;
import static Home_Work_2.arrays.ArraysUtils.arrayRandom;

public class Task2_1 {
    public static void main(String[] args){
        int[] container = arrayFromConsole();
        for(int i = 0; i < container.length; i++){
            System.out.print(container[i] + " ");
        }
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива, для заполнения его случайными элементами: ");
        int length = console.nextInt();
        System.out.println("Укажите до какого числа генерировать случайные числа: ");
        int x = console.nextInt();

        int[] containerRand = arrayRandom(length, x);

        for(int i = 0; i < containerRand.length; i++) {
            System.out.print(containerRand[i] + " ");
        }
    }
}
