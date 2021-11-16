package controllers;

import productFactory.ProductFactory;
import products.*;
import statistics.CoffeeTypeCounter;
import statistics.CustomerBasket;
import ui.OrderTakingMenu;
import statistics.StatisticsMenu;

public class OrderController {

    private OrderTakingMenu orderTakingMenu = new OrderTakingMenu();
    private StatisticsMenu statisticsMenu = new StatisticsMenu();
    private CoffeeTypeCounter coffeeTypeCounter = new CoffeeTypeCounter();
    private ProductFactory productFactory = new ProductFactory();

    public CustomerBasket createOrder() {
        int userInput;
        CustomerBasket currentCustomer = new CustomerBasket();

        do {
            orderTakingMenu.printOptions();
            userInput = orderTakingMenu.receiveUserInput();

            switch (userInput) {
                case 1:
                    Beverage newAmericano = productFactory.createBeverage("americano");
                    currentCustomer.addBeverage(newAmericano);
                    coffeeTypeCounter.oneAmericanoSold();
                    break;
                case 2:
                    Beverage newEspresso = productFactory.createBeverage("espresso");
                    currentCustomer.addBeverage(newEspresso);
                    coffeeTypeCounter.oneEspressoSold();
                    break;
                case 3:
                    Beverage newTea = productFactory.createBeverage("tea");
                    currentCustomer.addBeverage(newTea);
                    coffeeTypeCounter.oneTeaSold();
                    break;
                case 4:
                    Food newCroissant = productFactory.createFood("croissant");
                    currentCustomer.addFood(newCroissant);
                    coffeeTypeCounter.oneCroissantSold();
                    break;
                case 5:
                    Food newBaguette = productFactory.createFood("baguette");
                    currentCustomer.addFood(newBaguette);
                    coffeeTypeCounter.oneBaguetteSold();
                    break;
                case 6:
                    statisticsMenu.printStatistics();
                    break;
            }
        } while (userInput != 9);
        return currentCustomer;
    }
}
