package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithOperator x1 = new CalculatorWithOperator();
        CalculatorWithMathCopy x2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends x3 = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAgregation calc1 = new CalculatorWithCounterAutoChoiceAgregation(x1);
        double result1 = calc1.addition((calc1.addition(4.1, calc1.multiplication(15, 7))), (calc1.exponentiation(2 , calc1.division(28, 5))));
        System.out.println("Результат вычисления выражния через конструктор CalculatorWithOperator : " + result1);
        System.out.println("Количество выполненных операций ерез конструктор CalculatorWithOperator : " + calc1.getCountOperation());

        CalculatorWithCounterAutoChoiceAgregation calc2 = new CalculatorWithCounterAutoChoiceAgregation(x2);
        double result2 = calc2.addition((calc2.addition(4.1, calc2.multiplication(15, 7))), (calc2.exponentiation(2 , calc2.division(28, 5))));
        System.out.println("Результат вычисления выражния через конструктор CalculatorWithMathCopy : " + result2);
        System.out.println("Количество выполненных операций ерез конструктор CalculatorWithMathCopy : " + calc2.getCountOperation());

        CalculatorWithCounterAutoChoiceAgregation calc3 = new CalculatorWithCounterAutoChoiceAgregation(x3);
        double result3 = calc3.addition((calc3.addition(4.1, calc3.multiplication(15, 7))), (calc3.exponentiation(2 , calc3.division(28, 5))));
        System.out.println("Результат вычисления выражния через конструктор CalculatorWithMathExtends : " + result3);
        System.out.println("Количество выполненных операций через конструктор CalculatorWithMathExtends : " + calc3.getCountOperation());

    }
}
