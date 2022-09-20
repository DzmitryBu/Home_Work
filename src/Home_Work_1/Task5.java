package Home_Work_1;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы в отпуске? true/false");
        boolean vacation = in.nextBoolean();//записываем в переменную полученное от пользователя значение
        System.out.println("Сегодня рабочий день недели? true/false");
        boolean weekday = in.nextBoolean();//записываем в переменную полученное от пользователя значение

        Task5 temp = new Task5();
        System.out.println(temp.printSleep(weekday, vacation));
    }
    /**
     *
     * @param weekday
     * @param vacation
     * @return
     */
    public boolean sleepIn (boolean weekday, boolean vacation){

        if (!weekday || vacation) {//если у нас не рабочий день, то не важно в отпуске ли мы, поэтому оператор ||
            return true;//возвращаем Да, спать, если в if true
        }
        return false;//иначе, пора вставать
    }
    public String printSleep(boolean weekday, boolean vacation){
        if (sleepIn(weekday, vacation)) {//проверяем условие при передачи в метод sleepIn 2-х переменных
            return "Вы можете спать дальше";
        } else return "Пора вставать на работу";
    }
}
