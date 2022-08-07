package Home_Work_1;

public class Task3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 56;

        int sum = Math.addExact(a,b);
        System.out.println("Результат " + a + " + " + b + ": " + sum);

        int c = Math.max(a, b);
        System.out.println("Наибольшее число среди " + a + " и " + b + ": " + c);

        int d = Math.min(a, b);
        System.out.println("Наименьшее число среди " + a + " и " + b + ": " + d);

        double f = Math.sqrt(Math.max(a, b));
        System.out.println("Квадратный корень из наибольшего числа среди " + a + " и " + b + ": " + f);

        double k = Math.cbrt(Math.max(a, b));
        System.out.println("Кубический корень из наибольшего числа среди " + a + " и " + b + ": " + k);

        int r = Math.subtractExact(a, b);
        System.out.println("Результат " + a + " - " + b + ": " + r);

        double random1 = Math.random();
        double random2 = Math.random();
        double ramdomMax = Math.max(random1, random2);
        System.out.println("Большее из случайных чисел " + random1 + " и " + random2+ " : " + ramdomMax);
    }
}
