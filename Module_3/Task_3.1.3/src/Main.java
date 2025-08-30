import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0, "Black"));
        shapes.add(new Rectangle(4.0, 6.0, "Yellow"));
        shapes.add(new Triangle(3.0, 8.0, "White"));

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}