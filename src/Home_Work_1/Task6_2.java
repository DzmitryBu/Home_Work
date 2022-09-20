package Home_Work_1;
import java.util.Scanner;
import java.util.Objects;

public class Task6_2 implements ICommunicationPrinter{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String welcom(String name) {
        if (Objects.equals(name, "Вася")) {
            return "Привет!\nЯ тебя так долго ждал";
        } else if (Objects.equals(name, "Анастасия")) {//сравниваем переменную name c "Анастасия"
            return "Я тебя так долго ждал";
        }else//если ни одно из условий не выполнено, то выполняем следующее действие
            return "Добрый день, а вы кто?";
    }
}
