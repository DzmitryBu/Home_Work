package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

   public double exponentiation(int a, double b){
       return Math.pow(b, a);
   }

    public double module(double a){
        return Math.abs(a);
    }

    public double sqrt(double a){
        return Math.sqrt(a);
    }
}
