package Home_Work.Home_Work_3.calcs.simple;

import Home_Work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {
    @Test
    public void division(){
        CalculatorWithOperator temp = new CalculatorWithOperator();
        Assertions.assertEquals(5.6, temp.division(28, 5));
    }
    @Test
    public void multiplication(){
        CalculatorWithOperator temp = new CalculatorWithOperator();
        Assertions.assertEquals(105, temp.multiplication(15, 7));
    }
    @Test
    public void subtraction(){
        CalculatorWithOperator temp = new CalculatorWithOperator();
        Assertions.assertEquals(8, temp.subtraction(15, 7));
    }
    @Test
    public void addition(){
        CalculatorWithOperator temp = new CalculatorWithOperator();
        Assertions.assertEquals(109.1, temp.addition(4.1, 105));
    }
    @Test
    public void exponentiation(){
        CalculatorWithOperator temp = new CalculatorWithOperator();
        Assertions.assertEquals(31.359999999999996, temp.exponentiation(2, 5.6));
    }
    @Test
    public void module(){
        CalculatorWithOperator temp = new CalculatorWithOperator();
        Assertions.assertEquals(5, temp.module(-5));
    }
    @Test
    public void module2(){
        CalculatorWithOperator temp = new CalculatorWithOperator();
        Assertions.assertEquals(5, temp.module(5));
    }
    @Test
    public void sqrt(){
        CalculatorWithOperator temp = new CalculatorWithOperator();
        Assertions.assertEquals(2, temp.sqrt(4));
    }
    @Test
    public void sqrt2(){
        CalculatorWithOperator temp = new CalculatorWithOperator();
        Assertions.assertEquals(5.6, temp.sqrt(31.36));
    }
}
