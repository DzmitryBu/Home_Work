package Home_Work.Home_Work_2.loops;

import Home_Work_2.loops.Task1_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_6Test {
    @Test
    public void multiplicationTable(){
        Assertions.assertEquals("2 * 1 = 2 | 3 * 1 = 3 | 4 * 1 = 4 | 5 * 1 = 5 | \n" +
                "2 * 2 = 4 | 3 * 2 = 6 | 4 * 2 = 8 | 5 * 2 = 10 | \n" +
                "2 * 3 = 6 | 3 * 3 = 9 | 4 * 3 = 12 | 5 * 3 = 15 | \n" +
                "2 * 4 = 8 | 3 * 4 = 12 | 4 * 4 = 16 | 5 * 4 = 20 | \n" +
                "2 * 5 = 10 | 3 * 5 = 15 | 4 * 5 = 20 | 5 * 5 = 25 | \n" +
                "2 * 6 = 12 | 3 * 6 = 18 | 4 * 6 = 24 | 5 * 6 = 30 | \n" +
                "2 * 7 = 14 | 3 * 7 = 21 | 4 * 7 = 28 | 5 * 7 = 35 | \n" +
                "2 * 8 = 16 | 3 * 8 = 24 | 4 * 8 = 32 | 5 * 8 = 40 | \n" +
                "2 * 9 = 18 | 3 * 9 = 27 | 4 * 9 = 36 | 5 * 9 = 45 | \n" +
                "2 * 10 = 20 | 3 * 10 = 30 | 4 * 10 = 40 | 5 * 10 = 50 | \n" +
                "_________________________________________________________\n" +
                "6 * 1 = 6 | 7 * 1 = 7 | 8 * 1 = 8 | 9 * 1 = 9 | \n" +
                "6 * 2 = 12 | 7 * 2 = 14 | 8 * 2 = 16 | 9 * 2 = 18 | \n" +
                "6 * 3 = 18 | 7 * 3 = 21 | 8 * 3 = 24 | 9 * 3 = 27 | \n" +
                "6 * 4 = 24 | 7 * 4 = 28 | 8 * 4 = 32 | 9 * 4 = 36 | \n" +
                "6 * 5 = 30 | 7 * 5 = 35 | 8 * 5 = 40 | 9 * 5 = 45 | \n" +
                "6 * 6 = 36 | 7 * 6 = 42 | 8 * 6 = 48 | 9 * 6 = 54 | \n" +
                "6 * 7 = 42 | 7 * 7 = 49 | 8 * 7 = 56 | 9 * 7 = 63 | \n" +
                "6 * 8 = 48 | 7 * 8 = 56 | 8 * 8 = 64 | 9 * 8 = 72 | \n" +
                "6 * 9 = 54 | 7 * 9 = 63 | 8 * 9 = 72 | 9 * 9 = 81 | \n" +
                "6 * 10 = 60 | 7 * 10 = 70 | 8 * 10 = 80 | 9 * 10 = 90 | \n", Task1_6.multiplicationTable());
    }
}
