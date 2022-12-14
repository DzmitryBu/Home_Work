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
            Multiply1_1 temp = new Multiply1_1();
            System.out.println(temp.printResult(a));
    }
    public String printResult (long a){
        String text = "1";
        for (int i = 2; i <= a; i++) {
            text = text + " * " + i;
        }
        long b = multiply(a);
        long c = recursion(a);
        return "Рещультат метода multiply: " + text + " = " + b
                + "\nРещультат метода recursion: " + text + " = " + c;
    }
    /**
     * метод перемножает подряд все числа от 1 до переданного значения переменной
     * @param a - переменная типа long
     * @return возвращает методу произведение всех чисел от 1 до а
     */
    public long multiply(long a){
        if(a == 0){
            return 0;
        }else {
            long x = 1;
            for (int i = 1; i <= a; i++) {
                x = x * i;
            }
            return x;
        }
    }
    public long recursion(long a) {
        if (a == 0) {
            return 0;
        } else {
            long x = 1;
            if (a == 1) {
                return x;
            }
            x = a * recursion(a - 1);
            return x;
        }
    }
}
