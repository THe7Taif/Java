import java.util.Map;
import java.util.HashMap;

/*
example in Hash Map Collections
 */


public class ExampleInHashMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 90);
        scores.put("Ahmed", 95);

        System.out.println(scores.get("Ali")); // يطبع درجة علي

        scores.put("Ahmed", 80); // يبدل درجة أحمد

        scores.remove("Ahmed"); // يحذف أحمد من القائمه

        System.out.println(scores.hashCode()); // يطبع القائمه النهائية
    }
}
