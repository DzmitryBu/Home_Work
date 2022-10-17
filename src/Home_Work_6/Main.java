package Home_Work_6;

import Home_Work_6.decorator.CaseIgnoreDecorator;
import Home_Work_6.decorator.SearchEnginePunctuationNormalizer;
import Home_Work_6.job.EasySearch;
import Home_Work_6.job.RegExSearch;

public class Main {
    public static void main(String[] args) {
        Convertion text = new Convertion();
        String stroka = text.convertionFileToString("Война и мир_книга2.txt");

        System.out.println(stroka);

        System.out.println("Печатаю коллекцию convertionStrToSet с длиной - " + text.convertionStrToSet(stroka).size());
        System.out.println(text.convertionStrToSet(stroka));

        System.out.println("Печатаю Top слов в тексте");
        System.out.println(text.getTopWords(stroka,100));

        System.out.println("Результат EasySearch поиск \"война\"");
        EasySearch easySearch = new EasySearch();
        System.out.println(easySearch.search(stroka, "война"));

        System.out.println("Результат RegExSearch поиск \"война\"");
        RegExSearch regExSearch = new RegExSearch();
        System.out.println(regExSearch.search(stroka, "война"));

//        System.out.println("Результат декоратора SearchEnginePunctuationNormalizer ПРЕПИНАНИЯ");
//        SearchEnginePunctuationNormalizer decorator = new SearchEnginePunctuationNormalizer(new RegExSearch());
//        System.out.println(decorator.replacePunct(stroka));

//        System.out.println("Результат декоратора SearchEnginePunctuationNormalizer ТОЧКИ");
//        System.out.println(decorator.replacePoint(stroka));

//        System.out.println("Результат декоратора SearchEnginePunctuationNormalizer ВВОД");
//        System.out.println(decorator.replaceN(stroka));

        System.out.println("Результат декоратора CaseOf + EasySearch поиск \"война\"");
        CaseIgnoreDecorator decoratorCase = new CaseIgnoreDecorator(new EasySearch());
        System.out.println(decoratorCase.search(stroka, "война"));

        System.out.println("Результат декоратора CaseOf + RegExSearch поиск \"война\"");
        CaseIgnoreDecorator decoratorCase2 = new CaseIgnoreDecorator(new RegExSearch());
        System.out.println(decoratorCase2.search(stroka, "война"));

        System.out.println("Результат EasySearch поиск \"и\"");
        EasySearch easySearch2 = new EasySearch();
        System.out.println(easySearch.search(stroka, "и"));

        System.out.println("Результат RegExSearch поиск \"и\"");
        RegExSearch regExSearch2 = new RegExSearch();
        System.out.println(regExSearch.search(stroka, "и"));

        System.out.println("Результат декоратора CaseOf + EasySearch поиск \"и\"");
        CaseIgnoreDecorator decoratorCase22 = new CaseIgnoreDecorator(new EasySearch());
        System.out.println(decoratorCase.search(stroka, "и"));

        System.out.println("Результат декоратора CaseOf + RegExSearch поиск \"и\"");
        CaseIgnoreDecorator decoratorCase222 = new CaseIgnoreDecorator(new RegExSearch());
        System.out.println(decoratorCase2.search(stroka, "и"));

        System.out.println("Результат EasySearch поиск \"мир\"");
        EasySearch easySearch3 = new EasySearch();
        System.out.println(easySearch.search(stroka, "мир"));

        System.out.println("Результат RegExSearch поиск \"мир\"");
        RegExSearch regExSearch3 = new RegExSearch();
        System.out.println(regExSearch.search(stroka, "мир"));

        System.out.println("Результат декоратора CaseOf + EasySearch поиск \"мир\"");
        CaseIgnoreDecorator decoratorCase33 = new CaseIgnoreDecorator(new EasySearch());
        System.out.println(decoratorCase.search(stroka, "мир"));

        System.out.println("Результат декоратора CaseOf + RegExSearch поиск \"мир\"");
        CaseIgnoreDecorator decoratorCase333 = new CaseIgnoreDecorator(new RegExSearch());
        System.out.println(decoratorCase2.search(stroka, "мир"));
    }
}


