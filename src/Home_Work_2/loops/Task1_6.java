package Home_Work_2.loops;

public class Task1_6 {
    /**
     * метод позволяет вывести таблицу умножения от 2 до 9.
     * @param args
     */
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            for(int j = 2; j <= 5; j++){
                System.out.print(j + " * " + i + " = " + j * i + " | ");
            }
            System.out.println(" ");
        }
        System.out.println("_________________________________________________________");
        for(int i = 1; i <= 10; i++) {
            for (int j = 6; j < 10; j++) {
                System.out.print(j + " * " + i + " = " + j * i + " | ");
            }
            System.out.println(" ");
        }
    }
}
