public class TestOrder{

    public static void main(String[] args){

        CoffeeKiosk kiosk = new CoffeeKiosk();

        // Add items to menu
        kiosk.addMenuItem("pizza", 8.99);
        kiosk.addMenuItem("burger", 5.99);
        kiosk.addMenuItem("fries", 2.99);
        kiosk.addMenuItem("soda", 1.99);
        kiosk.addMenuItem("coffee", 1.99);
        kiosk.addMenuItem("tea", 1.99);

        kiosk.addMenuItemByInput();

        // Display menu
        kiosk.displayMenu();

        // Create new order
        kiosk.newOrder();



    }
}