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

        // Call the meow method on the cat instance
        cat.meow();
    }
}