/*
Run the program. Then, based on your previous programming experience,
modify the main method so that two cat objects are created,
and the program behaves in the following way:
 */

public class Task_1_1_4 {
    private String name;

    public Task_1_1_4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Task_1_1_4 cat = new Task_1_1_4("Whiskers");
        Task_1_1_4 cat_2 = new Task_1_1_4("Rex");

        for (int i = 0; i < 1; i++) {
            cat.meow();
        }

        // Call the meow method on the cat instance
        cat.meow();
        cat_2.meow();
        cat.meow();
    }
}