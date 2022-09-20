package Home_Work_1;
import java.util.Scanner;

public class Task6_3 implements ICommunicationPrinter{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String welcom(String name) {
        switch (name){
            case ("Вася")://сравниваем переменную name c "Вася"
                return "Привет!\nЯ тебя так долго ждал";
            case ("Анастасия")://сравниваем переменную name c "Анастасия"
                return "Я тебя так долго ждал";
            default://если ни одно из условий не выполнено, то выполняем дефолтовое действие
                return "Добрый день, а вы кто?";
        }
    }
}
