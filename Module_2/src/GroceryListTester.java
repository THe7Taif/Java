
// Task 5:

public class GroceryListTester {
    public static void main(String[] args) {

        GroceryListManager tester = new GroceryListManager();

        // Add items with price, category, and quantity:
        tester.addItemWithCategoryAndQuantity("Apple", 0.5, "Fruites", 5);
        tester.addItemWithCategoryAndQuantity("Milk Shake", 1.0, "Dairy", 5);
        tester.addItemWithCategoryAndQuantity("Banana", 2.9, "Fruits", 5);
        tester.addItemWithCategoryAndQuantity("Leipä", 1.0, "Dairy", 5);
        tester.addItemWithCategoryAndQuantity("Apple", 0.5, "Fruits", 5);
        tester.addItemWithCategoryAndQuantity("Banana", 0.3, "Fruits", 10);
        tester.addItemWithCategoryAndQuantity("Milk", 1.2, "Dairy", 2);
        tester.addItemWithCategoryAndQuantity("Cheese", 3.0, "Dairy", 7);
        tester.addItemWithCategoryAndQuantity("Chicken", 5.0, "Meat", 0); // out of stock


        // 1. Testing for Calculate total cost (quantity included):
        System.out.println("\nTotal Cost for all added items (quantity included):");
        tester.calculateTotalCostQuantityIncluded();


        //  2. Testing Categories of items
        System.out.println("\n--- Displaying by Category---\n");
        tester.displayByCategory("Fruits");                // Again Display our grocery category list.
        tester.displayByCategory("Dairy");

        // 3. Update quantity then Printing new values:
        System.out.println("\n--- Displaying by Quantity---");
        tester.updateQuantity("Banana", 15);
        tester.updateQuantity("Leipä", 110);


        // Testing printing new Quantity values:
        tester.displayAvailableItems("Fruits"); // this is for item: tester.updateQuantity("Banana", 15);
        tester.displayAvailableItems("Dairy"); // this is for item: tester.updateQuantity("Leipä", 110);







    }
}
