/*
 * Question 5:
 * Create a program that calculates the sum of all elements in an array.
 * 
 * Implement a method `sumArray(int[] arr)` that:
 * - Returns `-1` if the array is empty.
 * - Returns the single element if the array has only one element.
 * - Returns `0` if the array has exactly two elements.
 * - Returns the sum of all elements otherwise.
 * 
 * Example Input:
 * int[] input1 = {};
 * int[] input2 = {10};
 * int[] input3 = {5, 15};
 * int[] input4 = {10, 20, 30, 40, 50};
 * int[] input5 = {7, 7, 7, 7};
 * int[] input6 = {-5, 10, 0, 20, -10};
 * 
 * Example Output:
 * -1
 * 10
 * 0
 * 90
 * 28
 * 15
 */

 public class q5 {
    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
            {},
            {10},
            {5, 15},
            {10, 20, 30, 40, 50},
            {7, 7, 7, 7},
            {-5, 10, 0, 20, -10}
        };

        int[] expectedResults = {-1, 10, 0, 150, 28, 15};

        System.out.println("\nTesting `sumArray` function:");
        System.out.println("-------------------------------\n");

        for (int i = 0; i < testCases.length; i++) {
            int result = sumArray(testCases[i]);
            System.out.println("Test " + (i + 1) + ":");
            System.out.print("Input: ");
            printArray(testCases[i]);
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

    public static int sumArray(int[] arr) {
        // TO DO: Implement the method to calculate the sum based on the given conditions
        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr.length == 2) {
            return 0;
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("}");
    }
}
