import controllers.OrderController;
import database.FileReader;
import statistics.CustomerBasket;
import ui.OrderTakingMenu;
import statistics.StatisticsMenu;

public class CoffeeOrderApp {

   private static CoffeeOrderApp orderApp = new CoffeeOrderApp();
   private static OrderTakingMenu orderMenu = new OrderTakingMenu();
   private static OrderController orderController = new OrderController();

    public static void main(String[] args) {
        //Currently everything is in main... Hmm maybe someone should fix this? Maybe if one had a pattern to follow
        //Could be a pattern to "control" the flow of execution

        orderApp.orderMenu.welcomeUser();

        CustomerBasket basket = orderApp.orderController.createOrder();

        basket.getTotalPrice();



    }
}
