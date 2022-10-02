package pizza.dto;

import pizza.api.IOrder;
import pizza.api.ISelectedItem;

import java.util.List;


public class Order implements IOrder {

    private List<ISelectedItem> selectedItems;

    public Order(List<ISelectedItem> selectedItems) {
        this.selectedItems = selectedItems;
    }
    /**
     * Список выбранного для заказа
     * @return список выбранного
     */
    @Override
    public List<ISelectedItem> getSelected() {
        return this.selectedItems;
    }

    @Override
    public String toString() {
        return ""  + selectedItems;
    }
}
