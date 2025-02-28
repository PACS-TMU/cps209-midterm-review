/*
 * Question 7:
 * Design a payment system where customers can pay for their orders using different payment methods.
 * 
 * Implement a `PaymentMethod` interface that includes:
 * - A method `processPayment(double amount)` to handle payment processing.
 * 
 * Implement a `CreditCard` class that:
 * - Implements `PaymentMethod`.
 * - Overrides `processPayment(double amount)` to print a message: "Processing credit card payment of $amount".
 * 
 * Implement a `PayPal` class that:
 * - Implements `PaymentMethod`.
 * - Overrides `processPayment(double amount)` to print a message: "Processing PayPal payment of $amount".
 * 
 * Implement a `PaymentProcessor` class that:
 * - Contains a method `processOrder(PaymentMethod paymentMethod, double amount)`.
 * - Calls `processPayment(amount)` on the given `paymentMethod`.
 * 
 * In the `main` method:
 * - Create `CreditCard` and `PayPal` objects.
 * - Use `PaymentMethod` references to hold these objects.
 * - Pass them to `processOrder()` to process payments.
 * 
 * Example Input:
 * CreditCard payment: $100
 * PayPal payment: $50
 * 
 * Example Output:
 * Processing credit card payment of $100
 * Processing PayPal payment of $50
 * 
 * Task:
 * Implement all the sections marked as "TO DO" in the code below.
 * DO NOT EDIT ANY OTHER PART OF THE CODE.
 */

// Interface PaymentMethod
interface PaymentMethod {
    void processPayment(double amount); // TO DO: Implement this method in subclasses
}

// Class CreditCard implementing PaymentMethod
class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // TO DO: Implement processing logic
    }
}

// Class PayPal implementing PaymentMethod
class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // TO DO: Implement processing logic
    }
}

// Class PaymentProcessor
class PaymentProcessor {
    public void processOrder(PaymentMethod paymentMethod, double amount) {
        // TO DO: Call processPayment on the given payment method
    }
}

// Main class
public class q7 {
    public static void main(String[] args) {
        // TO DO: Create instances of CreditCard and PayPal
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        // TO DO: Create an instance of PaymentProcessor
        PaymentProcessor processor = new PaymentProcessor();

        System.out.println("Testing `processOrder` function:");
        System.out.println("--------------------------------------\n");

        System.out.println("Test 1:");
        System.out.println("Expected: Processing credit card payment of $100");
        processor.processOrder(creditCard, 100); // TO DO: Ensure this method works correctly
        System.out.println();

        System.out.println("Test 2:");
        System.out.println("Expected: Processing PayPal payment of $50");
        processor.processOrder(payPal, 50); // TO DO: Ensure this method works correctly
        System.out.println();
    }
}