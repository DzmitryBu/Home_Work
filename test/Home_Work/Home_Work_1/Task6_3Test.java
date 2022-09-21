package Home_Work.Home_Work_1;

import Home_Work_1.Task6_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_3Test {
    @Test
    public void welcomeVasy() {
        Task6_3 person = new Task6_3();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал",person.welcom("Вася"));
    }
    @Test
    public void welcomeAny() {
        Task6_3 person = new Task6_3();
        Assertions.assertEquals("Я тебя так долго ждал",person.welcom("Анастасия"));
    }
    @Test
    public void welcome() {
        Task6_3 person = new Task6_3();
        Assertions.assertEquals("Добрый день, а вы кто?",person.welcom("Аня"));
    }
}
