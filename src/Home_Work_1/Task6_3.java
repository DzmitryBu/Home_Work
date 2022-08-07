package Home_Work_1;
import java.util.Scanner;

public class Task6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = in.next();//записываем в переменную полученное от пользователя значение

        switch (name){
            case ("Вася")://сравниваем переменную name c "Вася"
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;//если в результате сравнения true, то завершаем оператор switch
            case ("Анастасия")://сравниваем переменную name c "Анастасия"
                System.out.println("Я тебя так долго ждал");
                break;//если в результате сравнения true, то завершаем оператор switch
            default://если ни одно из условий не выполнено, то выполняем дефолтовое действие
                System.out.println("Добрый день, а вы кто?");
                break;
        }

    }
}
