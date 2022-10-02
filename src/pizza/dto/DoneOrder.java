package pizza.dto;

import pizza.api.IDoneOrder;
import pizza.api.IPizza;
import pizza.api.ITicket;
import java.util.ArrayList;
import java.util.List;
/**
 * Готовый заказ
 */
public class DoneOrder implements IDoneOrder {
    private ITicket ticket;
    private List<IPizza> pizzas;

    public DoneOrder(ITicket ticket) {
        this.ticket = ticket;
        getPizzas(ticket);
    }

    /**
     * Квиток по которому заказ готовился
     * @return квиток выданный при формировании заказа
     */
    @Override
    public ITicket getTicket() {
        return this.ticket;
    }

    /**
     * Готовые пиццы приготовленные по заказу
     * @return список пицц
     */
    @Override
    public List<IPizza> getItems() {
        return this.pizzas;
    }

    public List<IPizza> getPizzas(ITicket ticket) {
            pizzas = new ArrayList<>();
            int sizeOrder = ticket.getOrder().getSelected().size();
            for (int i = 0; i < sizeOrder; i++) {
                pizzas.add(new Pizza(ticket.getOrder().getSelected().get(i).getRow().getInfo().getName(),
                        ticket.getOrder().getSelected().get(i).getRow().getInfo().getSize()));
            }return pizzas;
    }

    @Override
    public String toString() {
        return "DoneOrder{" +
                "ticket=" + ticket +
                ", pizzas=" + pizzas +
                '}';
    }
}
