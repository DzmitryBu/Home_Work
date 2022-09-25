package Home_Work_5.geters;

import java.util.*;

public class GetName implements IGetString{
    public static void main(String[] args) {
        GetName a = new GetName();
        System.out.println(a.getString());
    }

    /**
     * /**
     * Метод выбирает случайную строку со случайными именем, находящиеся в коллекции.
     * @return - любое имя, хронящееся в коллекции.
     */
    public String getString() {
        Random random = new Random();
        List <String> names = new ArrayList<>();
        names.add("Дима");
        names.add("Саша");
        names.add("Света");
        names.add("Петя");
        names.add("Вася");
        names.add("Полина");
        names.add("Рамзес");
        names.add("Гоша");
        names.add("Святослав");
        names.add("Джордж");
        names.add("Рома");
        names.add("Александр");
        names.add("Юля");
        names.add("Том");
        names.add("Ромео");
        names.add("Роналдо");
        names.add("Мария");

        int lengt = names.size();
        int number = random.nextInt(lengt);

        return names.get(number);
    }
}
