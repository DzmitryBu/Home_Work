package Home_Work_1;
import java.util.Scanner;
import java.util.Objects;

public class Task6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = in.next();//записываем в переменную полученное от пользователя значение

        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else if (Objects.equals(name, "Анастасия")) {//сравниваем переменную name c "Анастасия"
            System.out.println("Я тебя так долго ждал");
            }else//если ни одно из условий не выполнено, то выполняем следующее действие
                System.out.println("Добрый день, а вы кто?");
    }

}
