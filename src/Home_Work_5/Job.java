package Home_Work_5;

import Home_Work_5.dto.Animal;
import Home_Work_5.dto.Person;
import Home_Work_5.geters.GetAge;
import Home_Work_5.geters.IGetString;

import java.util.*;

public class Job {
    //переменная хранит в себе коллецию строк, каждая строка хранит время выполнения по каждой операции
    List <String> timeJob = new ArrayList<>();

    public List<String> getTimeJob() {
        return timeJob;
    }
    /**
     * Метод позволяет создать объект типа Person и добавить его в коллекцию типа List.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param nick - псевдоним пользователя.
     * @param password - пароль пользователя (от 5 до 10 символов).
     * @param name - имя пользователя.
     * @param people - коллекция, в которую добовляются созданные объекты типа Person.
     * @param count - необходимое колличество созданных объектов типа Person.
     */
    public void addPerson(IGetString nick,
                          IGetString password,
                          IGetString name,
                          List<Person> people,
                          int count){
        System.out.println("Наполнение коллекции List Person из " + count + " объектов");
        long start = System.currentTimeMillis();
        for(int i = 0; i < count; i++){
            people.add(new Person(nick.getString(),password.getString(), name.getString()));
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nОперация: Наполнение коллекции List Person из " + count + " объектов. " +
                "Заняла " + (stop - start) + " мс");
    }
    /**
     * Метод позволяет создать объект типа Person и добавить его в коллекцию типа Set
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param nick - псевдоним пользователя.
     * @param password - пароль пользователя (от 5 до 10 символов).
     * @param name - имя пользователя.
     * @param people - коллекция, в которую добовляются созданные объекты типа Person.
     * @param count - необходимое колличество созданных объектов типа Person.
     */
    public void addPerson(IGetString nick,
                          IGetString password,
                          IGetString name,
                          Set<Person> people,
                          int count){
        System.out.println("Наполнение коллекции Set Person из " + count + " объектов");
        long start = System.currentTimeMillis();
        for(int i = 0; i < count; i++){
            people.add(new Person(nick.getString(),password.getString(), name.getString()));
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nОперация: Наполнение коллекции Set Person из " + count + " объектов. " +
                "Заняла " + (stop - start) + " мс");
    }
    /**
     * Метод позволяет создать объект типа Animal и добавить его в коллекцию типа List.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param nick - кличка Animal.
     * @param count - необходимое колличество созданных объектов типа Animal.
     */
    public void addAnimal(IGetString nick,
                          GetAge age,
                          List<Animal> animal,
                          int count){
        System.out.println("Наполнение коллекции List Animal из " + count + " объектов");
        long start = System.currentTimeMillis();
        for(int i = 0; i < count; i++){
            animal.add(new Animal(nick.getString(),age.getAge()));
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nОперация: Наполнение коллекции List Animal из " + count + " объектов. " +
                "Заняла " + (stop - start) + " мс");
    }
    /**
     * Метод позволяет создать объект типа Animal и добавить его в коллекцию типа Set.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param nick - кличка Animal
     * @param count - необходимое колличество созданных объектов типа Animal
     */
    public void addAnimal(IGetString nick,
                          GetAge age,
                          Set<Animal> animal,
                          int count){
        System.out.println("Наполнение коллекции Set Animal из " + count + " объектов");
        long start = System.currentTimeMillis();
        for(int i = 0; i < count; i++){
            animal.add(new Animal(nick.getString(),age.getAge()));
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nОперация: Наполнение коллекции Set Animal из " + count + " объектов. " +
                "Заняла " + (stop - start) + " мс");
    }
    /**
     * Метод производит сортировку переданной коллекции List list по средствам
     * переданного компоратора comparator.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param list - коллекция, которую необходимо сортировать
     * @param comparator - компоратор, который производит сортировку
     */
    public void sortJDK(List list, Comparator comparator){
        System.out.println("Сортировка коллекции List методом sortJDK");
        long start = System.currentTimeMillis();
        Collections.sort(list,comparator);
        long stop = System.currentTimeMillis();
        timeJob.add("\nОперация: Сортировка коллекции List методом sortJDK. " +
                "Заняла " + (stop - start) + " мс");
    }

