package Home_Work_1;
import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int year = in.nextInt();//записываем в переменную полученное от пользователя значение

        if (year % 4 == 0 && year % 400 != 0){//високосный, если делется на 4 без остатка и НЕ делится на 400 без остатка
            System.out.println("Вы ввели " + year + " год и он является високосным");
        } else//иначе год НЕ високосный
            System.out.println("Вы ввели " + year + " год и он является НЕвисокосным");
    }
}
