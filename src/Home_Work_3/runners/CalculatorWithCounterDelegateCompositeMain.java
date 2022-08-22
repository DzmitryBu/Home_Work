package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args){
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterAutoComposite x = new CalculatorWithCounterAutoComposite();
        double result = x.addition((x.addition(4.1, x.multiplication(15, 7))), (x.exponentiation(2 , x.division(28, 5))));
        System.out.println("Результат вычисления выражния: " + result);

        System.out.println("Количество выполненных математических операций: " + x.getCountOperation());

    }
}
