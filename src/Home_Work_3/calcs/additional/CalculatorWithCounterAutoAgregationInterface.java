package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;
public class CalculatorWithCounterAutoAgregationInterface {
    private long increment;
    private ICalculator x;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator x){
        this.x = x;
    }

    public double division(double a, double b) {
        increment++;
        return a / b;
    }

    public double multiplication(double a, double b) {
        increment++;
        return a * b;
    }

    public double subtraction(double a, double b) {
        increment++;
        return a - b;
    }

    public double addition(double a, double b) {
        increment++;
        return a + b;
    }

    public double exponentiation(int a, double b) {
        increment++;
        return Math.pow(b, a);
    }

    public double module(double a) {
        increment++;
        return Math.abs(a);
    }

    public double sqrt(double a) {
        increment++;
        return Math.sqrt(a);
    }

    public long getCountOperation(){
        return increment;
    }
}
