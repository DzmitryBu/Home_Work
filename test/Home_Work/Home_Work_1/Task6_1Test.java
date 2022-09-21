package Home_Work.Home_Work_1;

import Home_Work_1.Task6_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6_1Test {
    @Test
    public void welcomeVasy() {
        Task6_1 person = new Task6_1();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал",person.welcom("Вася"));
    }
    @Test
    public void welcomeAny() {
        Task6_1 person = new Task6_1();
        Assertions.assertEquals("Я тебя так долго ждал",person.welcom("Анастасия"));
    }
    @Test
    public void welcome() {
        Task6_1 person = new Task6_1();
        Assertions.assertEquals("Добрый день, а вы кто?",person.welcom("Аня"));
    }
}