package pizza.dto;

import pizza.api.IMenuRow;
import pizza.api.ISelectedItem;
/**
 * Выбор покупателя
 */
public class SelectedItem implements ISelectedItem {
    private IMenuRow row;
    private int count;

    public SelectedItem(IMenuRow row, int count) {
        this.row = row;
        this.count = count;
    }
    /**
     * Выбранное из меню
     * @return
     */
    @Override
    public IMenuRow getRow() {
        return this.row;
    }
    /**
     * Количество выбранного
     * @return
     */
    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "Выбрана позиция{" +
                "номер=" + row +
                ", количество=" + count +
                '}';
    }
}
