import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ==========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ==========================================================
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */
public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        String testString = "racecar"; // Example input
        System.out.println("Is \"" + testString + "\" a palindrome? " + isPalindrome(testString));
    }

    /**
     * Validates if a string is a palindrome using a Deque.
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        // Normalize string: remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into the deque
        for (char c : cleanedInput.toCharArray()) {
            deque.addLast(c);
        }

        // Compare characters from both ends
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false; // Not a palindrome
            }
        }

        return true; // Is a palindrome
    }
}