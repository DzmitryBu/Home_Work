package Home_Work_2.loops;
import java.util.Random;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральне число: ");
        int number = console.nextInt();

        int maxNumber = maxNumber(number);

        System.out.println("Наибольшая цифра натурального числа " + number + ": " + maxNumber);
        System.out.println("Вероятность четных чисел в работе генератора чисел: " + (probabilityEvenNumbers() * 100) + "%");

        System.out.println(evenAndOddNumber(number));

        System.out.println("Введите колличество чисел последовательности Фибоначи");
        int index = console.nextInt();
        System.out.println("Последовательность Фибоначи длиной " + index + ": " + fibonachi(index));

        System.out.println("Введите минимальное число в ряду");
        int min = console.nextInt();
        System.out.println("Введите максимальное число в ряду");
        int max = console.nextInt();
        System.out.println("Введите шаг в ряду чисел");
        int step = console.nextInt();
        System.out.println("Ряд чисел имеет вид: " + seriesOfNumbers(min, max, step));

        System.out.println("Введите число для его переворота");
        int numberToFlip = console.nextInt();
        System.out.println("Число после переворота: " + numberFlip(numberToFlip));

    }

    /**
     * метод позволяет вывести наибольшую цифру натурального числа.
     * @param a - натуральное число передается в метод, для его анализа на наибольшую цифру.
     * @return возвращается наибольшре число, найденное в натуральном числе.
     */
    public static int maxNumber(int a){
        int max = 0;
        int b;
        while(a != 0){
            b = a % 10;
            if(b > max){
                max = b;
            }
            a = a / 10;
        }
        return max;
    }

    /**
     * метод поволяет определить вероятность выпадения четных случайных чисел.
     * @return метод возвращает значение вероятности выпадения четных случайных чисел.
     */
    public static double probabilityEvenNumbers(){
        Random rand = new Random();
        double even = 0;
        for(int i = 0; i < 1001; i++){
            int a = rand.nextInt(20);
            if(a % 2 == 0)
                even++;
        }
        return even/1000;
    }

    /**
     * метод позволяет определить колличество четных и нечетных чисел во введенном пользователем.
     * натуральном числе. Метод выводит сообщения о количестве четных и нечетных чисел.
     * @param a натуральное число, введенное пользователем через консоль.
     */
    public static String evenAndOddNumber(int a){
        int number = a;
        int evenNumber = 0;
        int oddNumber = 0;
        if(a == 0){
            evenNumber++;
        }
        while(a != 0){
            if (a % 2 == 0){
                evenNumber++;
            } else {
                oddNumber++;
            }
            a = a / 10;
        }
        return "В числе " + number + " чётных цифр: " + evenNumber +
                "\nВ числе " + number + " нечётных цифр: " + oddNumber;
    }

    /**
     * метод позволяет вывести на экран столько чисел последовательности Фибоначчи, сколько указал пользователь.
     * @param a количество чисел в последовательности Фибоначчи, сапрогенных пользователем.
     * @return метод возвращает полученную последовательность Фибоначчи.
     */
    public static String fibonachi(int a){
        if(a == 0){
            return "0";
        }
        String result = "1";
        int x = 1;
        int y = 1;
        int z;
        for (int i = 2; i <= a; i++){
            z = x + y;
            result = result + " " + z;
            x = y;
            y = z;
        }
        return result;
    }

    /**
     * метод позволяет вывести ряд натуральных чисел от указаннго минимума до указанного максимума
     * с указанным шагом.
     * @param min минимальное число в последовательности чисел, задается пользователем.
     * @param max максимальное число в последовательности чисел, задается пользователем.
     * @param step шаг в последовательности чисел, задается пользователем.
     * @return метод возвращает строку, содержащую последовательность чисел с заданными параметрами.
     */
    public static String seriesOfNumbers(int min, int max, int step){
        String result = "";
        if (step == 0){
            return "Произойдет зацикливание!";
        }
        for(int i = min; i <= max; i += step){
            if(i == min){
                result = "" + i;
            }else{
                result = result + " " + i;
            }
        }
        return result;
    }

    /**
     * метод позволяет перевернуть полученное число (последние числа сделать первыми).
     * @param a число, заданное пользователем для последующего преобразования.
     * @return метод возвращает строку, содержащую перевернутое число.
     */
    public static String numberFlip(int a){
        String result = "";
        int b = 0;
        while(a != 0){
            b = a % 10;
            result = result + b;
            a = a / 10;
        }
        return result;
    }
}
