package Home_Work_2.loops;
import java.util.Arrays;
import java.util.Scanner;

public class Multiply1_2 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
//        for (String number : args) {
//            System.out.println("Число, " + number);
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        String number = console.nextLine();
            long l = 0;
            boolean numberInt = true;
            do {
                try {
                    if ((number.toLowerCase().contains("e") || number.toLowerCase().contains("."))) {
                        double d = Double.parseDouble(number);//вещественный тип
                        System.out.println("Вы ввели вещественное число, введите целое число: ");
                        number = console.nextLine();
                    }
                    else {
                        l = Long.parseLong(number);
                        numberInt = false;
                    }
                } catch (NumberFormatException nfe) { //строчный тип
                    System.out.println("Вы ввели не целое число, введите целое число:  ");
                    number = console.nextLine();
                }
            }
            while (numberInt);
        System.out.println(format(l) + " = " + multiply(l));
    }

    /**
     *метод преобразует переданное в метод число в произведение каждого его элемента (1234 = 1 * 2 * 3 * 4)
     * @param b число, передаваемое в метод для преобразования
     * @return методу возвращается значение в виде строки, преобразованной в произведение чисел.
     */
    public static String format(long b) {
        String text = "";
        long c;
        while (b != 0) {
            if (b / 10 == 0){
                c = b % 10;
                text = c + text;
                b = b / 10;
            } else {
                c = b % 10;
                text = " * " + c + text;
                b = b / 10;
            }
        }
        return text;
    }

    /**
     * метод позволяет все элементы числа между собой
     * @param a - число, переданной в метод, для меремножения каждого его элемента
     * @return методу возвращается результат произведение всех элементов числа
     */
    public static long multiply (long a){
        long b;
        long result = 1;
        while (a != 0){
            b = a % 10;
            result = result * b;
            a = a / 10;
        }
        return result;
    }
}
