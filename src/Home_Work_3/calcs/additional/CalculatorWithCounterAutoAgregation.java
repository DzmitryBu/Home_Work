package Home_Work_3.calcs.additional;

public class CalculatorWithCounterAutoAgregation {
    CalculatorWithCounterAutoSuper calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper x){
        calc = x;
        }

    public double division(double a, double b){
        return calc.division(a, b);
    }

    public double multiplication(double a, double b){
        return calc.multiplication(a, b);
    }

    public double subtraction(double a, double b){
        return calc.subtraction(a, b);
    }

    public double addition(double a, double b){
        return calc.addition(a, b);
    }

    public double exponentiation(int a, double b){
        return calc.exponentiation(a, b);
    }

    public double module(double a){
        return calc.module(a);
    }

    public double sqrt(double a){
        return calc.sqrt(a);
    }

    public long getCountOperation(){
        return calc.getCountOperation();
    }





}
