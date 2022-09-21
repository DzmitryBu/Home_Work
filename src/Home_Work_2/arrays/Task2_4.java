package Home_Work_2.arrays;
import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayRandom;

public class Task2_4 {
    public static void main(String[] args){
        Task2_4 temp = new Task2_4();

        int[] arr = arrayRandom(50, 100);
        System.out.println("Массив имеет вид:\n" + Arrays.toString(arr));
        System.out.println("Сумма чётных положительных элементов массива: "
                + temp.sumOfEvenElements(arr));
        System.out.println("Максимальный элемент массива с чётным индексом равен: "
                + temp.maximumOfEvenIndexed((arr)));
        System.out.println("Элементы массива, меньше среднеего "
                + Arrays.toString(temp.elementsLessThanArithmeticMean((arr))));
        System.out.println("Двумя наименьшими элементами массива являются: "
                + Arrays.toString(temp.twoSmallestArrayElements((arr))));
        System.out.println("После удаления элементов, принадлежащих интервалу:\n"
                + Arrays.toString(temp.compressArray(arr, 20, 50)));
        //исключим из массива элементы, попадающие в диапазон [20;50]
        System.out.println("Сумма всех цифр массива равна: "
                + temp.sumOfArrayDigits((arr)));
    }

    /**
     * метод определяет сумму четных положительных элементов массива, вызванного из
     * метода arrayRandom, и выводит это значение в консоль.
     */
    public int sumOfEvenElements(int [] arr){
        int[] arrTemp = Arrays.copyOf(arr,arr.length);
        int sum = 0;
        for(int i = 0; i < arrTemp.length; i++){
            if(arrTemp[i] >= 0 && arrTemp[i] % 2 == 0){
                sum += arrTemp[i];
            }
        }
        return sum;
    }

    /**
     * метод определяет среди элементов массива, вызванного из метода arrayRandom, тот элемент,
     * который имеет максимальное значение, и выводит это значение в консоль.
     */
    public int maximumOfEvenIndexed(int[] arr){
        int[] arrTemp = Arrays.copyOf(arr,arr.length);
        int maxNumber = 0;
        for(int i = 0; i < arrTemp.length; i++){
            if(i % 2 == 0 && maxNumber < arrTemp[i]){
                maxNumber = arrTemp[i];
            }
        }
        return maxNumber;
    }

    /**
     * метод определяет в массиве, вызванного из метода arrayRandom, те элементы, значение которых
     * меньше среднего арифметического, взятого от всех элементов массива.
     */
    public int[] elementsLessThanArithmeticMean(int[] arr){
        int[] arrTemp = Arrays.copyOf(arr,arr.length);
        int[] result = new int[0];
        int j = 0;
        int sum = 0;
        for(int element : arrTemp){
            sum += element;
        }
        double average = sum / arrTemp.length;
        for(int i = 0; i < arrTemp.length; i++){
            if(arrTemp[i] < average){
                j++;
                result = Arrays.copyOf(result, j);
                result[j-1] = arrTemp[i];
            }
        }
        return result;
    }

    /**
     *  Метод определяет в массиве, вызванного из метода arrayRandom,
     *  два наименьших (минимальных) элемента массива и выводит эти элементы в консоль.
     *  Если в массиве 2 одинаковых минимальных элемента, то метод выводит оба элемента.
     */
    public int[] twoSmallestArrayElements(int[] arr){
        int[] arrTemp = Arrays.copyOf(arr,arr.length);
       int[] result = new int[2];
        int min1 = 100;
        int min2 = 100;
        int indexMin1 = 0;
        for(int i = 0; i < arrTemp.length; i++) {
            if (arrTemp[i] < min1) {
                min1 = arrTemp[i];
                indexMin1 = i;
                result[0] = min1;
            }
        }
        for(int j = 0; j < arrTemp.length; j++){
            if(arrTemp[j] < min2 && j != indexMin1){
                min2 = arrTemp[j];
                result[1] = min2;
            }
        }
        return result;
    }

    /**
     * Метод сжимает массив, вызванный из метода arrayRandom, удалив из него все элементы,
     * величина которых находится в интервале [minDel, maxDel]. Освободившиеся в конце массива элементы
     * заполняются нулями. В консоль выводится информация о массиве до сжатия и после.
     * @param minDel - минимальная величина диапазона исключения, включительно.
     * @param maxDel - максимальная величина диапазона исключения, включительно.
     */
    public int[] compressArray(int[] arr, int minDel, int maxDel){
        int[] arrTemp = Arrays.copyOf(arr,arr.length);

        int i = 0;
        while( i < arrTemp.length){
            if(minDel <= arrTemp[i] && arrTemp[i] <= maxDel){
                int j = i;
                while (j < arrTemp.length - 1){
                    arrTemp[j] = arrTemp[j + 1];
                    j++;
                }
                arrTemp[arrTemp.length - 1] = 0;
            } else {
                i++;
            }
        }
        return arrTemp;
    }

    /**
     * Метод позволяет найти сумму всех цифр массива. Метод выводит в консоль полученный массив,
     * вызванный из метода arrayRandom, и выводит значение суммы всех цифр данного массива.
     */
    public int sumOfArrayDigits(int[] arr){
        int[] arrTemp = Arrays.copyOf(arr,arr.length);
        int sum = 0;
        int number;
        for(int i = 0; i < arrTemp.length; i++){
            number = arrTemp[i];
            while(number != 0){
                sum += number % 10;
                number = number / 10;
            }
        }
        return sum;
    }
}
