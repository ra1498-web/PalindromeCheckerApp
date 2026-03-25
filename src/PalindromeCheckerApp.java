import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Array Two-Pointer Approach
    public static boolean arrayPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack Approach
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop())
                return false;
        }
        return true;
    }

    // Method 3: Deque Approach
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Array method timing
        long start1 = System.nanoTime();
        boolean r1 = arrayPalindrome(input);
        long end1 = System.nanoTime();

        // Stack method timing
        long start2 = System.nanoTime();
        boolean r2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        // Deque method timing
        long start3 = System.nanoTime();
        boolean r3 = dequePalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Array Method: " + r1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method: " + r2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Method: " + r3 + " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}