package Home_Work_5.comporators;

import Home_Work_5.dto.Animal;

import java.util.Comparator;

public class ComparatorNickAnimal implements Comparator <Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
