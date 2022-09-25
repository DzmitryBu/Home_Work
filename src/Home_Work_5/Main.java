package Home_Work_5;

import Home_Work_5.comporators.*;
import Home_Work_5.geters.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Job job = new Job();
        List people = new LinkedList();
        List people2 = new ArrayList<>();
        Set people3 = new HashSet<>();
        Set people4 = new TreeSet<>(new ComparatorPerson());

        List animal = new LinkedList();
        List animal2 = new ArrayList();
        Set animal3 = new HashSet();
        Set animal4 = new TreeSet<>(new ComparatorAnimal());

        //Наполняем коллекции
        job.addPerson(new GetNickFile(), new GetPassword(), new GetNameFile(), people, 10_000);
        job.addPerson(new GetNick(), new GetPassword(), new GetName(), people2, 10_000);
        job.addPerson(new GetNick(), new GetPassword(), new GetName(), people3, 10_000);
        job.addPerson(new GetNick(), new GetPassword(), new GetName(), people4, 10_000);

        job.addAnimal(new GetNickFile(), new GetAge(), animal, 10_000);
        job.addAnimal(new GetNick(), new GetAge(), animal2, 10_000);
        job.addAnimal(new GetNick(), new GetAge(), animal3, 10_000);
        job.addAnimal(new GetNick(), new GetAge(), animal4, 10_000);

        //Сортируем встроенными средствами jdk
        job.sortJDK(people, new ComparatorPerson());
        job.sortJDK(people2, new ComparatorPerson());
        job.sortJDK(animal, new ComparatorAnimal());
        job.sortJDK(animal2, new ComparatorAnimal());

        //Сортируем собственным методом сортировки
        job.sortMy(people, new ComparatorPerson());
        job.sortMy(people2, new ComparatorPerson());
        job.sortMy(animal, new ComparatorAnimal());
        job.sortMy(animal2, new ComparatorAnimal());

        //Итерируем при помощи iterator
        job.iteratorJava(people);
        job.iteratorJava(people2);
        job.iteratorJava(people3);
        job.iteratorJava(people4);

        job.iteratorJava(animal);
        job.iteratorJava(animal2);
        job.iteratorJava(animal3);
        job.iteratorJava(animal4);

        //Итерируем при помощи другого способа
        job.iteratorMy(people);
        job.iteratorMy(people2);
        job.iteratorMy(people3);
        job.iteratorMy(people4);

        job.iteratorMy(animal);
        job.iteratorMy(animal2);
        job.iteratorMy(animal3);
        job.iteratorMy(animal4);

        //Очистка коллекции при помощи iterator
        job.removeAllJava(people);
        job.removeAllJava(people2);
        job.removeAllJava(people3);
        job.removeAllJava(people4);

        job.removeAllJava(animal);
        job.removeAllJava(animal2);
        job.removeAllJava(animal3);
        job.removeAllJava(animal4);

        System.out.println(job.getTimeJob());

    }
}
