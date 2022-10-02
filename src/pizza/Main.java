package pizza;

import pizza.api.*;
import pizza.dto.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создаем объекты PizzaInfo, хранящие информацию о пиццах
        PizzaInfo munhekckay2 = new PizzaInfo("Мюнхенская","Баварские колбаски, соус барбекю," +
                " томаты, горчица, сыр моцарелла, мюнхенские колбаски, ветчина", 2);
        PizzaInfo munhekckay3 = new PizzaInfo("Мюнхенская","Баварские колбаски, соус барбекю," +
                " томаты, горчица, сыр моцарелла, мюнхенские колбаски, ветчина", 3);
        PizzaInfo karbonaro2 = new PizzaInfo("Карбонара", "Шампиньоны, лук, крем фреш, бекон," +
                " сыр моцарелла, ветчина", 2);
        PizzaInfo spussy2 = new PizzaInfo("Спайси", "Пепперони, томатный соус domino's, " +
                "сыр моцарелла, халапеньо, томаты, бекон", 2);
        PizzaInfo spussy3 = new PizzaInfo("Спайси", "Пепперони, томатный соус domino's, " +
                "сыр моцарелла, халапеньо, томаты, бекон", 3);
        PizzaInfo barbeky2 = new PizzaInfo("Барбекю", "Шампиньоны, лук, курица, бекон," +
                " соус барбекю, сыр моцарелла", 2);
        PizzaInfo barbeky3 = new PizzaInfo("Барбекю", "Шампиньоны, лук, курица, бекон," +
                " соус барбекю, сыр моцарелла", 3);
        PizzaInfo mitzza2 = new PizzaInfo("Митzzа", "Бекон, сыр моцарелла, томатный соус domino's, " +
                "пармезан, буженина, телятина, пепперони, ветчина", 2);
        PizzaInfo mitzza3 = new PizzaInfo("Митzzа", "Бекон, сыр моцарелла, томатный соус domino's, " +
                "пармезан, буженина, телятина, пепперони, ветчина", 3);


        //Создаем строки меню и к описанию пицц добовляем стоимость
        MenuRow row1 = new MenuRow(munhekckay2, 29.99);
        MenuRow row2 = new MenuRow(munhekckay3, 32.99);
        MenuRow row3 = new MenuRow(karbonaro2,25.49);
        MenuRow row4 = new MenuRow(spussy2,25.49);
        MenuRow row5 = new MenuRow(spussy3,28.99);
        MenuRow row6 = new MenuRow(barbeky2,25.49);
        MenuRow row7 = new MenuRow(barbeky3,28.99);
        MenuRow row8 = new MenuRow(mitzza2,30.49);
        MenuRow row9 = new MenuRow(mitzza3,33.49);

        //Сщздаем летнее (summer) меню и заполняем строками из меню
        List<IMenuRow> summer = new ArrayList<>();
        summer.add(row1);
        summer.add(row2);
        summer.add(row3);
        summer.add(row4);
        summer.add(row5);
        summer.add(row6);
        summer.add(row7);
        summer.add(row8);
        summer.add(row9);

        //Создаем пиццерию dominos с летним (summer) меню
        Pizzeria dominos = new Pizzeria(summer);

        //Клиент Дима делает свой выбор
        List<ISelectedItem> dimaSelected = new ArrayList<>();
        dimaSelected.add(new SelectedItem(row3, 2));
        dimaSelected.add(new SelectedItem(row5,1));

        //Создаем заказ клиента Дима и создаем квиток для Дима
        Order dima = new Order(dimaSelected);
        ITicket dimaTicket = dominos.create(dima);

        //Клиент Катя делает свой выбор
        List<ISelectedItem> katySelected = new ArrayList<>();
        katySelected.add(new SelectedItem(row9, 1));

        //Создаем заказ клиента Катя и создаем квиток для Катя
        Order katy = new Order(katySelected);
        ITicket katyTicket = dominos.create(katy);

        //Выводим меню пиццерии dominos
        System.out.println("Получаем меню");
        System.out.println((dominos.takeMenu()));

        //Создаем (Оформляем) заказы наших клиентов
//        System.out.println("\nСоздаем (Оформляем) заказы");
//        System.out.println(dimaTicket);
//        System.out.println(katyTicket);

        //Добовляем статусы выполнения наших заказов
        dominos.addStatus(dimaTicket,new Stage("Заказ принят"));
        dominos.addStatus(dimaTicket,new Stage("Готовится"));
        dominos.addStatus(katyTicket,new Stage("Заказ принят"));
        dominos.addStatus(dimaTicket,new Stage("Упаковка"));
        dominos.addStatus(katyTicket,new Stage("Готовится"));
        dominos.addStatus(dimaTicket,new Stage("Готов"));
        dominos.addStatus(katyTicket,new Stage("Упаковка"));

        //Проверяем статусы выполнения наших заказов
        System.out.println("\nПроверяем статусы заказов");
        System.out.println(dominos.check(dimaTicket));
        System.out.println(dominos.check(katyTicket));

        //Получаем сформированные заказы
        System.out.println("\nПолучаем сформированный заказ");
        System.out.println(dominos.pickup(dimaTicket));
        System.out.println(dominos.pickup(katyTicket));

        //Добовляем статус для заказов
        dominos.addStatus(katyTicket,new Stage("Готов"));

        //Проверяем статусы выполнения наших заказов
        System.out.println("\nПроверяем статус заказа");
        System.out.println(dominos.check(katyTicket));

        System.out.println("\nПолучаем сформированный заказ");
        System.out.println(dominos.pickup(katyTicket));
    }
}
