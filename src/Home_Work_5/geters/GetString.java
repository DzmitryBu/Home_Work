package Home_Work_5.geters;

import java.util.Random;

public class GetString implements IGetString{
    private int length;

    public GetString(int length) {
        this.length = length;
    }
    public GetString() {
        Random random = new Random();
        this.length = 10 + random.nextInt(15);
    }
    /**
     * /**
     * Метод генерирует строку со случайными символами английского алфавита и числами.
     * Длина строки может быть в диапазоне от 10 до 26.
     * @return - строку в диапазоне от 10 до 26
     */
    @Override
    public String getString() {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
