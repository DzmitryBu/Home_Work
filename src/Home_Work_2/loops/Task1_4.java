package Home_Work_2.loops;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args){
        long a = 1;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        String number = console.nextLine();

        int b = 0;
        boolean numberInt = true;
        do {
            try {
                if ((number.toLowerCase().contains("e") || number.toLowerCase().contains("."))) {
                    double d = Double.parseDouble(number);
                    System.out.println("Вы ввели вещественное число, введите целое число: ");
                    number = console.nextLine();
                }
                else {
                    b = Integer.parseInt(number);
                    numberInt = false;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Вы ввели символы, введите целое число:  ");
                number = console.nextLine();
            }
        }
        while (numberInt);

        long max = multiply(a, b);
        System.out.println("Значение результата до переполнения: " + max);
        System.out.println("Значение результата после переполнения: " + max * b);
    }

    /**
     * метод производите перемножение 1 на переданное в метод число до момента, предшествующего переполнения
     * результата метода, таким образом идет проверка переполнения и ее предотвращение
     * @param a переменная, которая задана в программе и умнажается на второе число
     * @param b - второе произведение выражения
     * @return методу возвращается произведение чисел перед переполнением
     */
    public static long multiply(long a, int b){
        long result = a;
        if(b > 0) {
            while (result < (Long.MAX_VALUE / b)) {
                result = result * b;
            }
            return result;
        } else {
            while (result > 0 && result < Long.MIN_VALUE / b || result < 0 && result > Long.MAX_VALUE / b) {
            result = result * b;
        }
            return result;
        }
    }
}

