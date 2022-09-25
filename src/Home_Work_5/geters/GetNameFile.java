package Home_Work_5.geters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetNameFile implements IGetString{
    public static void main(String[] args) {
        GetNameFile nameFile = new GetNameFile();
        nameFile.reader();

        System.out.println(nameFile.getString());
    }

    private List <String> names = new ArrayList <String>();

    /**
     * Метод позволяет получить случайное имя из коллекции
     * @return возвращает случайное имя из коллекции
     */
    @Override
    public String getString() {
        reader();
        Random random = new Random();
        int index = random.nextInt(names.size());
        return names.get(index);
    }

    /**
     * метод позволяет считать построчно файл и поместить каждую полученную строку в коллекцию типа List,
     * каждая строка, новый элемент в коллекции
     */
    public void reader() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Home_Work/names.txt"))){
            String line = null;
            while((line = reader.readLine()) != null){
                names.add(line);
            }
        }catch (IOException e){
            System.out.println("Проблемы с чтением файла");
        }
    }
}
