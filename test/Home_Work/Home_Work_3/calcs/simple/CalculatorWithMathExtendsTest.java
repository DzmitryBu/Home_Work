package Home_Work.Home_Work_3.calcs.simple;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathExtendsTest {
    @Test
    public void division(){
        CalculatorWithMathExtends temp = new CalculatorWithMathExtends();
        Assertions.assertEquals(5.6, temp.division(28, 5));
    }
    @Test
    public void multiplication(){
        CalculatorWithMathExtends temp = new CalculatorWithMathExtends();
        Assertions.assertEquals(105, temp.multiplication(15, 7));
    }
    @Test
    public void subtraction(){
        CalculatorWithMathExtends temp = new CalculatorWithMathExtends();
        Assertions.assertEquals(8, temp.subtraction(15, 7));
    }
    @Test
    public void addition(){
        CalculatorWithMathExtends temp = new CalculatorWithMathExtends();
        Assertions.assertEquals(109.1, temp.addition(4.1, 105));
    }
    @Test
    public void exponentiation(){
        CalculatorWithMathExtends temp = new CalculatorWithMathExtends();
        Assertions.assertEquals(31.359999999999996, temp.exponentiation(2, 5.6));
    }
    @Test
    public void module(){
        CalculatorWithMathExtends temp = new CalculatorWithMathExtends();
        Assertions.assertEquals(5, temp.module(-5));
    }
    @Test
    public void module2(){
        CalculatorWithMathExtends temp = new CalculatorWithMathExtends();
        Assertions.assertEquals(5, temp.module(5));
    }
    @Test
    public void sqrt(){
        CalculatorWithMathExtends temp = new CalculatorWithMathExtends();
        Assertions.assertEquals(2, temp.sqrt(4));
    }
    @Test
    public void sqrt2(){
        CalculatorWithMathExtends temp = new CalculatorWithMathExtends();
        Assertions.assertEquals(5.6, temp.sqrt(31.36));
    }
}
