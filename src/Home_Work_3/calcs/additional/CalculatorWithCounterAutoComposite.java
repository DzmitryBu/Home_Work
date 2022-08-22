package Home_Work_3.calcs.additional;


public class CalculatorWithCounterAutoComposite {
    CalculatorWithCounterAutoSuper x = new CalculatorWithCounterAutoSuper();

    public double division (double a, double b){
        return x.division(a, b);
    }

    public double multiplication (double a, double b){
        return x.multiplication(a, b);
    }

    public double subtraction (double a, double b){
        return x.subtraction(a, b);
    }

    public double addition (double a, double b){
        return x.addition(a, b);
    }

    public double exponentiation (int a, double b){
        return x.exponentiation(a, b);
    }

    public double module (int a){
        return x.module(a);
    }

    public double sqrt (int a){
        return x.sqrt(a);
    }

    public long getCountOperation(){
        return x.getCountOperation();
    }
}
