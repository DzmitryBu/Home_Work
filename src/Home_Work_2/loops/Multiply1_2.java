package Home_Work_2.loops;
import java.util.Arrays;
import java.util.Scanner;

public class Multiply1_2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        String number = console.nextLine();

        Multiply1_2 temp = new Multiply1_2();

        long l = temp.input(number);

        System.out.println(format(l) + multiply(l));
    }
    public long input(String number) {
        Scanner console = new Scanner(System.in);
        long l = 0;
        boolean numberInt = true;

        do {
            try {
                if ((number.toLowerCase().contains("e") || number.toLowerCase().contains("."))) {
                    double d = Double.parseDouble(number);//вещественный тип
                    System.out.println("Вы ввели вещественное число, введите целое число: ");
                    number = console.nextLine();
                } else {
                    l = Long.parseLong(number);
                    numberInt = false;
                }
            } catch (NumberFormatException nfe) { //строчный тип
                System.out.println("Вы ввели не число:  ");
                number = console.nextLine();
            }
        }
        while (numberInt);

        return l;
    }
    /**
     *метод преобразует переданное в метод число в произведение каждого его элемента (1234 = 1 * 2 * 3 * 4)
     * @param b число, передаваемое в метод для преобразования
     * @return методу возвращается значение в виде строки, преобразованной в произведение чисел.
     */
    public static String format(long b) {
        String text = "";
        if(b == 0){
            text = "0";
        }
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
        return text + " = ";
    }
    /**
     * метод позволяет перемножить все элементы числа между собой
     * @param a - число, переданной в метод, для меремножения каждого его элемента
     * @return методу возвращается результат произведение всех элементов числа
     */
    public static long multiply (long a){
        long b;
        long result = 1;
        if (a == 0){
            return 0;
        }
        while (a != 0){
            b = a % 10;
            result = result * b;
            a = a / 10;
        }
        return result;
    }
}
