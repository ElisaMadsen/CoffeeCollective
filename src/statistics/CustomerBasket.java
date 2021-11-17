package statistics;

import products.*;

import java.util.ArrayList;

public class CustomerBasket {
    private ArrayList<Beverage> beveragesOrdered = new ArrayList<Beverage>();
    private ArrayList<Food> foodsOrdered = new ArrayList<Food>();
    private static ArrayList<Integer> orderPrice = new ArrayList<Integer>();



    public void addBeverage (Beverage order){
        beveragesOrdered.add(order);
        orderPrice.add(order.getPrice());
    }

    public void addFood (Food order){
        foodsOrdered.add(order);
        orderPrice.add(order.getPrice());
    }

    public int getTotalPrice(){
        int priceTotal = 0;
        for (int i = 0; i < orderPrice.size(); i++) {
            orderPrice.get(i);
            priceTotal = orderPrice.get(i) + priceTotal;
        }
        System.out.println("Total price: " + priceTotal + "kr.");
        return priceTotal;
    }

    @Override
    public String toString() {
        return "Receipt: \n" +
                "Beverage: " + beveragesOrdered +
                " \nFood: " + foodsOrdered;
    }
}
