package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private long count;
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator x){
        calc1 = x;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy x){
        calc2 = x;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends x){
        calc3 = x;
    }

    public double division(double a, double b){
        if(calc1 == null && calc2 == null){
            count++;
            return calc3.division(a, b);
        }else if(calc1 == null && calc3 == null){
            count++;
            return calc2.division(a, b);
        }else{
            count++;
            return calc1.division(a, b);
        }
    }

    public double multiplication(double a, double b){
        if(calc1 == null && calc2 == null){
            count++;
            return calc3.multiplication(a, b);
        }else if(calc1 == null && calc3 == null){
            count++;
            return calc2.multiplication(a, b);
        }else {
            count++;
            return calc1.multiplication(a, b);
        }
    }

    public double subtraction(double a, double b){
        if(calc1 == null && calc2 == null){
            count++;
            return calc3.subtraction(a, b);
        }else if(calc1 == null && calc3 == null){
            count++;
            return calc2.subtraction(a, b);
        }else {
            count++;
            return calc1.subtraction(a, b);
        }
    }

    public double addition(double a, double b){
        if(calc1 == null && calc2 == null){
            count++;
            return calc3.addition(a, b);
        }else if(calc1 == null && calc3 == null){
            count++;
            return calc2.addition(a, b);
        }else {
            count++;
            return calc1.addition(a, b);
        }
    }

    public double exponentiation(int a, double b){
        if(calc1 == null && calc2 == null){
            count++;
            return calc3.exponentiation(a, b);
        }else if(calc1 == null && calc3 == null){
            count++;
            return calc2.exponentiation(a, b);
        }else {
            count++;
            return calc1.exponentiation(a, b);
        }
    }

    public double module(double a){
        if(calc1 == null && calc2 == null){
            count++;
            return calc3.module(a);
        }else if(calc1 == null && calc3 == null){
            count++;
            return calc2.module(a);
        }else {
            count++;
            return calc1.module(a);
        }
    }

    public double sqrt(double a){
        if(calc1 == null && calc2 == null){
            count++;
            return calc3.sqrt(a);
        }else if(calc1 == null && calc3 == null){
            count++;
            return calc2.sqrt(a);
        }else {
            count++;
            return calc1.sqrt(a);
        }
    }

   public long getCountOperation(){
       if(calc1 == null && calc2 == null){
           return  count;
       }else if(calc1 == null && calc3 == null){
           return  count;
       }else return count;
    }

}
