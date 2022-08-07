package Home_Work_1;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы в отпуске? true/false");
        boolean vacation = in.nextBoolean();//записываем в переменную полученное от пользователя значение
        System.out.println("Сегодня рабочий день недели? true/false");
        boolean weekday = in.nextBoolean();//записываем в переменную полученное от пользователя значение

        if (sleepIn(weekday, vacation)) {//проверяем условие при передачи в метод sleepIn 2-х переменных
            System.out.println("Вы можете спать дальше");
        } else System.out.println("Пора вставать на работу");
    }

    public static boolean sleepIn (boolean weekday, boolean vacation){

        if (!weekday || vacation) {//если у нас не рабочий день, то не важно в отпуске ли мы, поэтому оператор ||
            return true;//возвращаем Да, спать, если в if true
        }
        return false;//иначе, пора вставать
    }
}
