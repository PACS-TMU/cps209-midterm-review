//Question 1b: Create a program that checks if a given string is a valid hexadecimal number.
// A valid hexadecimal number can contain digits from 0-9 and letters from A-F (case-insensitive).
public class Q1b {
    public static boolean isValidHexadecimal(String input) {
        // TODO: Implement this method
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c) && (c < 'A' || c > 'F') && (c < 'a' || c > 'f')) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValidHexadecimal("A1B2C3")); // true
        System.out.println(isValidHexadecimal("a1b2c3")); // true
        System.out.println(isValidHexadecimal("1234567890ABCDEF")); // true
        System.out.println(isValidHexadecimal("GHIJKLMNOP")); // false
        System.out.println(isValidHexadecimal("1234567890abcdefg")); // false
        System.out.println(isValidHexadecimal("NotAHexNumber")); // false
    }
}