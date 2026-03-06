/**
 * ================================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */

import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Palindrome strategy
        PalindromeStrategy strategy = new SimplePalindromeStrategy();

        // Start time
        long startTime = System.nanoTime();

        boolean result = strategy.checkPalindrome(input);

        // End time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

/**
 * Simple palindrome implementation
 */
class SimplePalindromeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}