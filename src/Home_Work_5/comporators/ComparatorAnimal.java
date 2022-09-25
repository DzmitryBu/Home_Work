package Home_Work_5.comporators;

import Home_Work_5.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimal implements Comparator<Animal> {
    /**
     * Метод производит сравнение двух объектов по двум параметром. На первом этапе
     * производится сравнение возроста. Если двозрост одинаковый, то
     * производится сравнение кличек.
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Отрицательное число, если возрост o2, больше возроста o1 ИЛИ
     * (при условии одинакового возроста) если кличка o2 в алфамитном порядке дальше o1.
     * Положительное число, если возрост o2, больше возроста o1 ИЛИ
     * (при условии одинакового возроста) если кличка o1 в алфамитном порядке дальше o2.
     * ИЛИ возвращает 0, если все параметры равны.
     */
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getAge() - o2.getAge() == 0){
           return o1.getNick().compareTo(o2.getNick());
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
