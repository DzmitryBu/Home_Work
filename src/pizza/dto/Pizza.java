package pizza.dto;

import pizza.api.IPizza;

public class Pizza implements IPizza {
    private String name;
    private int size;

    public Pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Название пиццы
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }
    /**
     * Размер пиццы
     * @return
     */
    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
