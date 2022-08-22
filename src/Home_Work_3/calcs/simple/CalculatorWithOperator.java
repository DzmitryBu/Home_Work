package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    /**
     * Метод производит деление переменных a / b
     * @param a - делимое число
     * @param b - делитель
     * @return - возвращает тип данных double, деление чисел а но b
     */
    public double division(double a, double b){

        return a / b;
    }

    /**
     * Метод производит умножение переменных a * b
     * @param a - числа
     * @param b - числа
     * @return - возвращает тип данных double, произведение а и b
     */
    public double multiplication(double a, double b){

        return a * b;
    }

    /**
     * Метод производит вычитание переменных a - b
     * @param a - уменьшаемое число
     * @param b - вычитаемое число
     * @return - возвращает тип данных double, разницу чисел а и b
     */
    public double subtraction(double a, double b){

        return a - b;
    }

    /**
     * Метод производит сложение переменных a + b
     * @param a - слагаемое 1
     * @param b - слагаемое 2
     * @return - возвращает тип данных double, сумму чисел а и b
     */
    public double addition(double a, double b){

        return a + b;
    }

    /**
     * метод выполняет возведение в целую степень дробного положительного числа
     * @param a - целое число, указывающее степень возведения.
     * @param b - число, которое необходимо возвести в указанную степень
     * @return - возвращает тип данных double, число b в степени a
     */
    public double exponentiation(int a, double b){

        double result = b;
        for(int i = 2; i <= a; i++){
            result *= b;
        }
        return result;
    }

    /**
     * метод позволяет найти модуль от числа
     * @param a - число, от которого необходимо найти модуль
     * @return - возвращает тип данных double модуль переданного числа
     */
    public double module(double a){

        if(a >= 0){
            return a;
        }
        return a * (-1);
    }

    /**
     * Метод определяет квадратный корень переданного числа
     * @param a - число, от которого необходимо найти квадратный корень
     * @return - возвращает тип данных double квадратный корень переданного числа
     */
    public double sqrt(double a){

        return Math.sqrt(a);
    }


}
