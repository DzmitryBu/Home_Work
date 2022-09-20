package Home_Work_1;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите объем памяти в байтах");
        int memoryByt1 = in.nextInt(); //записываем в переменную полученное от пользователя значение

        Task4_4 temp = new Task4_4();
        System.out.println(temp.bytToKb(memoryByt1));

        System.out.println("Введите объем памяти в Кб");
        int memoryKb2 = in.nextInt();//записываем в переменную полученное от пользователя значение

        System.out.println(temp.kbToByt(memoryKb2));
    }

    public String bytToKb(int byt){
        double memoryKb1 = byt / 1024d;
        return "Объем памяти в байтах " + byt + " представлено в Кб: " + memoryKb1;
    }

    public String kbToByt(int kb){
        int memoryByt2 = kb * 1024;// переводим в байты
        return "Объем памяти в Кб " + kb + " представлено в байтах: " + memoryByt2;
    }
}
