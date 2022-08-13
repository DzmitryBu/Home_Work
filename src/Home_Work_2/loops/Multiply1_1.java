package Home_Work_2.loops;
import java.util.Scanner;
import java.util.Arrays;

public class Multiply1_1 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
//        for (String number : args) {
//            System.out.println("Число, " + number);
//            long a = Long.parseLong(number);
        Scanner console = new Scanner(System.in);
        System.out.println("Введите положительное число");
        long a = console.nextLong();
            while (a <= 0 || a > 20) {
                if (a <= 0) {
                    System.out.println("Вы ввели отрицательное число или 0, повторите ввод!");
                a = console.nextLong();
                }
                if (a > 20) {
                    System.out.println("Вы ввели слишком большое число, будет переполнение переменной!");
                    System.out.println("Повторите ввод");
                a = console.nextLong();
                }
            }
            long b = multiply(a);
            String text = "1";

            for (int i = 2; i <= a; i++) {
                text = text + " * " + i;
            }
            System.out.println(text + " = " + multiply(a));
        }
//    }
    /**
     * метод перемножает подряд все числа от 1 до переданного значения переменной
     * @param a - переменная типа long
     * @return возвращает методу произведение всех чисел от 1 до а
     */
    public static long multiply(long a){
        long x = 1;
        for (int i = 1; i <= a; i++){
            x = x * i;
        }
        return x;
    }
}
