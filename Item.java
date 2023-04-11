public class Item {
    private String name;
    private double price;
    private int index;

    public Item(String itemName, double itemPrice){
        this.name = itemName;
        this.price = itemPrice;
        this.index = getIndex();

    }

    public String getItemName(){
        return this.name;
    }

    public void setItemName(String newName){
        this.name = newName;
    }

    public double getItemPrice(){
        return this.price;
    }

    public void setItemPrice(double num){
        this.price = num;
    }

    public int getIndex(){
        return this.index;
    }

    public void setIndex(int number){
        this.index = number;
    }
}
