//Question 2a: Create a program that checks if a given string is a palindrome.
// A palindrome is a word, phrase, number, or other sequence of characters that reads the
// same forward and backward (given that there are no spaces or punctuations).
public class Q2a {
    public static boolean isPalindrome(String input) {
        // TODO: Implement this method
        String str = input.toLowerCase();
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return str.equals(reversedStr);
    }
    public static void main(String[] args) {
        // Test the isPalindrome method
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("asdfdsa")); // true
        System.out.println(isPalindrome("12321")); // true
        System.out.println(isPalindrome("12345")); // false
    }
}