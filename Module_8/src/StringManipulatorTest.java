import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringManipulatorTest {

    @Test
    void concatenateTest() {
        StringManipulator sm = new StringManipulator();
        String result = sm.concatenate("Hello, ", "World!");
        Assertions.assertEquals("Hello, World!", result);

    }

    @Test
    void canConcatenateStrings() {
        StringManipulator sm = new StringManipulator();
        int result = sm.findLength("Hello");
        Assertions.assertEquals(5, result);

    }

    @Test
    void convertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        String result = sm.convertToUpperCase("hello");
        Assertions.assertEquals("HELLO", result);
    }

    @Test
    void convertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        String result = sm.convertToLowerCase("HELLO");
        Assertions.assertEquals("hello", result);
    }

    @Test
    void containsSubstring() {
        StringManipulator sm = new StringManipulator();
        boolean result = sm.containsSubstring("Hello, World!", "World");
        Assertions.assertTrue(result);
    }
}
