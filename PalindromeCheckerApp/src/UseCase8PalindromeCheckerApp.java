import java.util.LinkedList;
public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        String testString = "Racecar";
        System.out.println("Is \"" + testString + "\" a palindrome? " + isPalindrome(testString));
    }
    // ... insert isPalindrome method here ...
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : cleaned.toCharArray()) {
            list.add(c);
        }
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                return false;
            }
        }
        return true;
    }
}