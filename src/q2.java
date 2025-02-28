/*
 * Question 2:
 * Implement a `BankAccount` class that has the following features:
 * - Private instance variables: `accountNumber`, `accountHolder`, and `balance`.
 * - A constructor to initialize these variables with appropriate values.
 * - Getter and setter methods for `accountNumber`, `accountHolder`, and `balance`.
 * - A method to deposit funds into the account.
 * - A method to withdraw funds from the account.
 * - A method to display account details.
 *
 * The deposit method should increase the balance when the deposit amount is positive.
 * The withdrawal method should decrease the balance only if there are enough funds in the account.
 * If a withdrawal is attempted that exceeds the balance, print an "Insufficient funds" message.
 * If the deposit or withdrawal amount is negative, print an error message.
 *
 * The `balance` should not be allowed to go below 0.
 * If the initial balance is negative, it should be set to 0.
 *
 * Only implement the `BankAccount` class and its methods. Do not change the signature of any methods.
 * Do not edit any other code.
 *
 * There are hints below to help you if you get stuck. Only read them if you need to.
 * 
 * Task:
 * Fill in the missing parts below the comment `TO DO`.
 * DO NOT EDIT ANY OTHER CODE.
 */
public class q2 {
    public static void main(String[] args) {
        // Test case 1: Create a new bank account and display details
        BankAccount account1 = new BankAccount("12345", "John Doe", 500.0);
        account1.displayAccountDetails();
        
        // Test case 2: Deposit money into account
        account1.deposit(200.0);
        account1.displayAccountDetails();
        
        // Test case 3: Withdraw money from account
        account1.withdraw(100.0);
        account1.displayAccountDetails();
        
        // Test case 4: Attempt to withdraw more than balance
        account1.withdraw(1000.0);
        
        // Test case 5: Attempt to deposit a negative amount
        account1.deposit(-50.0);
        
        // Test case 6: Create a bank account with a negative initial balance
        BankAccount account2 = new BankAccount("67890", "Jane Smith", -100.0);
        account2.displayAccountDetails();
        
        // Test case 7: Create an account with a zero balance
        BankAccount account3 = new BankAccount("11223", "Alice Johnson", 0.0);
        account3.displayAccountDetails();
    }
}

class BankAccount {
    // Private instance variables
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        // TO DO: Initialize accountNumber and accountHolder
        // TO DO: Ensure initialBalance is >= 0, otherwise set it to 0
    }

    // Getter and Setter methods for accountNumber
    public String getAccountNumber() {
        // TO DO: Implement the method
        return "";
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter methods for accountHolder
    public String getAccountHolder() {
        // TO DO: Implement the method
        return "";
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter and Setter methods for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        // TO DO: Implement the method to ensure balance is >= 0
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        // TO DO: Implement the method to deposit money if amount > 0
        // TO DO: Print an error if the amount is <= 0
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        // TO DO: Implement the method to withdraw money if amount <= balance
        // TO DO: Print an error if the amount exceeds balance or is <= 0
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    /*
     * Hints:
     * 1. The BankAccount class should have private instance variables for accountNumber, accountHolder, and balance.
     * 2. The constructor should accept an accountNumber, accountHolder, and an initialBalance.
     * 3. If the initialBalance is negative, set it to 0.
     * 4. Implement setter and getter methods for each instance variable.
     * 5. Implement deposit and withdraw methods.
     * 6. Make sure withdrawal does not exceed balance, and handle negative deposit or withdrawal amounts.
     * 7. Implement the displayAccountDetails method to show the account details.
     */
}

