package pizza.dto;

import pizza.api.IMenu;
import pizza.api.IMenuRow;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {
    private List<IMenuRow> Items;

    public Menu(List<IMenuRow> items) {
        Items = items;
    }

    @Override
    public List<IMenuRow> getItems() {
        return this.Items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "Items=" + Items +
                '}';
    }
}
