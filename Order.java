import java.util.ArrayList;
public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String nameParam){
        this.name = nameParam;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // Getter & Setter

    public String getName(){
        return this.name;
    }

    public void setOrderName(String newName){
        this.name = newName;
    }

    public boolean getOrderStatus(){
        return this.ready;
    }

    public void setOrderStatus(boolean newStatus){
        this.ready = newStatus;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void setItems(ArrayList<Item> newItems){
        this.items = newItems;
    }


    // Methods

    public void addItem(Item item){
        this.items.add(item);
        System.out.println("Item added: " + item.getItemName());
    }

    public String getStatusMessage(){
        if(this.ready){
            return "\nYour order is ready!";
        }
        else{
            return "\nThank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0.00;

        for(int i = 0; i < this.items.size(); i++){
            Item itemObject = this.items.get(i);
            double itemPrice = itemObject.getItemPrice();
            total += itemPrice;
        }
        System.out.printf("\nOrder Total: $%.2f", total);
        return total;
    }

    // Or do it this way:
    // public double getOrderTotal(){
    //     double total = 0;
    //     for(Item item : this.items){
    //         total += item.getItemPrice();
    //     }
    //     return total;
    // }

    public void display(){
        System.out.println("\n----- Customer Order Details -----");

        System.out.println("\nCustomer Name: " + this.name);

        for(int i = 0; i < this.items.size(); i++ ){
            Item itemObject = this.items.get(i);
            String itemName = itemObject.getItemName();
            double itemPrice = itemObject.getItemPrice();
            System.out.printf("%s: $%.2f\n", itemName, itemPrice);
        }
    }

    // Or do it this way:
    // public void display(){
    //     System.out.println("Customer Name: "+this.name);
    //     for(Item item : this.items){
    //         System.out.println(item.getItemName()+" - $"+item.getItemPrice());
    //     }
    //     System.out.println("Total: $"+getOrderTotal());
    // }
}
