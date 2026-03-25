import java.util.Scanner;

// Palindrome service class (Encapsulation)
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String str) {

        str = str.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        sc.close();
    }
}