public class GroceryItem {

    private String item;    // Item name
    private double cost;    // Item price
    private int quantity;   // Item quantity (Task 4)

    // Constructor for Task 3 (without quantity)
    public GroceryItem(String itemName, double itemPrice) {
        item = itemName;
        cost = itemPrice;
    }

    // Constructor for Task 4 (with quantity)
    public GroceryItem(String itemName, double itemPrice, int itemQuantity) {
        item = itemName;
        cost = itemPrice;
        quantity = itemQuantity;
    }

    public String getName() {
        return item;
    }

    public double getCost() { // function for Task 5, to calculateTotalCostQuantityIncluded() in GroceryListTester Class.
        return cost;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    // Basic toString() used in displayByCategory()
    public String toString() {
        return "Grocery Item: " + item + ", Price: €" + cost;
    }

    // Detailed version used in displayAvailableItems()
    public String toDetailedString() {
        return "Grocery Item: " + item + ", Price: €" + cost + ", Quantity: " + quantity + " Kpl";
    }
}
