import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    // getter 
    public ArrayList<Item> getMenu(){
        return this.menu;
    }

    public ArrayList<Order> getOrders(){
        return this.orders;
    }

    // Methods

    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        menu.add(item);
        int indexItem = menu.indexOf(item);
        item.setIndex(indexItem);
    }

    public void displayMenu(){
        System.out.println("\n---- MENU -----");

        for(Item item : menu){
            int itemIndex = item.getIndex();
            String itemName = item.getItemName();
            double itemPrice = item.getItemPrice();
            System.out.printf("%d %s -- $%.2f\n", itemIndex, itemName, itemPrice);
        }
    }

    public void newOrder() {
        
        System.out.println("\nPlease enter customer name for new order:");
        String name = System.console().readLine();
        
        Order order = new Order(name);
        this.displayMenu();

        System.out.println("\nPlease enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        while(!itemNumber.equals("q")) {
            int itemIndex = Integer.parseInt(itemNumber);

            if (itemIndex >= 0 && itemIndex < this.menu.size()) {
                Item item = this.menu.get(itemIndex);
                order.addItem(item);
                System.out.println("\nPlease enter a menu item index or q to quit:");
                itemNumber = System.console().readLine();
            } else {
                System.out.println("\nPlease enter a valid menu item index or q to quit:");
                itemNumber = System.console().readLine();
            }
        }
        order.display();
        order.getOrderTotal();
    }

    public void addMenuItemByInput(){
        System.out.println("\nPlease enter a menu item name:");
        String name = System.console().readLine();
        System.out.println("\nPlease enter a menu item price:");
        String price = System.console().readLine();
        double priceDouble = Double.parseDouble(price);
        this.addMenuItem(name, priceDouble);
        
    }
    
}
