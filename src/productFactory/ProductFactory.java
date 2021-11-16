package productFactory;

import products.*;

public class ProductFactory {
    Food newFood;
    Beverage newBeverage;

    public Food createFood(String title){
        if (title.contains("croissant")){
            newFood = new Croissant();
        } else if (title.contains("baguette")){
            newFood = new Baguette();
        }
        return newFood;
    }

    public Beverage createBeverage (String title){
        if (title.contains("americano")){
            newBeverage = new Americano();
        } else if (title.contains("espresso")){
            newBeverage = new Espresso();
        }else if (title.contains("tea")){
            newBeverage = new Tea();
        }
        return newBeverage;
    }


}
