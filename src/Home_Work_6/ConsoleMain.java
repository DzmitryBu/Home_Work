package Home_Work_6;

import Home_Work_6.dto.FindWord;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleMain{

    public static void main(String[] args) {

        FindWord find = new FindWord();
        Scanner scanner = new Scanner(System.in);
        String fileName;

        System.out.println("Введите адрес папки с книгами: ");
        String adress = scanner.nextLine();

        File dir = new File(adress);
        String[] files = dir.list();

        do{
            System.out.println("В указанной папке находятся следующие файлы:");
            for (String file : files) {
                System.out.println(file);
            }
            System.out.println("Введите имя файла для работы с ним, в формате имя.формат_файла(name.txt):");

            boolean flag = true;
            do {
                fileName = scanner.nextLine();
                for (String file : files) {
                    if (file.equals(fileName) || fileName.equals("exit")) {
                        flag = false;
                    }
                }
                if(flag){
                    System.out.println("Введено неверное имя файла, повторите ввод");
                }
            }while (flag);

            //поиск слова в файле
            if(!(fileName.equals("exit"))){
                File data = new File(adress + "\\" + fileName);
                find.findWord(adress, fileName);
                System.out.println("Напишите \"exit\" для выхода");
            }
        }while (!(fileName.equals("exit")));
    }

    /**
     * Метод позволяет записать результаты всех поисков в файл
     * @param file - файл, куда сохраняем результаты
     * @param fileName - Имя файла
     * @param word - искомое слово
     * @param count - колличество повторений искомого слова в файле
     */
    public static void creatResult(File file, String fileName, String word, Long count){

        try(FileWriter writer = new FileWriter(file, true))
        {
            // запись результата
            String text = fileName + " - " + word + " - " + count + "\n";;
            writer.write(text);

            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
