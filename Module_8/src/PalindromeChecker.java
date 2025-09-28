


public class PalindromeChecker {
    public boolean isPalindrome(String str) {

        // Second: Method to clean up the text: remove non-alphanumeric characters and convert to lower case remove spaces
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // First: main method to check if a string is a palindrome
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare cleaned string with its reversed version and return the result.
        return cleaned.equals(reversed);
    }
}
