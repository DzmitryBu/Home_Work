package Home_Work_1;
import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки на нечётность типа integer");
        int number = in.nextInt();//записываем в переменную полученное от пользователя значение

        if (number % 2 == 0) {//проверяем, делится ди число на 2 без остатка, есди дв, то оно четное
            System.out.println("Введенное число " + number + " является чётным");
        } else {//иначе не четное
            System.out.println("Введенное число " + number + " является нечётным");
        }
    }
}
