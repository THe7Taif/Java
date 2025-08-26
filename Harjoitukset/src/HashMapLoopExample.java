import java.util.Map;
import java.util.HashMap;

public class HashMapLoopExample {
    public static void main(String[] args) {
        // 1. نسوي HashMap
        Map<String, Integer> scores = new HashMap<>();

        // 2. نضيف عناصر
        scores.put("Ali", 90);
        scores.put("Ahmed", 85);
        scores.put("Sara", 100);

        // 3. نطبع كل مفتاح وقيمته باستخدام loop
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
