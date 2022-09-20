package Home_Work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_1 implements ICommunicationPrinter{
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
   public String welcom(String name) {
        if (Objects.equals(name, "Вася")) {//сравниваем переменную name c "Вася"
            return "Привет!\nЯ тебя так долго ждал";
        }
        if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал";
        }
        return "Добрый день, а вы кто?";
    }
}
