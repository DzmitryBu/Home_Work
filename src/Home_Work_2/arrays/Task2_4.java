package Home_Work_2.arrays;
import static Home_Work_2.arrays.ArraysUtils.arrayRandom;

public class Task2_4 {
    public static void main(String[] args){
        sumOfEvenElements();
        maximumOfEvenIndexed();
        elementsLessThanArithmeticMean();
        twoSmallestArrayElements();
        compressArray(20, 50); //исключим из массива элементы, попадающие в диапазон [20;50]
        sumOfArrayDigits();

    }

    /**
     * метод определяет сумму четных положительных элементов массива, вызванного из
     * метода arrayRandom, и выводит это значение в консоль.
     */
    public static void sumOfEvenElements(){
        int[] arrRand = arrayRandom(50, 100);
        int sum = 0;
        for(int i = 0; i < arrRand.length; i++){
            if(arrRand[i] >= 0 && arrRand[i] % 2 == 0){
                sum += arrRand[i];
            }
        }
        System.out.println("Сумма чётных положительных элементов массива: " + sum);
    }

    /**
     * метод определяет среди элементов массива, вызванного из метода arrayRandom, тот элемент,
     * который имеет максимальное значение, и выводит это значение в консоль.
     */
    public static void maximumOfEvenIndexed(){
        int[] arrRand = arrayRandom(50, 100);
        int maxNumber = 0;
        for(int i = 0; i < arrRand.length; i++){
            if(i % 2 == 0 && maxNumber < arrRand[i]){
                maxNumber = arrRand[i];
            }
        }
        System.out.println("Максимальный элемент массива с чётным индексом равен: " + maxNumber);
    }

    /**
     * метод определяет в массиве, вызванного из метода arrayRandom, те элементы, значение которых
     * меньше среднего арифметического, взятого от всех элементов массива и выводит эти элементы в консоль.
     */
    public static void elementsLessThanArithmeticMean(){
        int[] arrRand = arrayRandom(50, 100);
        int sum = 0;
        for(int element : arrRand){
            sum += element;
        }
        double average = sum / arrRand.length;
        System.out.print("Элементы массива, меньше среднеего " + average + ": ");
        for(int i = 0; i < arrRand.length; i++){
            if(arrRand[i] < average){
                System.out.print(arrRand[i] + " ");
            }
        }
        System.out.println();
    }

    /**
     *  Метод определяет в массиве, вызванного из метода arrayRandom,
     *  два наименьших (минимальных) элемента массива и выводит эти элементы в консоль.
     *  Если в массиве 2 одинаковых минимальных элемента, то метод выводит оба элемента.
     */
    public static void twoSmallestArrayElements(){
        int[] arrRand = arrayRandom(50, 100);
        int min1 = 100;
        int min2 = 100;
        int indexMin1 = 0;
        for(int i = 0; i < arrRand.length; i++) {
            System.out.print(arrRand[i] + " ");
            if (arrRand[i] < min1) {
                min1 = arrRand[i];
                indexMin1 = i;
            }
        }
            for(int j = 0; j < arrRand.length; j++){
            if(arrRand[j] < min2 && j != indexMin1){
                min2 = arrRand[j];
            }
        }
        System.out.println();
        System.out.println("Двумя наименьшими элементами массива являются: " + min1 + " и " + min2);
    }

    /**
     * Метод сжимает массив, вызванный из метода arrayRandom, удалив из него все элементы,
     * величина которых находится в интервале [minDel, maxDel]. Освободившиеся в конце массива элементы
     * заполняются нулями. В консоль выводится информация о массиве до сжатия и после.
     * @param minDel - минимальная величина диапазона исключения, включительно.
     * @param maxDel - максимальная величина диапазона исключения, включительно.
     */
    public static void compressArray(int minDel, int maxDel){
        int[] arrRand = arrayRandom(50, 100);
        for(int element : arrRand){
            System.out.print(element + " ");
        }
        System.out.println();
        int i = 0;
        while( i < arrRand.length){
            if(minDel <= arrRand[i] && arrRand[i] <= maxDel){
                int j = i;
                while (j < arrRand.length - 1){
                    arrRand[j] = arrRand[j + 1];
                    j++;
                }
                arrRand[arrRand.length - 1] = 0;
            } else {
                i++;
            }
        }
        System.out.println("После удаления элементов, принадлежащих интервалу: [" + minDel + "; " + maxDel + "]");
        for(int element : arrRand){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Метод позволяет найти сумму всех цифр массива. Метод выводит в консоль полученный массив,
     * вызванный из метода arrayRandom, и выводит значение суммы всех цифр данного массива.
     */
    public static void sumOfArrayDigits(){
        int[] arrRand = arrayRandom(50, 100);
        for(int element : arrRand){
            System.out.print(element + " ");
        }
        System.out.println();
        int sum = 0;
        int number;
        for(int i = 0; i < arrRand.length; i++){
            number = arrRand[i];
            while(number !=0){
                sum += number % 10;
                number = number / 10;
            }
        }
        System.out.println("Сумма всех цифр массива равна: " + sum);
    }
}
