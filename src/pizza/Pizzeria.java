package pizza;

import pizza.api.*;
import pizza.dto.*;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Pizzeria implements IPizzeria {

    private Map<Ticket, OrderStatus> map = new Hashtable<>();
    private List<IMenuRow> menu;

    public Pizzeria(List<IMenuRow> menuRows) {
        this.menu = menuRows;
    }
    public Map<Ticket, OrderStatus> getMap() {
        return map;
    }
    /**
     * Получить меню
     * @return меню с доступными для заказа пиццами
     */
    @Override
    public IMenu takeMenu() {
        return new Menu(menu);
    }
    /**
     * Оформить заказ
     * @param order заказ
     * @return квиток для отслеживания
     */
    @Override
    public ITicket create(IOrder order) {
        Ticket ticket = new Ticket(order);
        map.put(ticket, new OrderStatus(ticket));
        return ticket;
    }
    /**
     * Проверить состояние заказа по квитку
     * @param ticket квиток выданный при создании заказа
     * @return информация о состоянии заказа
     */
    @Override
    public IOrderStatus check(ITicket ticket) {
        return map.get(ticket);
    }
    /**
     * Получить сформированный заказ
     * @param ticket квиток выданный при создании заказа
     * @return готовый заказ с тем что мы выбрали
     */
    @Override
    public IDoneOrder pickup(ITicket ticket) {
        try {
            if(!map.get(ticket).getDone()) throw new Exception("Заказ " + ticket.getNumber() +
                    " еще не готов, мы делаем все возможное!");
                return new DoneOrder(ticket);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void addStatus(ITicket ticket, Stage stage){
       OrderStatus orderStatus = map.get(ticket);
       orderStatus.addStatus(stage);
    }
}