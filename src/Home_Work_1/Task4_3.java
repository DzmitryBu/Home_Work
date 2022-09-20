package Home_Work_1;
import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа типа integer для проверки на делимость");
        int number1 = in.nextInt();//записываем в переменную полученное от пользователя значение 1
        int number2 = in.nextInt();//записываем в переменную полученное от пользователя значение 2

        Task4_3 temp = new Task4_3();
        System.out.println(temp.divisibility(number1, number2));

    }

    public String divisibility(int a, int b) {
        if (a % b == 0) {//проверяем на деление без остатка число1 на число2
            return "Число " + a + " делится на число " + b + " без остатка";
        } else if (b % a == 0) {//проверяем на деление без остатка число2 на число1
            return "Число " + b + " делится на число " + a + " без остатка";
        } else {
            return "Остаток от деления числа " + a + " на " + b + ": " + a % b +
                   "\nОстаток от деления числа " + b + " на " + a + ": " + b % a;
        }
    }
}

