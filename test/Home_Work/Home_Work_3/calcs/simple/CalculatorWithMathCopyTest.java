package Home_Work.Home_Work_3.calcs.simple;

import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathCopyTest {
    @Test
    public void division(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        Assertions.assertEquals(5.6, temp.division(28, 5));
    }
    @Test
    public void multiplication(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        Assertions.assertEquals(105, temp.multiplication(15, 7));
    }
    @Test
    public void subtraction(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        Assertions.assertEquals(8, temp.subtraction(15, 7));
    }
    @Test
    public void addition(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        Assertions.assertEquals(109.1, temp.addition(4.1, 105));
    }
    @Test
    public void exponentiation(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        Assertions.assertEquals(31.359999999999996, temp.exponentiation(2, 5.6));
    }
    @Test
    public void module(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        Assertions.assertEquals(5, temp.module(-5));
    }
    @Test
    public void module2(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        Assertions.assertEquals(5, temp.module(5));
    }
    @Test
    public void sqrt(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        Assertions.assertEquals(2, temp.sqrt(4));
    }
    @Test
    public void sqrt2(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        Assertions.assertEquals(5.6, temp.sqrt(31.36));
    }
    @Test
    public void getCountOperation(){
        CalculatorWithMathCopy temp = new CalculatorWithMathCopy();
        temp.sqrt(31.36);
        temp.exponentiation(2, 5.6);
        temp.multiplication(15, 7);
        Assertions.assertEquals(3, temp.getCountOperation());

    }

}
