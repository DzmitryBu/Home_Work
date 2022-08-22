package Home_Work_3.calcs.additional;


import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long increment;

    public void incrementCountOperation(){
        increment++;
    }

    public long getCountOperation(){
        return increment;
    }
}
