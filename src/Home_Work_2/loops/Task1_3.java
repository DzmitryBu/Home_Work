package Home_Work_2.loops;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Введи число, которое нужно возвести в степень: ");
        double number = console.nextDouble();
        System.out.println("Введи целое число, обозначающее степень возведения введенного числа: ");
        int degree = console.nextInt();

        System.out.println(numberInDegree(number, degree));
    }

    /**
     * Метод позволяем возвести число в указанную степень
     * @param a - число, которое необходимо возвести в степень
     * @param b - число, указывающее в какую степень необходимо возвести
     * @return - методу возвращается результат возведения числа а в степень b
     */
    public static double numberInDegree(double a, int b){
        double result;
        if (a == 0){
            return 1;
        } else if (a == 1){
            return a;
        } else {
            result = a;
            for (int i = 2; i <= b; i++){
                result = result * a;
            }
        }
        return result;
    }
}
