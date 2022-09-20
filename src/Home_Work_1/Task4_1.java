package Home_Work_1;
import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки на нечётность типа integer");
        int number = in.nextInt();//записываем в переменную полученное от пользователя значение

        Task4_1 temp = new Task4_1();
        System.out.println(temp.evenOrNot(number));
    }
    public String evenOrNot(int number){
        if (number % 2 == 0) {//проверяем, делится ли число на 2 без остатка, если да, то оно четное
            return "Введенное число " + number + " является чётным";
        } else {//иначе не четное
            return "Введенное число " + number + " является нечётным";
        }
    }
}
