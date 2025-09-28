

// Class for users to add items, remove items, and calculate the total cost of items in the cart.

import java.util.HashMap;

public class ShoppingCart {

    HashMap<String, Double> items = new HashMap<>();


    // method to add an item to the cart. If the item already exists, update its price. If the price is zero or negative, remove the item.
    public void addItem(String item, double price) {
        if (price > 0 && item != null && !item.isEmpty()) {
            items.put(item, price);
        } else  {
            items.remove(item);
        }
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }

    public int getItemCount() {
        return items.size();
    }
}
