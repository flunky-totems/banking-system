public class Transaction {
    private Account account;
    private String type;
    private double amount;

    public Transaction(Account account, String type, double amount) {
        this.account = account;
        this.type = type;
        this.amount = amount;
    }

    public void execute() {
        if ("Deposit".equals(type)) {
            account.deposit(amount);
        } else if ("Withdrawal".equals(type)) {
            account.withdraw(amount);
        }
    }

    public void displayInfo() {
        System.out.println("Transaction Type: " + type);
        account.displayInfo();
        System.out.println("Amount: $" + amount);
    }
}
