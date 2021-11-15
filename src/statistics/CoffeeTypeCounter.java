package statistics;

public class CoffeeTypeCounter {
    private static int americanos = 0;
    private static int espressos = 0;
    private static int teas = 0;
    private static int croissants= 0;
    private static int baguettes= 0;

    public void oneAmericanoSold(){
       americanos++;
    }
    public void oneEspressoSold(){
        espressos++;
    }
    public void oneTeaSold(){
        teas++;
    }
    public void oneCroissantSold(){
        croissants++;
    }
    public void oneBaguetteSold(){
        baguettes++;
    }

    public static String howManyCoffeesSold(){
        return "Americano: " + americanos + "\nEspresso: " + espressos + "\nTea: " + teas;
    }

    public static String howManyFoodsSold(){
        return "Croissant: " + croissants + "\nBaguette: " + baguettes;
    }

    public static void howManySoldInTotal(){
        System.out.println(howManyCoffeesSold() + howManyCoffeesSold());
    }
}
