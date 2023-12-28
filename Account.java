public class Account {
    private Customer customer;
    private int accountId;
    private double balance;

    public Account(Customer customer, int accountId, double balance) {
        this.customer = customer;
        this.accountId = accountId;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayInfo() {
        System.out.println("Account ID: " + accountId);
        customer.displayInfo();
        System.out.println("Balance: $" + balance);
    }
}
