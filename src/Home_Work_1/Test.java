package Home_Work_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для перевода его в двоичную систему");
        byte number = in.nextByte();

        String binary = "";
        String[] array = new String[8];

        for (int i = 7; i >= 0; i--) {
            if (number % 2 == 0 && number > 0) {
                binary = "0";

            } else binary = "1";
            array[i] = binary;
        }
    }
}
