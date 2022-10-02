package pizza.dto;

import pizza.api.IStage;

import java.time.LocalTime;

public class Stage implements IStage {
    /**
     * описание стадии готовности
     */
    private String stageDescription;

    /**
     * время добавление статуса
     */
    private LocalTime stageTime = LocalTime.now();

    public Stage(String stageDescription) {
        this.stageDescription = stageDescription;
    }

    /**
     * Описание этапа
     * @return
     */
    @Override
    public String getDescription() {
        return this.stageDescription;
    }
    /**
     * Когда этап был начат
     * @return
     */
    @Override
    public LocalTime getTime() {
        return this.stageTime;
    }

    @Override
    public String toString() {
        return "Статус заказа: " +
                "этап выполнения - " + stageDescription +
                ", время: " + stageTime +
                '}';
    }
}
