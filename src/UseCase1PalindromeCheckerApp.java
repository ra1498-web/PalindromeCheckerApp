
    public class UseCase1PalindromeCheckerApp {

        public static void main(String[] args) {

            // Hardcoded string
            String text = "madam";

            // Reverse the string
            String reversed = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed = reversed + text.charAt(i);
            }

            // Check palindrome condition
            boolean isPalindrome = text.equals(reversed);

            // Display output
            System.out.println("Input text: " + text);
            System.out.println("Is it a Palindrome? : " + isPalindrome);
        }
    }

