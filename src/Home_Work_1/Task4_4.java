package Home_Work_1;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите объем памяти в байтах");
        int memoryByt1 = in.nextInt(); //записываем в переменную полученное от пользователя значение

        Task4_4 temp = new Task4_4();
        System.out.println("Объем памяти " + memoryByt1 + " в байтах представлено в Кб: " + temp.bytToKb(memoryByt1));

        System.out.println("Введите объем памяти в Кб");
        int memoryKb2 = in.nextInt();//записываем в переменную полученное от пользователя значение

        System.out.println("Объем памяти  " + memoryKb2 + " в Кб представлено в байтах: " + temp.kbToByt(memoryKb2));
    }

    public double bytToKb(int byt){
        return byt / 1024d;
    }

    public int kbToByt(int kb){
        return  kb * 1024;// переводим в байты
    }
}
