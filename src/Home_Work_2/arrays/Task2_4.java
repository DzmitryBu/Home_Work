package Home_Work_2.arrays;
import static Home_Work_2.utils.ArraysUtils.arrayRandom;

public class Task2_4 {
    public static void main(String[] args){
        Task2_4 temp = new Task2_4();

        System.out.println(temp.sumOfEvenElements(arrayRandom(50, 100)));
        System.out.println(temp.maximumOfEvenIndexed((arrayRandom(50, 100))));
        System.out.println(temp.elementsLessThanArithmeticMean(arrayRandom(50, 100)));
        System.out.println(temp.twoSmallestArrayElements(arrayRandom(50, 100)));
        System.out.println(temp.compressArray(arrayRandom(50, 100), 20, 50));
        //исключим из массива элементы, попадающие в диапазон [20;50]
        System.out.println(temp.sumOfArrayDigits(arrayRandom(50, 100)));
    }

    /**
     * метод определяет сумму четных положительных элементов массива, вызванного из
     * метода arrayRandom, и выводит это значение в консоль.
     */
    public String sumOfEvenElements(int [] arr){
        int[] arrTemp = arr;
        int sum = 0;
        for(int i = 0; i < arrTemp.length; i++){
            if(arrTemp[i] >= 0 && arrTemp[i] % 2 == 0){
                sum += arrTemp[i];
            }
        }
        return "Сумма чётных положительных элементов массива: " + sum;
    }

    /**
     * метод определяет среди элементов массива, вызванного из метода arrayRandom, тот элемент,
     * который имеет максимальное значение, и выводит это значение в консоль.
     */
    public String maximumOfEvenIndexed(int[] arr){
        int[] arrTemp = arr;
        int maxNumber = 0;
        for(int i = 0; i < arrTemp.length; i++){
            if(i % 2 == 0 && maxNumber < arrTemp[i]){
                maxNumber = arrTemp[i];
            }
        }
        return "Максимальный элемент массива с чётным индексом равен: " + maxNumber;
    }

    /**
     * метод определяет в массиве, вызванного из метода arrayRandom, те элементы, значение которых
     * меньше среднего арифметического, взятого от всех элементов массива и выводит эти элементы в консоль.
     */
    public String elementsLessThanArithmeticMean(int[] arr){
        int[] arrTemp = arr;
        String result;
        int sum = 0;
        for(int element : arrTemp){
            sum += element;
        }
        double average = sum / arrTemp.length;
        result = "Элементы массива, меньше среднеего " + average + ":";
        for(int i = 0; i < arrTemp.length; i++){
            if(arrTemp[i] < average){
                result = result + " " + arrTemp[i];
            }
        }
        return result;
    }

    /**
     *  Метод определяет в массиве, вызванного из метода arrayRandom,
     *  два наименьших (минимальных) элемента массива и выводит эти элементы в консоль.
     *  Если в массиве 2 одинаковых минимальных элемента, то метод выводит оба элемента.
     */
    public String twoSmallestArrayElements(int[] arr){
        int[] arrTemp = arr;
        String result = "";
        int min1 = 100;
        int min2 = 100;
        int indexMin1 = 0;
        for(int i = 0; i < arrTemp.length; i++) {
            if(i == 0){
                result = "" + arrTemp[i];
            } else {
                result = result + " " + arrTemp[i];
            }

            if (arrTemp[i] < min1) {
                min1 = arrTemp[i];
                indexMin1 = i;
            }
        }
            for(int j = 0; j < arrTemp.length; j++){
            if(arrTemp[j] < min2 && j != indexMin1){
                min2 = arrTemp[j];
            }
        } result = result + "\nДвумя наименьшими элементами массива являются: " + min1 + " и " + min2;
        return result;
    }

    /**
     * Метод сжимает массив, вызванный из метода arrayRandom, удалив из него все элементы,
     * величина которых находится в интервале [minDel, maxDel]. Освободившиеся в конце массива элементы
     * заполняются нулями. В консоль выводится информация о массиве до сжатия и после.
     * @param minDel - минимальная величина диапазона исключения, включительно.
     * @param maxDel - максимальная величина диапазона исключения, включительно.
     */
    public String compressArray(int[] arr, int minDel, int maxDel){
        int[] arrTemp = arr;
        String result = "";
        for(int element : arrTemp){
            result = result + element + " ";
        }
        result = result + "\n";
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
        result = result + "После удаления элементов, принадлежащих интервалу: " +
                "[" + minDel + "; " + maxDel + "]\n";
        for(int element : arrTemp){
            result = result + element + " ";
        }
        return result;
    }

    /**
     * Метод позволяет найти сумму всех цифр массива. Метод выводит в консоль полученный массив,
     * вызванный из метода arrayRandom, и выводит значение суммы всех цифр данного массива.
     */
    public String sumOfArrayDigits(int[] arr){
        int[] arrTemp = arr;
        String result = "";
        for(int element : arrTemp){
            result = result + element + " ";
        }
        result = result + "\n";
        int sum = 0;
        int number;
        for(int i = 0; i < arrTemp.length; i++){
            number = arrTemp[i];
            while(number !=0){
                sum += number % 10;
                number = number / 10;
            }
        } result = result + "Сумма всех цифр массива равна: " + sum;
        return result;
    }
}
