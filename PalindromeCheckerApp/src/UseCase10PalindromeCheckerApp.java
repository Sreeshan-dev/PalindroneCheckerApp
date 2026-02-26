import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Call the recursive check method
        boolean result = check(s, 0, s.length() - 1);

        if (result) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }
    }

    private static boolean check(String s, int start, int end) {
        // Base Case 1: All characters matched
        if (start >= end) {
            return true;
        }

        // Base Case 2: Mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: Check inner characters
        return check(s, start + 1, end - 1);
    }
}