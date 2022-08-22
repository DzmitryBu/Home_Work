package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    private long increment;
    /**
     * Метод производит деление переменных a / b
     * @param a - делимое число
     * @param b - делитель
     * @return возвращает результат деление числа a на b
     */
    public double division(double a, double b){
        increment++;
        return a / b;
    }

    /**
     * Метод производит умножение переменных a * b
     * @param a - числа
     * @param b - числа
     * @return возвращает результат умножения числа a на b
     */
    public double multiplication(double a, double b){
        increment++;
        return a * b;
    }

    /**
     * Метод производит вычитание переменных a - b
     * @param a - уменьшаемое число
     * @param b - вычитаемое число
     * @return возвращает результат разности чисел a на b
     */
    public double subtraction(double a, double b){
        increment++;
        return a - b;
    }

    /**
     * Метод производит сложение переменных a + b
     * @param a - слагаемое 1
     * @param b - слагаемое 2
     * @return возвращает результат суммы чисел a на b
     */
    public double addition(double a, double b){
        increment++;
        return a + b;
    }

    /**
     * метод выполняет возведение в целую степень дробного положительного числа
     * @param a - целое число, указывающее степень возведения.
     * @param b - число, которое необходимо возвести в указанную степень
     * @return возвращает double число b в степени a
     */
    public double exponentiation(int a, double b){
        increment++;
        return Math.pow(b, a);
    }

    /**
     * метод позволяет найти модуль от числа
     * @param a - число, от которого необходимо найти модуль
     * @return возвращает модуль числа a
     */
    public double module(double a){
        increment++;
       return Math.abs(a);
    }

    /**
     * Метод определяет квадратный корень переданного числа
     * @param a - число, от которого необходимо найти квадратный корень
     * @return возвращает корень кважратный числа a
     */
    public double sqrt(double a){
        increment++;
        return Math.sqrt(a);
    }

    public long getCountOperation() {
        return increment;
    }
}
