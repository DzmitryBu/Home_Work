package Home_Work_1;
import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа типа integer");
        int number1 = in.nextInt();//записываем в переменную полученное от пользователя значение 1
        int number2 = in.nextInt();//записываем в переменную полученное от пользователя значение 2
        int number3 = in.nextInt();//записываем в переменную полученное от пользователя значение 3

        Task4_2 temp = new Task4_2();
        System.out.println(temp.compar(number1, number2, number3));
    }
    public  String compar(int a, int b, int c){
        if ((a < b && b < c) || (c < b && b < a)) {//сравниваем 3 числа, если true, то среднее число 2
            return "Среди введенных чисел " + a + " " + b + " " + c + " среднее: " + b;
        } else if ((b < c && c < a) || (a < c && c < b)) {//сравниваем 3 числа, если true, то среднее число 3
            return "Среди введенных чисел " + a + " " + b + " " + c + " среднее: " + c;
        } else {// иначе среднее число 1
            return "Среди введенных чисел " + a + " " + b + " " + c + " среднее: " + a;
        }
    }
}
