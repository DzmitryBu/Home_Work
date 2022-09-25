package Home_Work_5.comporators;

import Home_Work_5.dto.Person;

import java.util.Comparator;

public class ComparatorPasswordPerson implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }
}
