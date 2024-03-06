//Question 3a: Create a program that calculates the sum of all elements in an array
// excluding the smallest and largest elements.
// Edge cases:
// 1. If the array is empty, return -1.
// 2. If the array has only one element, return that element.
// 3. If the array has two elements, return 0 as both elements will be excluded.
public class Q3a {
    public static int calculateSum(int[] input) {
        // TODO: Implement this method
        if (input.length == 0) {
            return -1;
        } else if (input.length == 1) {
            return input[0];
        } else if (input.length == 2) {
            return 0;
        } else {
            int max = input[0];
            int min = input[0];
            int sum = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] > max) {
                    max = input[i];
                }
                if (input[i] < min) {
                    min = input[i];
                }
                sum += input[i];
            }
            return sum - max - min;
        }
    }
}