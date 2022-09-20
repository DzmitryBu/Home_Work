package Home_Work_2.loops;
import java.util.Scanner;

public class Task1_3 {
    private double number;
    private int degree;

    public static void main(String[] args){
        Task1_3 temp = new Task1_3();
        temp.input();
        System.out.println(temp.printResult(temp.number, temp.degree));
    }
    public void input(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введи число, которое нужно возвести в степень: ");
        this.number = console.nextDouble();
        System.out.println("Введи целое число, обозначающее степень возведения введенного числа: ");
        this.degree = console.nextInt();
    }

    /**
     * Метод позволяем возвести число в указанную степень
     * @param a - число, которое необходимо возвести в степень
     * @param b - число, указывающее в какую степень необходимо возвести
     * @return - методу возвращается результат возведения числа а в степень b
     */
    public double numberInDegree(double a, int b){
        double result;
        if (b == 0){
            return 1;
        } else if (b == 1){
            return a;
        } else {
            result = a;
            for (int i = 2; i <= b; i++){
                result = result * a;
            }
        }
        return result;
    }
    public String printResult(double number, int degree){
        return number + " ^ " + degree +" = " + numberInDegree(number, degree);
    }
}
