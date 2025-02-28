/*
 * Question 4:
 * Create a program that checks if a given string is a palindrome.
 * 
 * A palindrome is a word, phrase, number, or other sequence of characters 
 * that reads the same forward and backward (ignoring spaces and punctuation).
 * 
 * Implement a method `isPalindrome(String str)` that:
 * - Returns `true` if `str` is a palindrome.
 * - Returns `false` otherwise.
 * 
 * Example Input:
 * System.out.println(isPalindrome("racecar")); // true
 * System.out.println(isPalindrome("hello")); // false
 * System.out.println(isPalindrome("asdfdsa")); // true
 * System.out.println(isPalindrome("12321")); // true
 * System.out.println(isPalindrome("12345")); // false
 * 
 * Example Output:
 * true
 * false
 * true
 * true
 * false
 */

 public class q4 {
    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"racecar", "hello", "asdfdsa", "12321", "12345", "", "i"};
        boolean[] expectedResults = {true, false, true, true, false, true, true};

        System.out.println("\nTesting `isPalindrome` function:");
        System.out.println("------------------------------------\n");

        for (int i = 0; i < testCases.length; i++) {
            boolean result = isPalindrome(testCases[i]);
            System.out.println("Test " + (i + 1) + ":");
            System.out.println("Input: " + testCases[i]);
            System.out.println("Expected: " + expectedResults[i]);
            System.out.println("Result: " + result);
            System.out.println();

            if (result == expectedResults[i]) {
                System.out.println("Test " + (i + 1) + " passed\n\n");
            } else {
                System.out.println("Test " + (i + 1) + " failed\n\n");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        // TO DO: Implement the method to check if `str` is a palindrome below
        if (str == null || str.length() <= 1) {
            return true;
        }
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
