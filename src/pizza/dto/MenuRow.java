package pizza.dto;

import pizza.api.IMenuRow;
import pizza.api.IPizzaInfo;

public class MenuRow implements IMenuRow {

    private IPizzaInfo info;
    private double price;

    public MenuRow(IPizzaInfo info, double price) {
        this.info = info;
        this.price = price;
    }

    @Override
    public IPizzaInfo getInfo() {
        return this.info;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "MenuRow{" +
                "info=" + info +
                ", price: " + price + "руб" +
                '}' + "\n";
    }
}
