package Home_Work_1;
import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 0 до 127, что бы узнать это буква или символ");
        int number = in.nextInt();//записываем в переменную полученное от пользователя значение

        Task4_5 temp = new Task4_5();
        System.out.println(temp.whatChar(number));

    }
    public String whatChar(int number){
        if (65 <= number && number <= 90){//проверяем буквы верхнее регистра
            return  "Введенный код - это буква латинского алфавита в верхнем регистре";
        } else if (97 <= number && number <= 122){// проверяем буквы нижнего регистра
            return "Введенный код - это буква латинского алфавита в нижнем регистре";
        }else return"Веденный код - это символ или цифра" ;//иначе это символы и цифры
    }
}
