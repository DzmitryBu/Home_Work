package Home_Work_1;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для перевода его в двоичную систему");
        byte number = in.nextByte();

        System.out.println("Число " + number + " в двоичной системе имеет вид: " + toBinaryString(number));
    }
    public static String toBinaryString(byte number){
        String bit = "";
        String binary = "";
        String[] array = new String[8];

        for (int i = 7; i >= 0; i--) {
            if (number > 0){
                if (number % 2 == 0) {
                    binary = "0";
                } else
                    binary = "1";

                number = (byte) (number / 2);
                array[i] = binary;
            } else {
                if (number % 2 == 0) {
                    binary = "1";
                } else {
                binary = "0";}

                number = (byte) (number / 2);
                array[i] = binary;
            }
        }
        for (int i = 0; i < 8; i++){
            bit = bit + array[i];
        }
        return bit;
    }
}
