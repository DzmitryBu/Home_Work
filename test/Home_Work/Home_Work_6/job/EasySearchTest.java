package Home_Work.Home_Work_6.job;

import Home_Work_6.job.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest {

    @Test
    public void search(){
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(1, temp.search(new String("привет, как дела!"),"привет"));
        Assertions.assertEquals(1, temp.search(new String("привет, как дела!"),"как"));
        Assertions.assertEquals(1, temp.search(new String("привет, как дела!"),"дела"));
    }
    @Test
    public void search1(){
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(1, temp.search(new String("привет,какдела!"),"привет"));
        Assertions.assertEquals(1, temp.search(new String("привет,какдела!"),"какдела"));
    }
    @Test
    public void search2(){
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(1, temp.search(new String("привет;какдела!"),"привет"));
        Assertions.assertEquals(1, temp.search(new String("привет;какдела!"),"какдела"));
    }
   @Test
    public void search3(){
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(1, temp.search(new String("как дела!.Что делаешь?"),"как"));
        Assertions.assertEquals(1, temp.search(new String("как дела!.Что делаешь?"),"дела"));
        Assertions.assertEquals(1, temp.search(new String("как дела!.Что делаешь?"),"Что"));
        Assertions.assertEquals(1, temp.search(new String("как дела!.Что делаешь?"),"делаешь"));
    }
    @Test
    public void search4(){
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(1, temp.search(new String("Привет-привет"),"Привет-привет"));
    }
    @Test
    public void search5(){
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(1, temp.search(new String("Привет -привет"),"Привет"));
        Assertions.assertEquals(1, temp.search(new String("Привет -привет"),"привет"));
    }
    @Test
    public void search6(){
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(1, temp.search(new String("4-х"),"4-х"));
    }
    @Test
    public void search7(){
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(1, temp.search(new String("один и 1"),"один"));
        Assertions.assertEquals(1, temp.search(new String("один и 1"),"и"));
        Assertions.assertEquals(1, temp.search(new String("один и 1"),"1"));
    }
    @Test
    public void search8(){
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(1, temp.search(new String("бабушка бабушке бабушку"),
                "бабушка"));
        Assertions.assertEquals(1, temp.search(new String("бабушка бабушке бабушку"),
                "бабушке"));
        Assertions.assertEquals(1, temp.search(new String("бабушка бабушке бабушку"),
                "бабушку"));
    }
    @Test
    public void search9(){
        EasySearch temp = new EasySearch();
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
        EasySearch temp = new EasySearch();
        Assertions.assertEquals(0, temp.search(new String("Мама мыла раму"), "мыл"));
    }

}
