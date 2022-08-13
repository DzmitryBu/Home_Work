package Home_Work_2.utils;
import java.util.Scanner;
import java.util.Random;

public class ArraysUtils {
    /**
     * метод запрашивает у пользователя через консоль информацию о размере массива и значении каждого его элемента.
     * @return метод возвращает массив типа int.
     */
    public static int[] arrayFromConsole(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = console.nextInt();
        int[] conteiner = new int[length];

        for(int i = 0; i <conteiner.length; i++){
            System.out.println("Введите значение элемента массива: ");
            conteiner[i] = console.nextInt();
        }
         return conteiner;
    }

    /**
     * метод позволяет сосздать массив размером size - переданным от пользователя и с элементами,
     * созданными в случайном порядке до значения, не привыщаюшего maxValueExclusion, переданного
     * от пользователя.
     * @param size - размер массива, переданного из консоли.
     * @param maxValueExclusion - до какого значения элементы массива будут генерироваться,
     * задается пользователем и передается в метод.
     * @return возвращается массив типа int.
     */
    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] conteiner = new int[size];
        Random rand = new Random ();
        for(int i = 0; i < conteiner.length; i++){
            conteiner[i] = rand.nextInt(maxValueExclusion);
        }
        return conteiner;
    }
}
