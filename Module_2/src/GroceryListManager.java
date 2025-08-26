import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    // Task 1
    private final ArrayList<String> fristList = new ArrayList<>();

    public void addItem(String item) { // func to add items
        fristList.add(item);
    }

    public boolean checkItem(String item) {   // func to chack if items, boolean func type: true, or false
        return fristList.contains(item);
    }

    public void removeItem(String item) {      // func to remove items
        if (fristList.remove(item)) {
            System.out.println("\nRemoving " + item + " from the list...");
        } else {
            System.out.println(item + " is not in the list.");
        }
    }

    public void displayList() {     // func to display all our Category

        // then we go for each item after chacking for all, print with get (i)
        for (int i = 0; i < fristList.size(); i++) {
            String item = fristList.get(i);           // printing with get(i) becuz it chacking for each item.

            System.out.println((i + 1) + ". " + item); // math to get each item with list number (i + 1) 1, 2, 3...
        }
    }


    // Task 2

    private final HashMap<String, Double> secondList = new HashMap();


    public void addItemWithPrice(String item, double cost) {
        secondList.put(item, cost);
    }

    public void calculateTotalCost() {
        double totalCost = 0;
        for (double price : secondList.values()) {
            totalCost = totalCost + price;
        }
            System.out.println("\nTotal cost: " + totalCost + "€" );
        }


    // Task 3
    HashMap<String, ArrayList<GroceryItem>> thirdList = new HashMap<>(); // the selotin for that we make String object, the String List, then we convert the String List to string for item and (double) cost.

    // by this method we can have the: item, cost, category
    public void addItemWithCategory(String item, double cost, String category) {

        GroceryItem myGroceryItem = new GroceryItem(item, cost);

        thirdList.putIfAbsent(category, new ArrayList<>()); // this line works as "Fruits" => [] which means if there's no category called "Fruits", put it and add new ArrayList [].

        thirdList.get(category).add(myGroceryItem);         // this line says: bring the empty ArrayList "Fruits" => [] and add the by Class Grocery(item, cost)  into the ArrayList "Fruits" => [Apples - 5.0€].


    }

    public void displayByCategory(String category) {
        if (!thirdList.containsKey(category)) {                          // in this line we have if statement, if we don't find items the in the list of category name for example "Fruits" we print: "Fruits" => [an empty list]
            System.out.println("no items found in the: " +  category);   // here we print
        }

        System.out.println("items found in the " + category + ":");   // print the category (name if found):
        for (GroceryItem item : thirdList.get(category)) {               // then we run for each item from our GroceryItem class with list name and get(category) method, to return print the category with it items.
            System.out.println("- " + item);  //  toString()
        }
    }

    // Task 4

    public void addItemWithCategoryAndQuantity(String item, double cost, String category, int quantity) {
        GroceryItem myGroceryItem = new GroceryItem(item, cost, quantity);

        thirdList.putIfAbsent(category, new ArrayList<>()); // this line works as "Fruits" => [] which means if there's no category called "Fruits", put it and add new ArrayList [].

        thirdList.get(category).add(myGroceryItem);         // this line says: bring the empty ArrayList "Fruits" => [] and add the by Class Grocery(item, cost)  into the ArrayList "Fruits" => [Apples - 5.0€ - 7 kpl].
    }

    public void updateQuantity(String itemName, int newQuantity) {

        for (String category : thirdList.keySet()) {             // Loop through all categories in the thirdList

            for (GroceryItem item : thirdList.get(category)) {   // Loop through all items in the current category

                if (item.getName().equalsIgnoreCase(itemName)) { // Check if the item's name matches the one we want to update

                    item.setQuantity(newQuantity);               // Update the quantity of the found item
                    System.out.println("\nQuantity updated for item: " + itemName);
                    return; // Stop the method once updated
                }
            }
        }
        // If item not found in any category
        System.out.println("\nItem not found: " + itemName);
    }





    public void displayAvailableItems(String category) {
        if (!thirdList.containsKey(category)) {                          // in this line we have if statement, if we don't find items the in the list of category name for example "Fruits" we print: "Fruits" => [an empty list]
             System.out.println("no items found in the: " +  category);  // here we print
             return;
        }

        System.out.println("items found in the " + category + ":");   // print the category (name if found):
        for (GroceryItem item : thirdList.get(category)) {               // then we run for each item from our GroceryItem class with list name and get(category) method, to return print the category with it items.
            if (item.getQuantity() > 0) {
                System.out.println("- " + item.toDetailedString());  //  toString() with second method toDetailedString() to print the

            }
        }
    }

    // Task 5

    public void calculateTotalCostQuantityIncluded() {
        double multiply;                // will store cost * quantity for each item
        double totalCost = 0;         // will store the final total cost of all items

        for (String category : thirdList.keySet()) { // keySet() to bring the Category names like "Fruits", "Dairy", "Bakery".
            for (GroceryItem item : thirdList.get(category)) {

                // Multiply the item's price by its quantity and add it to the running total
                // For example: if item price = 2.0 and quantity = 3
                // →            2.0 * 3 = 6.0
                // → totalCost(0) + 6.0 = totalCost(0)
                multiply = item.getCost() * item.getQuantity(); // ← Cost * Quantity = Multiplied
                totalCost = totalCost + multiply;               // ← 0 + Multiplied = Multiplied (to store the value).
            }
        }

        System.out.println("Total cost with quantities: " + totalCost + "€\n");
    }

}






