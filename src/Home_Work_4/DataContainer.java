package Home_Work_4;

import java.util.Arrays;
import java.util.Comparator;
public class DataContainer <T>{

    /**
     * Поле класса, которое хранит массив объектов.
     */
    private T [] data;

    /**
     * Конструктор класса DataContainer <T>.
     * @param data аргумет, в котором передается массив объектов.
     */
    DataContainer(T[] data){
        this.data = data;
    }

    /**
     * Метод добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные,
     * начиная с 0. Если поле data не переполнено, то данные добавляются в первую позицию (ячейку)
     * после последней заполненной позиции (ячейки). Если поле data переполнено, метод расширять
     * пространство для новых элементов.
     * @param item - агрумент, передаваемый в метод, для добовления указанного элемента в поле data.
     * @return -1, если передаем в метод аргумент null
     *          возвращает номер позиции, в которую были вставлены данные
     */
    public int add(T item){
        int i;
        if(item == null){
            return -1;
        }
        if(data.length == 0){
            i = 0;
           data = Arrays.copyOf(data, (data.length + 1));
           data[i] = item;
        } else {
            for (i = 0; i < data.length; ) {
                if (data[i] == null) {
                    data[i] = item;
                    break;
                } else {
                    if (i == (data.length - 1)) {
                        data = Arrays.copyOf(data, (data.length + 1));
                        i++;
                        data[i] = item;
                        break;
                    }
                    i++;
                }
            }
        }
        return i;
    }

    /**
     * Метод возвращает элемент, ноходящийся под запрошенным индексом.
     * @param index - агрумент, передаваемый в метод, для указания запрашиваемого индека в поле data.
     * @return null - если указанного индекса не существует в поле data.
     *              возвращает индекс, по которому расположен искомый элемент.
     */
    public T get(int index){
        if(index < 0 || index >= data.length){
            return null;
        }
        return data[index];
    }

    /**
     * Метод возвращает массив из поля data.
     * @return - возвращает массив, находящийся в поле data
     */
    public T[] getItems(){
        return data;
    }

    /**
     * Метод удаляет элемент из поля data по указанному индекс индексу
     * @param index - аргумент, передаваемый в метод, для удаления элемента поля data по указанному индексу.
     * @return - true если у нас получилось удалить данные
     *           false если нет такого индекса
     */
    public boolean delete(int index){
        if(index < 0 || index >= data.length){
            return false;
        } else {
            for(int j = index; j < data.length - 1; j++){
                T temp;
            data[j] = null;
            temp = data[j + 1];
            data[j] = temp;
            }
            data = Arrays.copyOf(data, (data.length - 1));
        }
        return true;
    }

    /**
     * Метод удаляет указанный элемент из поля data.
     * @param item - агрумент, передаваемый в метод, для добовления указанного элемента в поле data.
     * @return - возвращает false если передали null или нет такого элемента;
     *          true если  удалили данные
     */
    public boolean delete(T item){
        if(item != null){
            for (int i = 0; i < data.length; i++){
                if(item.equals(data[i])){
                    data[i] = null;
                    return delete(i);
                }
            }
        }
        return false;
    }

    /**
     * Метод сортирует данные записанных в поле data, используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
     * @param comparator компоратор, применяемый для сравнения объектов.
     */
    public void sort(Comparator <T> comparator){
        for(int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length - 1; j ++)
                if(comparator.compare(data[j],data[j + 1]) > 0){
                T tmp = data[j + 1];
                data[j + 1] = data[j];
                data[j] = tmp;
            }
        }
    }

    /**
     * Переопределенный метод toString(), который выводить содержимое data без ячеек, в которых хранится null
     * @return возвращает поле data в виде строки элементов, за исключением элемеонтов null.
     */
    public String toString(){
        if (data == null)
            return "null";

        int iMax = data.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            if(data[i] == null){
                continue;
            } else{
                b.append(String.valueOf(data[i]));
            }
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }


    /**
     * Метод сортирует элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения вызываемый
     * у хранимых объектов.
     * @param container переданный для сортировки объект DataContainer.
     * @param <T> Дженерик метода.
     */
    public static <T> void sort(DataContainer <? extends Comparable> container){
        Comparable [] array = container.getItems();
         for(int i = 0; i < array.length; i++){
             for (int j = 0; j < array.length - 1; j ++){
                 if(array[j].compareTo(array[j + 1]) > 0) {
                     Comparable tmp = array[j + 1];
                     array[j + 1] = array[j];
                     array[j] = tmp;
                 }
             }
         }
     }

    /**
     * Метод сортирует элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения из
     * переданного объекта интерфейса Comparator.
     * @param container - переданный для сортировки объект DataContainer.
     * @param comparator - переданный объект интерфейса Comparator
     * @param <T> Дженерик метода.
     */
    public static <T> void sort(DataContainer<T> container, Comparator <T> comparator){
        T [] array = container.getItems();
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j ++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    T tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

}
