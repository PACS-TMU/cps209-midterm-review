//Question 2b: Create a program that checks if a given number is a prime number.
// A prime number is a natural number greater than 1 that has no positive
// divisors other than 1 and itself.
public class Q2b {
    public static boolean isPrime(int n) {
        // TODO: Implement this method
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2)); // true
        System.out.println(isPrime(3)); // true
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(4)); // false
        System.out.println(isPrime(9)); // false
        System.out.println(isPrime(1)); // false
    }
}