package Home_Work_2.loops;

public class Task1_6 {
    /**
     * метод позволяет вывести таблицу умножения от 2 до 9.
     * @param args
     */
    public static void main(String[] args){
        System.out.println(multiplicationTable());
    }
    public static String multiplicationTable(){
        String result = "";
        for(int i = 1; i <= 10; i++){
            for(int j = 2; j <= 5; j++){
                result = result + j + " * " + i + " = " + j * i + " | ";
            }
            result = result + "\n";
        }
        result = result + "_________________________________________________________\n";
        for(int i = 1; i <= 10; i++) {
            for (int j = 6; j < 10; j++) {
                result = result + j + " * " + i + " = " + j * i + " | ";
            }
            result = result + "\n";
        }
        return result;
    }
}
