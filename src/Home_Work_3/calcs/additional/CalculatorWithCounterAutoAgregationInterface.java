package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;
public class CalculatorWithCounterAutoAgregationInterface implements ICalculator{
    private long increment;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator x){
    }

    @Override
    public double division(double a, double b) {
        increment++;
        return a / b;
    }

    @Override
    public double multiplication(double a, double b) {
        increment++;
        return a * b;
    }

    @Override
    public double subtraction(double a, double b) {
        increment++;
        return a - b;
    }

    @Override
    public double addition(double a, double b) {
        increment++;
        return a + b;
    }

    @Override
    public double exponentiation(int a, double b) {
        increment++;
        return Math.pow(b, a);
    }

    @Override
    public double module(double a) {
        increment++;
        return Math.abs(a);
    }

    @Override
    public double sqrt(double a) {
        increment++;
        return Math.sqrt(a);
    }

    public long getCountOperation(){
        return increment;
    }
}
