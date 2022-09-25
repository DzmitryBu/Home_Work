package Home_Work_5.comporators;

import Home_Work_5.dto.Person;

import java.util.Comparator;
import java.util.Iterator;

public class ComparatorPerson implements Comparator <Person> {
    /**
     * Метод производит сравнение двух объектов по двум параметром. На первом этапе
     * производится сравнение длины парроля. Если длина пароля одинаковая, то
     * производится сравнение псевдонимом.
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Отрицательное число, если длина пароля o2, больше длины парроля o1 ИЛИ
     * (при условии одинаковой длины пароля) если псевдонимом o2 в алфамитном порядке дальше o1.
     * Положительное число, если длина пароля o2, больше длины парроля o1 ИЛИ
     * (при условии одинаковой длины пароля) если псевдонимом o1 в алфамитном порядке дальше o2.
     * ИЛИ возвращает 0, если все параметры равны.
     */
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getPassword().length() - o2.getPassword().length() == 0){
            return o1.getNick().compareTo(o2.getNick());
        }else {
            return o1.getPassword().length() - o2.getPassword().length();
        }
    }
}
