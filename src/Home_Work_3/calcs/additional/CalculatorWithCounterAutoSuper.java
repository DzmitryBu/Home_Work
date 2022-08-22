package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long increment;

    public double division(double a, double b){
        increment++;
        return super.division(a, b);
    }
    public double multiplication(double a, double b){
        increment++;
        return super.multiplication(a, b);
    }
    public double subtraction(double a, double b){
        increment++;
        return super.subtraction(a, b);
    }
    public double addition(double a, double b){
        increment++;
        return super.addition(a, b);
    }
    public double exponentiation(int a, double b){
        increment++;
        return super.exponentiation(a, b);
    }
    public double module(double a){
        increment++;
        return super.module(a);
    }
    public double sqrt(double a){
        increment++;
        return super.sqrt(a);
    }

    public long getCountOperation(){
        return increment;
    }
}
