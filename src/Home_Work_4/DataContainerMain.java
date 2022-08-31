package Home_Work_4;

import java.util.Arrays;
import java.util.Comparator;

import static Home_Work_4.DataContainer.*;

public class DataContainerMain {
    public static void main(String[] args) {
        //метод int add(T item)
        DataContainer<String> container = new DataContainer<>(new String[]{"Привет", "Как дела",
                null, "Давай потом", null, "Арка", "Я", "А"});
        System.out.println("Массив до метода add: " + Arrays.toString(container.getItems()));
        int index1 = container.add("Завтра");
        System.out.println("Элемент добавлен на позицию: " + index1);
        System.out.println("Массив после метода add: " + Arrays.toString(container.getItems()));

        // метод T get(int index)
        System.out.println("Под указанным индексом находится объект: " + container.get(3));

        // метод T[] getItems()
        container.getItems();

        //метод boolean delete(int index)
        System.out.println("Массив до метода delete(int index): " + Arrays.toString(container.getItems()));
        System.out.println(container.delete(2));
        System.out.println("Массив после метода delete(int index): " + Arrays.toString(container.getItems()));

        // метод boolean delete(T item)
        System.out.println("Массив до метода delete(T item): " + Arrays.toString(container.getItems()));
        System.out.println(container.delete((String) "Работаю"));
        System.out.println("Массив после метода delete(T item): " + Arrays.toString(container.getItems()));

        // НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator)
        DataContainer<String> container2 = new DataContainer<>(new String[]{"Привет", "Как дела",
                "Петр", "Давай потом", "Ор", "Арка", "Иск", "А"});
        container2.sort(new StringComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(container2.getItems()));

        // Переопределить метод toString()
        System.out.println("метод Arrays.toString: " + Arrays.toString(container.getItems()));
        System.out.println("Переопределенный метод toString: " + container.toString());

        DataContainer<String> container3= new DataContainer<>(new String[]{"Привет", "Как дела","Вася",
                "Работаю", null, "Давай потом"});

        System.out.println("Массив: " + Arrays.toString(container3.getItems()));
        System.out.println("Переопределенный метод toString: " + container3.toString());

        // проверка метода public static <T> void sort(DataContainer <? extends Comparable> container)
        DataContainer<String> container4 = new DataContainer<>(new String[]{"Давай потом", "Я","ББ",
                "Д",  "А"});
        System.out.println("Метод public static <T> void sort(DataContainer <? extends Comparable> container)");;
        System.out.println("Массив до сортировки: " + Arrays.toString(container4.getItems()));
        sort(container4);
        System.out.println("Массив после сортировки: " + Arrays.toString(container4.getItems()));

        // проверка метода public static <T> void sort(DataContainer<T> container, Comparator <T> comparator)
        DataContainer<String> container5 = new DataContainer<>(new String[]{"Давай", "Потом", "Небо","ББ",
                "Дом",  "Арка"});
        System.out.println("Метод public static <T> void sort(DataContainer<T> container, Comparator <T> comparator)");;
        System.out.println("Массив до сортировки: " + Arrays.toString(container5.getItems()));
        sort(container5,new StringComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(container5.getItems()));

    }
}
