package Home_Work_1;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите объем памяти в байтах");
        int memoryByt1 = in.nextInt(); //записываем в переменную полученное от пользователя значение

        double memoryKb1 = memoryByt1 / 1024d;//необходиму ставить d, что бы не потерять данные после точки
        System.out.println("Объем памяти в байтах " + memoryByt1 + " представлено в Кб: " + memoryKb1);

        System.out.println("Введите объем памяти в Кб");
        int memoryKb2 = in.nextInt();//записываем в переменную полученное от пользователя значение

        int memoryByt2 = memoryKb2 * 1024;// переводим в байты
        System.out.println("Объем памяти в Кб " + memoryKb2 + " представлено в байтах: " + memoryByt2);
    }
}
