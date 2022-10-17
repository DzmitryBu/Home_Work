package Home_Work.Home_Work_6.decorator;

import Home_Work_6.decorator.ISearchEngineDecorator;
import Home_Work_6.job.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ISearchEngineDecoratorTest {
    @Test
    public void search(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(1, temp.search(new String("привет, как дела!"),"привет"));
        Assertions.assertEquals(1, temp.search(new String("привет, как дела!"),"как"));
        Assertions.assertEquals(1, temp.search(new String("привет, как дела!"),"дела"));
    }
    @Test
    public void search1(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(1, temp.search(new String("привет,какдела!"),"привет"));
        Assertions.assertEquals(1, temp.search(new String("привет,какдела!"),"какдела"));
    }
    @Test
    public void search2(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(1, temp.search(new String("привет;какдела!"),"привет"));
        Assertions.assertEquals(1, temp.search(new String("привет;какдела!"),"какдела"));
    }
    @Test
    public void search3(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(1, temp.search(new String("как дела!.Что делаешь?"),"как"));
        Assertions.assertEquals(1, temp.search(new String("как дела!.Что делаешь?"),"дела"));
        Assertions.assertEquals(1, temp.search(new String("как дела!.Что делаешь?"),"Что"));
        Assertions.assertEquals(1, temp.search(new String("как дела!.Что делаешь?"),"делаешь"));
    }
    @Test
    public void search4(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(1, temp.search(new String("Привет-привет"),"Привет-привет"));
    }
    @Test
    public void search5(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(1, temp.search(new String("Привет -привет"),"Привет"));
        Assertions.assertEquals(1, temp.search(new String("Привет -привет"),"привет"));
    }
    @Test
    public void search6(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(1, temp.search(new String("4-х"),"4-х"));
    }
    @Test
    public void search7(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(1, temp.search(new String("один и 1"),"один"));
        Assertions.assertEquals(1, temp.search(new String("один и 1"),"и"));
        Assertions.assertEquals(1, temp.search(new String("один и 1"),"1"));
    }
    @Test
    public void search8(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(1, temp.search(new String("бабушка бабушке бабушку"),
                "бабушка"));
        Assertions.assertEquals(1, temp.search(new String("бабушка бабушке бабушку"),
                "бабушке"));
        Assertions.assertEquals(1, temp.search(new String("бабушка бабушке бабушку"),
                "бабушку"));
    }
    @Test
    public void search9(){
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(4, temp.search(new String("а -а а-а, :а, !а"),
                "а"));
        Assertions.assertEquals(5, temp.search(new String("а -а а-а, ваа :а, !а,в,а"),
                "а"));
        Assertions.assertEquals(0, temp.search(new String("а -а а-а, ваа :а, !а,а,а"),//все а - рус
                "a"));// искомая а - англ
        Assertions.assertEquals(1, temp.search(new String("a -а а-а, ваа :а, !а,а,а"),//все а - рус, кроме первой
                "a"));// искомая а - англ
    }
    @Test
    public void search10() {
        ISearchEngineDecorator temp = new ISearchEngineDecorator(new EasySearch());
        Assertions.assertEquals(0, temp.search(new String("Мама мыла раму"), "мыл"));
    }
}
