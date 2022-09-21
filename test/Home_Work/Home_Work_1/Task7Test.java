package Home_Work.Home_Work_1;

import Home_Work_1.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {
    @Test
    public void creatPhoneNumber(){
        Task7 temp = new Task7();
        Assertions.assertEquals("(123) 456-7890",
                temp.creatPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
    }
    @Test
    public void creatPhoneNumber2(){
        Task7 temp = new Task7();
        Assertions.assertEquals("(029) 555-6677",
                temp.creatPhoneNumber(new int[]{0,2,9,5,5,5,6,6,7,7}));
    }
}
