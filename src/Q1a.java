//Question 1a: Create a program that converts a string of words separated by underscores
// into a camel case string. For example, "hello_world" would be converted to "HelloWorld".
public class Q1a {
    public static String convertToCamelCase(String input) {
        // TODO: Implement this method
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '_') {
                input = input.substring(0, 1).toUpperCase() + input.substring(1, i) + input.substring(i + 1, i + 2).toUpperCase() + input.substring(i + 2);
            }
        }
        return input;
    }
    public static void main(String[] args) {
        System.out.println(convertToCamelCase("hello_world")); // HelloWorld
        System.out.println(convertToCamelCase("java_programming")); // JavaProgramming
        System.out.println(convertToCamelCase("gitHub_copilot")); // GitHubCopilot
        System.out.println(convertToCamelCase("test_string")); // TestString
        System.out.println(convertToCamelCase("camel_case")); // CamelCase
    }
}