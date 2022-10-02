package pizza.dto;

import pizza.api.IOrder;
import pizza.api.ITicket;
import java.time.LocalDateTime;
import java.util.Random;

public class Ticket implements ITicket {
    private String number = getString();

    private LocalDateTime TimeCreatAt = LocalDateTime.now();
    private IOrder order;

    public Ticket(IOrder order) {
        this.order = order;
    }

    /**
     * Уникальный номер заказа
     * @return
     */
    @Override
    public String getNumber() {
        return this.number;
    }
    /**
     * Когда заказ получен
     * @return
     */
    @Override
    public LocalDateTime getCreatAt() {
        return this.TimeCreatAt;
    }
    /**
     * Заказ для которого выдали квиток
     * @return
     */
    @Override
    public IOrder getOrder() {
        return this.order;
    }

    /**
     * Метод генерирует строку, где первые два символа буквы англ.алфавита, а остальные случайные числа
     * от 0 до 1000.
     * @return - случайную строку из 2-х первых бакв и остальных чисел.
     */
    public String getString() {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 2; i++) {
            int number = random.nextInt(52);
            sb.append(str.charAt(number));
        }
        return sb.toString() + random.nextInt(1000);
    }

    @Override
    public String toString() {
        return "Квиток{" +
                "Номер заказа:'" + number + '\'' +
                ", Время оформления заказа: " + TimeCreatAt +
//                ",\nСостав заказа: " + order
                + '}';
    }
}
