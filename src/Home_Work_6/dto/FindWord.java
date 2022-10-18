package Home_Work_6.dto;

import Home_Work_6.ConsoleMain;
import Home_Work_6.Convertion;
import Home_Work_6.job.EasySearch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindWord {
    private String word;
    private long count;

    /**
     * Метод конвертирует указанный файл @param fileName в папке @param adress  в строку с применением метода
     * convertion класса Convertion.
     * Затем создает файл result.txt в папке по указанному адресу @param adress, если он не был создан.
     * Метод осуществляет взаимодействие с пользователем через консоль и производит поиск указанного через консоль
     * слова в указанном файле по указанному адресу
     * @param adress - адрес папки
     * @param fileName - имя файла, в котором будет производиться поиск
     */
    public void findWord(String adress, String fileName){

        Convertion convertion = new Convertion();
        Scanner scanner = new Scanner(System.in);
        EasySearch search = new EasySearch();
        String wordScan;

        File newFile = new File(adress + "\\result.txt");
        try {
            if(newFile.createNewFile()){
                System.out.println("Файл result.txt создан");
            }
        }catch (IOException e){
            System.out.println("Файл не создан");
        }
        String stringFile = convertion.convertionFileToString(adress + "\\" + fileName);

        do {
            System.out.println("Введите слово, которое хотите найти:");
            wordScan = scanner.nextLine();
            if(!wordScan.equals("back")){
                count = search.search(stringFile,wordScan);
                word = wordScan;

                ConsoleMain.creatResult(newFile,fileName,word,count);

                System.out.println("Слово \"" + word + "\" встречается: " + count);
                System.out.print("Напишите \"back\" для возврата к выбору файла или ");
            }
        } while (!wordScan.equals("back"));
    }
}
