package Home_Work_5.geters;

import java.util.Random;

public class GetAge {
    public static void main(String[] args) {
        GetAge a = new GetAge();
        System.out.println(a.getAge());
    }

    /**
     * Метод позволяет получить случайное число в диапазоне от 1 до 16
     * @return - случайное число в диапазоне от 1 до 16
     */
    public int getAge() {
        Random random = new Random();
        int age = random.nextInt(15);
        return age + 1;
    }
}
