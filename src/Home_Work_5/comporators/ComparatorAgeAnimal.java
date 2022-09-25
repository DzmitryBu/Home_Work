package Home_Work_5.comporators;

import Home_Work_5.dto.Animal;

import java.util.Comparator;

public class ComparatorAgeAnimal implements Comparator <Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }
}
