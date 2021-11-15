package controllers;

import products.*;
import statistics.CoffeeTypeCounter;
import statistics.CustomerBasket;
import ui.OrderTakingMenu;
import statistics.StatisticsMenu;

public class OrderController {

    private OrderTakingMenu orderTakingMenu = new OrderTakingMenu();
    private StatisticsMenu statisticsMenu = new StatisticsMenu();
    private CoffeeTypeCounter coffeeTypeCounter = new CoffeeTypeCounter();

    public CustomerBasket createOrder() {
        int userInput;
        CustomerBasket currentCustomer = new CustomerBasket();
        do {
            orderTakingMenu.printOptions();
            userInput = orderTakingMenu.receiveUserInput();
            switch (userInput) {
                case 1:
                    currentCustomer.addToAmericano(new Americano());
                    coffeeTypeCounter.oneAmericanoSold();
                    break;
                case 2:
                    currentCustomer.addToEspresso(new Espresso());
                    coffeeTypeCounter.oneEspressoSold();
                    break;
                case 3:
                    currentCustomer.addToTea(new Tea());
                    coffeeTypeCounter.oneTeaSold();
                    break;
                case 4:
                    currentCustomer.addToCroissant(new Croissant());
                    coffeeTypeCounter.oneCroissantSold();
                    break;
                case 5:
                    currentCustomer.addToBaguette(new Baguette());
                    coffeeTypeCounter.oneBaguetteSold();
                    break;
                case 6:
                    statisticsMenu.printStatisticsChoice();
                    statisticsMenu.displayStatistics();
                    break;
            }
        } while (userInput != 9);
        return currentCustomer;
    }
}
