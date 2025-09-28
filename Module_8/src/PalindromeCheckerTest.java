import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    private PalindromeChecker checker;

    @BeforeEach
    void setUp() {
        checker = new PalindromeChecker();
    }

    @Test
    void testSimplePalindromes() {
        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("level"));
    }

    @Test
    void testSentencePalindromes() {
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(checker.isPalindrome("No lemon, no melon"));
    }

    @Test
    void testNonPalindromes() {
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
    }

    @Test
    void testEdgeCases() {
        assertTrue(checker.isPalindrome(""));            // empty -> true
        assertTrue(checker.isPalindrome("a"));           // single char -> true
        assertTrue(checker.isPalindrome("12321"));       // numeric palindrome
        assertTrue(checker.isPalindrome("   "));         // spaces only -> cleaned -> ""
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "radar",
            "level",
            "A man, a plan, a canal, Panama",
            "No lemon, no melon",
            "12321",
            ""      // empty
    })
    void parameterizedPalindromes(String candidate) {
        assertTrue(checker.isPalindrome(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "hello",
            "openai",
            "abcd",
            "12345"
    })
    void parameterizedNonPalindromes(String candidate) {
        assertFalse(checker.isPalindrome(candidate));
    }
}
