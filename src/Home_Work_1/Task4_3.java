package Home_Work_1;
import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа типа integer для проверки на делимость");
        int number1 = in.nextInt();//записываем в переменную полученное от пользователя значение 1
        int number2 = in.nextInt();//записываем в переменную полученное от пользователя значение 2

        if (number1 % number2 == 0){//проверяем на деление без остатка число1 на число2
            System.out.println("Число " + number1 + " делится на число " + number2 + " без остатка");
        }else if (number2 % number1 == 0){//проверяем на деление без остатка число2 на число1
            System.out.println("Число " + number2 + " делится на число " + number1 + " без остатка");
        }else
            System.out.println("Остаток от деления числа " + number1 + " на " + number2 + ": " + number1 % number2);
            System.out.println("Остаток от деления числа " + number2 + " на " + number1 + ": " + number2 % number1);

    }
}
