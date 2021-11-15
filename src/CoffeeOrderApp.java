import controllers.OrderController;
import statistics.CustomerBasket;
import ui.OrderTakingMenu;
import statistics.StatisticsMenu;

public class CoffeeOrderApp {

   private static CoffeeOrderApp orderApp = new CoffeeOrderApp();
   private static OrderTakingMenu orderMenu = new OrderTakingMenu();
   private static StatisticsMenu statisticsMenu = new StatisticsMenu();
   private static OrderController orderController = new OrderController();
   private static CustomerBasket customerBasket = new CustomerBasket();

    public static void main(String[] args) {
        //Currently everything is in main... Hmm maybe someone should fix this? Maybe if one had a pattern to follow
        //Could be a pattern to "control" the flow of execution

        orderApp.orderMenu.welcomeUser();

        CustomerBasket basket = orderApp.orderController.createOrder();

        basket.getTotalPrice();



    }
}
