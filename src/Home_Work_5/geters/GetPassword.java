package Home_Work_5.geters;

import java.util.Random;

public class GetPassword implements IGetString{
    /**
     * /**
     * Метод генерирует строку со случайными символами английского алфавита и числами.
     * Длина строки может быть в диапазоне от 5 до 11.
     * @return - строку в диапазоне от 5 до 11
     */

    public String getString() {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        int x = random.nextInt(6);
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < (5 + x); i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
