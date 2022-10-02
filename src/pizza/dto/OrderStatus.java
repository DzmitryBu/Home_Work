package pizza.dto;

import pizza.api.IOrderStatus;
import pizza.api.IStage;
import pizza.api.ITicket;
import java.util.ArrayList;
import java.util.List;

/**
 * Статус заказа выданный по определённому квитку
 */
public class OrderStatus implements IOrderStatus {

    private Ticket ticket;
    private List<IStage> history = new ArrayList<>();
    private boolean done = isDone();

    public OrderStatus(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean getDone() {
        return this.done;
    }
    /**
     * По какому квитку мы получили статус
     * @return
     */
    @Override
    public ITicket getTicket() {
        return this.ticket;
    }


    /**
     * Получить список пройденных этапов
     * @return пройденные этапы заказа
     */
    @Override
    public List<IStage> getHistory() {
        return this.history;
    }
    /**
     * Признак готовности заказа
     * @return true - если одно из описаний "Готов", false - неготов
     */
    @Override
    public boolean isDone() {
        for (IStage iStage : history) {
            if("Готов".equals(iStage.getDescription())){
                return true;
            }
        }return false;
    }

    public void addStatus(Stage stage){
        history.add(stage);
        done = isDone();
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "ticket=" + ticket +
                ", history=" + history +
                ", done=" + done +
                '}';
    }
}
