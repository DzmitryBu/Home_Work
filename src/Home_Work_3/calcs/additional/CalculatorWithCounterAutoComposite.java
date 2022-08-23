package Home_Work_3.calcs.additional;


public class CalculatorWithCounterAutoComposite {

    private CalculatorWithCounterAutoSuper x;
    public CalculatorWithCounterAutoComposite() {
       this.x = new CalculatorWithCounterAutoSuper();
    }

    public double division (double a, double b){
        return this.x.division(a, b);
    }

    public double multiplication (double a, double b){
        return this.x.multiplication(a, b);
    }

    public double subtraction (double a, double b){
        return this.x.subtraction(a, b);
    }

    public double addition (double a, double b){
        return this.x.addition(a, b);
    }

    public double exponentiation (int a, double b){
        return this.x.exponentiation(a, b);
    }

    public double module (int a){
        return this.x.module(a);
    }

    public double sqrt (int a){
        return this.x.sqrt(a);
    }

    public long getCountOperation(){
        return this.x.getCountOperation();
    }
}
