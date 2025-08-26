public class Grocery {
    public static void main(String[] args) {

        // Task 1:
        GroceryListManager list = new GroceryListManager(); // adding out listName var
        list.addItem("Apples"); // our Category: Add a few items to the grocery list.
        list.addItem("Milk");
        list.addItem("Bread");

        System.out.println("Grocery List:"); // printing the grocery list name
        list.displayList();                 // then Display our grocery category list.


        System.out.println("\nIs \"Milk\" in the grocery list? " + list.checkItem("Milk"));  // printing if a specific item is present in the grocery list. true or false

        list.removeItem("Milk");           // Chacking with removeItem() func if Milk exist

        System.out.println("\nUpdated Grocery List:"); // printing the grocery list name
        list.displayList();                // Again Display our grocery category list.



        // Task 2:
        list.addItemWithPrice("Apples", 5.0); // our Category: Add a few items to the MapHash grocery list.
        list.addItemWithPrice("Milk", 1.0);
        list.addItemWithPrice("Bread", 2.9);


        list.calculateTotalCost();              // calling for calculate items method tp be printed

        // Task 3
        list.addItemWithCategory("Apples", 5.0, "Fruits"); // our Category: Add a few items to the new MapHash grocery list.
        list.addItemWithCategory("Milk", 1.0, "Dairy");
        list.addItemWithCategory("Bread", 2.9, "Bakery");

        System.out.println("\nUpdated Grocery List:"); // Printing the grocery list name
        list.displayByCategory("Fruits");                // Again Display our grocery category list.
        list.displayByCategory("Dairy");
        list.displayByCategory("Bakery");

        // Task 4



        list.addItemWithCategoryAndQuantity("Apples", 5.0, "Fruits", 2); // our Category: Add a few items to the new MapHash grocery list.
        list.addItemWithCategoryAndQuantity("Milk", 1.0, "Dairy", 5);
        list.addItemWithCategoryAndQuantity("Bread", 2.9, "Bakery", 9);

        list.updateQuantity("Banana", 10);

        System.out.println("\nUpdated Grocery List:"); // Printing the grocery list name
        list.displayAvailableItems("Fruits");                // Again Display our grocery category list.
        list.displayAvailableItems("Dairy");
        list.displayAvailableItems("Bakery");
    }
}