    /**
     * Метод производит сортировку переданной коллекции List list с дженериком <T> по средствам
     * переданного компоратора comparator.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param list - коллекция, которую необходимо сортировать.
     * @param comparator - компоратор, который производит сортировку.
     * @param <T> - дженерик, в метод могут быть переданны объекты типа Person, Animals.
     */
    public <T> void sortMy(List <T> list, Comparator <T> comparator){
        System.out.println("Сортировка коллекции List своим методом");
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = i + 1; j < list.size(); j++){
                if(comparator.compare(list.get(i), list.get(j)) > 0){
                    T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nСортировка коллекции List своим методом. " +
                "Заняла " + (stop - start) + " мс");
    }

    /**
     * Метод производит итрерацию коллекции List <T> list посредствам JDK.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param list - коллекция, которую необходимо проитерировать.
     * @param <T>  - дженерик, в метод могут быть переданны объекты типа Person, Animals.
     */
    public <T> void iteratorJava(List<T> list){
        System.out.println("Итерация коллекции List при помощи iterator");
        Iterator iterator = list.iterator();
        long start = System.currentTimeMillis();
        while (iterator.hasNext()){
            iterator.next();
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nИтерация коллекции List при помощи iterator. " +
                "Заняла " + (stop - start) + " мс");
    }
    /**
     * Метод производит итрерацию коллекции Set<T> set посредствам JDK.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param set - коллекция, которую необходимо проитерировать.
     * @param <T>  - дженерик, в метод могут быть переданны объекты типа Person, Animals.
     */
    public <T> void iteratorJava(Set<T> set){
        System.out.println("Итерация коллекции Set при помощи iterator");
        Iterator iterator = set.iterator();
        long start = System.currentTimeMillis();
        while (iterator.hasNext()){
            iterator.next();
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nИтерация коллекции Set при помощи iterator. " +
                "Заняла " + (stop - start) + " мс");
    }
    /**
     * Метод производит итрерацию коллекции List <T> list посредствам внутреннего способа итерации.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param list - коллекция, которую необходимо проитерировать.
     * @param <T>  - дженерик, в метод могут быть переданны объекты типа Person, Animals.
     */
    public <T> void iteratorMy(List<T> list){
        System.out.println("Итерация коллекции List при помощи другого способа");

        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++){
            list.get(i);
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nИтерация коллекции List при помощи другого способа. " +
                "Заняла " + (stop - start) + " мс");
    }
    /**
     * Метод производит итрерацию коллекции Set<T> set посредствам внутреннего способа итерации.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param set - коллекция, которую необходимо проитерировать.
     * @param <T> - дженерик, в метод могут быть переданны объекты типа Person, Animals.
     */
    public <T> void iteratorMy(Set<T> set){
        System.out.println("Итерация коллекции Set при помощи другого способа");

        long start = System.currentTimeMillis();
        for (int i = 0; i < set.size(); i++){

        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nИтерация коллекции Set при помощи другого способа. " +
                "Заняла " + (stop - start) + " мс");
    }
    /**
     * Метод удаляет элементы коллекции List <T> list при помощи iterator.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param list - коллекция, которую необходимо проитерировать.
     * @param <T> - дженерик, в метод могут быть переданны объекты типа Person, Animals.
     */
    public <T> void removeAllJava(List <T> list){
        System.out.println("Очистка коллекции List при помощи iterator.");
        Iterator iterator = list.iterator();
        long start = System.currentTimeMillis();
        while (iterator.hasNext()){
            iterator.next();
            list.remove(iterator);
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nОчистка коллекции List при помощи iterator. " +
                "Заняла " + (stop - start) + " мс");
    }
    /**
     * Метод удаляет элементы коллекции Set <T> set при помощи iterator.
     * Метод засекает время выполнения данного метода и помещает данные в
     * коллекцию List <String> timeJob.
     * @param set - коллекция, которую необходимо проитерировать.
     * @param <T> - дженерик, в метод могут быть переданны объекты типа Person, Animals.
     */
    public <T> void removeAllJava(Set <T> set){
        System.out.println("Очистка коллекции Set при помощи iterator.");
        Iterator iterator = set.iterator();
        long start = System.currentTimeMillis();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        long stop = System.currentTimeMillis();
        timeJob.add("\nОчистка коллекции List при помощи iterator. " +
                "Заняла " + (stop - start) + " мс");
    }
    @Override
    public String toString() {
        return "Job{" +
                "timeJob=" + timeJob +
                '}';
    }
}
