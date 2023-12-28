public class BankingSystem {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Alice", 1);

        // Create an account for the customer
        Account account = new Account(customer, 101, 1000.0);

        // Perform transactions
        Transaction depositTransaction = new Transaction(account, "Deposit", 500.0);
        depositTransaction.execute();

        Transaction withdrawalTransaction = new Transaction(account, "Withdrawal", 200.0);
        withdrawalTransaction.execute();

        // Display account information
        System.out.println("\nAccount Information:");
        account.displayInfo();

        // Display transaction information
        System.out.println("\nTransaction Information:");
        depositTransaction.displayInfo();
        withdrawalTransaction.displayInfo();
    }
}
