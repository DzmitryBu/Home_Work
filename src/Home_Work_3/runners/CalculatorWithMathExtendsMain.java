package Home_Work_3.runners;

import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args){
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathExtends x = new CalculatorWithMathExtends();

        double result = x.addition((x.addition(4.1, x.multiplication(15, 7))), (x.exponentiation(2 , x.division(28, 5))));
        System.out.println(result);
    }
}
