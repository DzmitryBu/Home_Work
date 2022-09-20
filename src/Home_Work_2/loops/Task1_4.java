package Home_Work_2.loops;
import java.util.Scanner;

public class Task1_4 {
    long a = 1;
    int b;
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        String number = console.nextLine();

        Task1_4 temp = new Task1_4();

        temp.b = temp.input(number);

        long max = temp.multiply(temp.b);
        System.out.println(temp.printResult(temp.b));
    }
    public String printResult(int b){
        long result = multiply(b);
        return "Значение результата до переполнения: " + result +
                "\nЗначение результата после переполнения: " + result * b;
    }

    public int input(String number) {
        Scanner console = new Scanner(System.in);
        int b = 0;
        boolean numberInt = true;

        do {
            try {
                if ((number.toLowerCase().contains("e") || number.toLowerCase().contains("."))) {
                    double d = Double.parseDouble(number);//вещественный тип
                    System.out.println("Вы ввели вещественное число, введите целое число: ");
                    number = console.nextLine();
                } else {
                    b = Integer.parseInt(number);
                    numberInt = false;
                }
            } catch (NumberFormatException nfe) { //строчный тип
                System.out.println("Вы ввели символы, введите целое число:  ");
                number = console.nextLine();
            }
        }
        while (numberInt);
        return b;
    }

    /**
     * метод производите перемножение 1 на переданное в метод число до момента, предшествующего переполнения
     * результата метода, таким образом идет проверка переполнения и ее предотвращение
     * @param b - второе произведение выражения
     * @return методу возвращается произведение чисел перед переполнением
     */
    public long multiply(int b){
        long result = 1;
        if(b == 0) {
            return 0;
        }
        if(b == 1) {
                return 1;
        }
        if(b == -1) {
            return -1;
        }
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

