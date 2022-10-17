package Home_Work_6;

import Home_Work_6.job.EasySearch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleMain{
    public static void main(String[] args) {

        Convertion convertion = new Convertion();

        Scanner scanner = new Scanner(System.in);
        String stringFile;
        String fileName;

        System.out.println("Введите адрес папки с книгами: ");
        String adress = scanner.nextLine();

        File dir = new File(adress);
        File newFile = new File(adress + "\\result.txt");
        try {
            if(newFile.createNewFile()){
                System.out.println("Файл result.txt создан");
            }
        }catch (IOException e){
            System.out.println("Файл не создан");
        }


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

                stringFile = convertion.convertionFileToString(adress + "\\" + fileName);
                findWord(stringFile);
                System.out.println("Напишите \"exit\" для выхода");
            }
        }while (!(fileName.equals("exit")));


    }
    public static void findWord(String stringFile){
        String word;
        long count;
        Scanner scanner = new Scanner(System.in);
        EasySearch search = new EasySearch();
        do {
            System.out.println("Введите слово, которое хотите найти:");
            word = scanner.nextLine();
            count = search.search(stringFile,word);
            if(!word.equals("back")){
                System.out.println("Слово \"" + word + "\" встречается: " + count);
                System.out.print("Напишите \"back\" для возврата к выбору файла или ");
            }

        } while (!word.equals("back"));
    }

}
