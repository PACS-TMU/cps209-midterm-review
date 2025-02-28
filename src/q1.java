/*
 * Question 1:
 * Given an array of integers, return the second largest element in the array.
 * If the array has less than 2 elements, return -1.
 * 
 * Only implement the `findSecondLargest` function. Do not change the signature of the function.
 * Do not edit any other code.
 * 
 * There are hints below to help you if you get stuck. Only read them if you need to.
 */
public class q1 {
    public static void main(String[] args) {
        int[] input1 = new int[]{1,2,3,4,5};
        int[] input2 = new int[]{3, 2, 18, 10, 7, 19, 20, 9, 14, 6};
        int[] input3 = new int[]{62, 178, 146, 126, 213, 25, 145, 84, 32, 101, 57, 133, 124, 140, 40};
        int[] input4 = new int[]{25};
        int[] input5 = new int[]{};
        int[] input6 = new int[]{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        int[] input7 = new int[]{35, 136, 84, 43, 46, 11, 94, 240, 239, 12, 212, 122, 147, 19, 188, 181, 191, 203, 77, 244, 148, 130, 113, 98, 189, 89, 60, 163, 243, 69, 72, 226, 234, 109, 222, 145, 220, 49, 166, 30, 106, 111, 97, 14, 28, 74, 50, 83, 112, 219, 158, 79, 198, 71, 155, 68, 47, 204, 218, 101, 99, 143, 249, 48, 205, 1, 102, 45, 15, 202, 87, 223, 182, 184, 54, 138, 221, 165, 27, 82, 199, 146, 58, 248, 63, 26, 66, 183, 4, 154, 6, 161, 178, 185, 64, 132, 55, 190, 121, 56, 247, 149, 37, 128, 238, 110, 141, 245, 227, 134, 123, 216, 171, 187, 80, 160, 88, 62, 103, 235, 20, 29, 215, 197, 192, 186, 96, 172, 51, 65, 129, 95, 33, 18, 159, 209, 150, 21, 38, 36, 157, 153, 104, 200, 57, 108, 92, 42, 8, 142, 124, 156, 177, 228, 22, 17, 13, 242, 208, 126, 176, 5, 195, 151, 225, 52, 31, 164, 115, 93, 81, 119, 40, 246, 169, 231, 139, 144, 118, 206, 201, 162, 105, 131, 91, 237, 173, 167, 114, 34, 32, 25, 217, 78, 213, 180, 179, 135, 229, 133};

        int r1 = findSecondLargest(input1);
        int r2 = findSecondLargest(input2);
        int r3 = findSecondLargest(input3);
        int r4 = findSecondLargest(input4);
        int r5 = findSecondLargest(input5);
        int r6 = findSecondLargest(input6);
        int r7 = findSecondLargest(input7);

        // Test cases
        System.out.println("Testing `findSecondLargest` function:");
        System.out.println("--------------------------------------\n");
        
        // Test 1
        System.out.println("Test 1:");
        System.out.println("Expected: 4");
        System.out.println("Returned: " + r1);
        if (r1 == 4) {
            System.out.println("Test 1 passed\n\n");
        } else {
            System.out.println("Test failed\n\n");
        }

        // Test 2
        System.out.println("Test 2:");
        System.out.println("Expected: 19");
        System.out.println("Returned: " + r2);
        if (r2 == 19) {
            System.out.println("Test 2 passed\n\n");
        } else {
            System.out.println("Test failed\n\n");
        }

        // Test 3
        System.out.println("Test 3:");
        System.out.println("Expected: 178");
        System.out.println("Returned: " + r3);
        if (r3 == 178) {
            System.out.println("Test 3 passed\n\n");
        } else {
            System.out.println("Test failed\n\n");
        }

        // Test 4
        System.out.println("Test 4:");
        System.out.println("Expected: -1");
        System.out.println("Returned: " + r4);
        if (r4 == -1) {
            System.out.println("Test 4 passed\n\n");
        } else {
            System.out.println("Test failed\n\n");
        }

        // Test 5
        System.out.println("Test 5:");
        System.out.println("Expected: -1");
        System.out.println("Returned: " + r5);
        if (r5 == -1) {
            System.out.println("Test 5 passed\n\n");
        } else {
            System.out.println("Test failed\n\n");
        }

        // Test 6
        System.out.println("Test 6:");
        System.out.println("Expected: 5");
        System.out.println("Returned: " + r6);
        if (r6 == 5) {
            System.out.println("Test 6 passed\n\n");
        } else {
            System.out.println("Test failed\n\n");
        }

        // Test 7
        System.out.println("Test 7:");
        System.out.println("Expected: 248");
        System.out.println("Returned: " + r7);
        if (r7 == 248) {
            System.out.println("Test 7 passed\n\n");
        } else {
            System.out.println("Test failed\n\n");
        }
    }

    public static int findSecondLargest(int[] arr) {
        /*
         * Given an array of integers, return the second largest element in the array.
         * If the array has less than 2 elements, return -1.
         */
        // Write your code below
        return 0;
    }

    /*
     * Hints - Only read these if you are stuck!!
     * 
     * Hint 1: One options is that you can sort the array in ascending order to find the 
     * second largest element.
     * 
     * Hint 2: Another options is that you can also keep track of the largest and 
     * second largest elements as you iterate through the array (single loop, no sorting).
     * 
     * Hint 3: Make sure to handle the case where the array has less than 2 elements.
     */
}
