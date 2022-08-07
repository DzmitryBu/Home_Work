package Home_Work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = in.next();//записываем в переменную полученное от пользователя значение

        if (Objects.equals(name, "Вася")) {//сравниваем переменную name c "Вася"
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(name, "Анастасия") && !Objects.equals(name, "Вася")){
            System.out.println("Добрый день, а вы кто?");
        }

    }

}
