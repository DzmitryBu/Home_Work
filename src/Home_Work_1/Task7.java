package Home_Work_1;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers[]  = new int[10];//создаем массив с длиной массива 10
        System.out.println("Введите 10 чисел номера телефона");
        for (int i = 0; i < 10; i++){//цикл, позволяющий записать каждое веденное число пользователя в новую позицию в массиве
            numbers[i] = in.nextInt();//заполняем массив
        }
        System.out.println("Вы ввели следующие цифры:");
        for (int i = 0; i < 10; i++){//цикл, позволяющий вывести каждое веденное число пользователя
            System.out.print(" " + numbers[i]);
        }
        System.out.println();//делаем /n от распечатоной строки
        System.out.println("Номер телефона в формате: " + creatPhoneNumber(numbers));//распечатем отформатированный номер из результата метода

    }
    public static String creatPhoneNumber(int[] numbers){//Далее наверное ГОВНОКОД, т.к. слишком длинный))
         String number = "(" + numbers[0] + numbers[1] + numbers[2] + ")" + " " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];

        return number;//возвращаем методу значение переменной number
    }
}
