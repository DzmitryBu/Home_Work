package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args){
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterClassic x = new CalculatorWithCounterClassic();

        double division =  x.division(28, 5);
        x.incrementCountOperation();

        double exponentiation = x.exponentiation(2 , division);
        x.incrementCountOperation();

        double multiplication = x.multiplication(15, 7);
        x.incrementCountOperation();

        double result = x.addition(4.1, multiplication);
        x.incrementCountOperation();

        result = x.addition(result, exponentiation);
        x.incrementCountOperation();

        System.out.println(result);

       System.out.println(x.getCountOperation());
    }
}
