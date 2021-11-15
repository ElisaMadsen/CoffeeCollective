package statistics;

import products.*;

import java.util.ArrayList;

public class CustomerBasket {
    private ArrayList<Americano> americansOrdered = new ArrayList<Americano>();
    private ArrayList<Espresso> espressosOrdered = new ArrayList<Espresso>();
    private static ArrayList<Tea> teaOrdered = new ArrayList<Tea>();
    private ArrayList<Croissant> croissantsOrdered = new ArrayList<Croissant>();
    private ArrayList<Baguette> baguettesOrdered = new ArrayList<Baguette>();
    private static ArrayList<Integer> orderPrice = new ArrayList<Integer>();

    public void addToAmericano(Americano order){
        americansOrdered.add(order);
        orderPrice.add(order.getPrice());
    }
    public void addToEspresso(Espresso order){
        espressosOrdered.add(order);
        orderPrice.add(order.getPrice());
    }
    public static void addToTea(Tea order){
        teaOrdered.add(order);
        orderPrice.add(order.getPrice());
    }
    public void addToCroissant(Croissant order){
        croissantsOrdered.add(order);
        orderPrice.add(order.getPrice());
    }
    public void addToBaguette(Baguette order){
        baguettesOrdered.add(order);
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
}
