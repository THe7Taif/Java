public class BankAccount {
    // instance variable (belongs to each object separately)
    private double balance;

    // instance variable (unique account number for each account)
    private int accountNumber;

    // static variable (shared among all objects)
    // used to generate unique account numbers
    private static int nextAccountNumber = 1;

    // static variable (shared among all objects)
    // keeps track of total number of accounts created
    private static int totalAccounts  = 0;

    // constructor - runs when we create a new BankAccount object
    public BankAccount(double balance) {
        this.balance = balance;                 // set initial balance
        this.accountNumber = nextAccountNumber; // assign current available number
        nextAccountNumber++;                    // increment for the next account
        totalAccounts++;                        // increase total accounts counter
    }

    // getter method - returns the balance of this account
    public double getBalance() {
        return balance;
    }

    // getter method - returns this account's unique number
    public int getAccountNumber() {
        return accountNumber;
    }

    // static method - returns how many accounts exist (shared info)
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // deposit method - adds money to this account
    public void deposit(int amount) {
        balance += amount;
    }

    // withdraw method - tries to remove money from the account
    public boolean withdraw(int amount) {
        if (amount <= balance) {          // check if enough money
            balance -= amount;            // subtract money
            return true;                  // success
        } else {
            System.out.println("Insufficient balance"); // not enough money
            return false;                 // failed
        }
    }

    // main method - test the class
    public static void main(String[] args) {
        // create 2 accounts
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        // deposit and withdraw money
        account1.deposit(500);   // add 500 to account1
        account2.withdraw(800);  // subtract 800 from account2

        // print account balances
        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        // print total number of accounts created
        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}









