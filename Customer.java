public class Customer {
    private String name;
    private int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void displayInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
    }
}
