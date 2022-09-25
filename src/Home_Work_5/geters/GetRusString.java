package Home_Work_5.geters;

import java.util.Random;

public class GetRusString implements IGetString{
    private int length;

    public GetRusString(int length) {
        this.length = length;
    }
    public GetRusString() {
        Random random = new Random();
        this.length = 10 + random.nextInt(15);
    }

    /**
     * /**
     * Метод генерирует строку со случайными символами русского алфавита.
     *  Длина строки может быть в диапазоне от 10 до 25.
     * @return - строку в диапазоне от 10 до 25
     */
    @Override
    public String getString() {
        String str = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            int number = random.nextInt(65);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
