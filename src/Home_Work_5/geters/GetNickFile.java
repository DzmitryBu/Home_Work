package Home_Work_5.geters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetNickFile implements IGetString{
        public static void main(String[] args) {
                GetNickFile nickFile = new GetNickFile();
                nickFile.reader();

                System.out.println(nickFile.getString());
        }
        /**
         * Метод позволяет получить случайное имя из коллекции
         * @return возвращает случайное имя из коллекции
         */
        private List<String> nicks = new ArrayList<String>();
        @Override
        public String getString() {
                reader();
                Random random = new Random();
                int index = random.nextInt(nicks.size());
                return nicks.get(index);
        }
        /**
         * метод позволяет считать построчно файл и поместить каждую полученную строку в коллекцию типа List,
         * каждая строка, новый элемент в коллекции
         */
        public void reader() {
                try (BufferedReader reader = new BufferedReader(new FileReader("Home_Work/nicks.txt"))){
                        String line = null;
                        while((line = reader.readLine()) != null){
                                nicks.add(line);
                        }
                }catch (IOException e){
                        System.out.println("Проблемы с чтением файла");
                }
        }
}
