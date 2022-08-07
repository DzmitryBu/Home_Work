package Home_Work_1;
import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа типа integer");
        int number1 = in.nextInt();//записываем в переменную полученное от пользователя значение 1
        int number2 = in.nextInt();//записываем в переменную полученное от пользователя значение 2
        int number3 = in.nextInt();//записываем в переменную полученное от пользователя значение 3


        if (number1 < number2 && number2 < number3) {//сравниваем 3 числа, если true, то среднее число 2
            System.out.println("Среди введенных чисел " + number1 + " " + number2 + " " + number3 + " среднее: " + number2);
        } else if (number2 < number3 && number3 < number1) {//сравниваем 3 числа, если true, то среднее число 3
            System.out.println("Среди введенных чисел " + number1 + " " + number2 + " " + number3 + " среднее: " + number3);
        } else {// иначе среднее число 1
            System.out.println("Среди введенных чисел " + number1 + " " + number2 + " " + number3 + " среднее: " + number1);
        }
    }
}
