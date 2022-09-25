package Home_Work_5.geters;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetNick implements IGetString{
    public static void main(String[] args) {
        GetNick a = new GetNick();
        System.out.println(a.getString());
    }
    /**
     * /**
     * Метод выбирает случайную строку со случайным псевдонимом, находящемся в коллекции.
     * @return - любой псевдоним, хронящийся в коллекции.
     */
    public String getString() {
        Random random = new Random();
        List <String> nicks = new ArrayList<>();
        nicks.add("Шарик");
        nicks.add("Бобик");
        nicks.add("Звезда");
        nicks.add("Нурф");
        nicks.add("Кроша");
        nicks.add("Ромашка");
        nicks.add("Зорька");
        nicks.add("Гоша");
        nicks.add("Бакс");
        nicks.add("Цезарь");
        nicks.add("Дрон");
        nicks.add("Носок");
        nicks.add("Хряк");
        nicks.add("Том");
        nicks.add("Морс");
        nicks.add("Лапша");
        nicks.add("Хряк");

        int lengt = nicks.size();
        int number = random.nextInt(lengt);

        return nicks.get(number);
    }
}
