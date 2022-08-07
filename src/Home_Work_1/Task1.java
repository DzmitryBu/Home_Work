package Home_Work_1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = in.nextInt(); // в переменную записывается введенное число 3 (0000_0011)
        System.out.println("Введите второе число");
        int number2 = in.nextInt(); // в переменную записывается введенное число 5 (0000_0101)

        int sum = number1 & number2; // 0000_0011 & 0000_0101 = 0000_0001 (Это число 1)
        int ili = number1 | number2; // 0000_0011 | 0000_0101 = 0000_0111 (Это число 7)

        /*
        с числом 42.5 нельзя использовать побитовые операторы,
        т.к. они работают только с целочисленными типами
        */

        System.out.println("Побитовое сложение числа " + number1 + " и числа " + number2 + " равно: " + sum);
        System.out.println("Побитовое или числа " + number1 + " и числа " + number2 + " равно: " + ili);
    }
}
