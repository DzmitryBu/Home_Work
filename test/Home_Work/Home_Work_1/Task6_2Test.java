package Home_Work.Home_Work_1;

import Home_Work_1.Task6_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6_2Test {
    @Test
    public void welcomeVasy() {
        Task6_2 person = new Task6_2();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал",person.welcom("Вася"));
    }
    @Test
    public void welcomeAny() {
        Task6_2 person = new Task6_2();
        Assertions.assertEquals("Я тебя так долго ждал",person.welcom("Анастасия"));
    }
    @Test
    public void welcome() {
        Task6_2 person = new Task6_2();
        Assertions.assertEquals("Добрый день, а вы кто?",person.welcom("Аня"));
    }

}