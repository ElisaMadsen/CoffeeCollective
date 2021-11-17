package products;

public abstract class Beverage {
    private String title;
    private int price;

    public Beverage(String title, int price) {
        this.title = title;
        this.price = price;
    }



    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                 title + " " + price + " Kr. ";
    }
}
