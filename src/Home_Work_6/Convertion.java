package Home_Work_6;

import Home_Work_6.comporator.ComparatorMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Convertion {

    public String  convertionFileToString (String adress) {
        String text = "";
        int read = 0;

            try (FileReader input = new FileReader(adress)) {
                read = input.read();
                 do {
                     text = text + (char) read;
                }
                while ((read = input.read()) != -1);

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
        }
        return text;
    }

    public Set<String> convertionStrToSet(String stroka){
        Set<String> words = new HashSet<>();
//        Pattern pattern = Pattern.compile("\\s*(\\s-|\\s|--|!|;|,|\\?|\\.)\\s*");
//        String[] wordsArray = pattern.split(stroka);
        String[] wordsArray =
                stroka.split
                        ("\\s*(\\s-|\\s|--|!|\"|;|:|\\(|\\)|\\*|,|\\?|\\.+)\\s*");

        for (String s : wordsArray) {
            if (!s.equals("")){
                words.add(s);
            }
        }
        return words;
    }
    public List getTopWords(String stroka, int top){
        Map<String, Integer> words = new HashMap<>();
        String[] wordsArray =
                stroka.split
                        ("\\s*(\\s-|\\s|--|!|\"|;|'|:|\\(|\\)|\\*|,|\\?|\\.+)\\s*");

        for (String s : wordsArray) {
            if (!(s.equals(""))) {
                words.putIfAbsent(s, 0);
                words.put(s, (words.get(s) + 1));
            }
        }

        List wordsTop = new ArrayList(words.entrySet());
        wordsTop.sort(new ComparatorMap());

        List wordsTopN = wordsTop.subList(0,top);
        return wordsTopN;
    }
}
