package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import Home_Work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterAutoSuper x = new CalculatorWithCounterAutoSuper();
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(x);
        double result = calc.addition((calc.addition(4.1, calc.multiplication(15, 7))), (calc.exponentiation(2 , calc.division(28, 5))));
        System.out.println("Результат вычисления выражния: " + result);

        System.out.println("Количество выполненных математических операций: " + calc.getCountOperation());
    }
}
