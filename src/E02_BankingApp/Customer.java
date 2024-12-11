package E02_BankingApp;

public class Customer {
    // Attributes
    private String id;
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor
    public Customer(String id, String name, int accountNumber, double balance) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods
    public String getName(){
        return this.name;
    }

    public String getCustomerDetail(){
        return "[ID: " + this.id + ", Name: " + this.name
                + ", Account Number: " + this.accountNumber + ", Balance: " + this.balance + "]";
    }

    public void deposit(double amount){
        // validate amount
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be a positive value");
        }

        this.balance += amount;
        System.out.println(this.name + "'s balance after deposit: " + this.balance);
    }

    public void withdraw(double amount){
        // validate amount
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be a positive value");
        }

        // validate balance
        if (amount > this.balance) {
            throw new IllegalArgumentException("Amount must be less than balance");
        }

        this.balance -= amount;
        System.out.println(name + "'s balance after withdraw: " + this.balance);
    }

    @Override
    public String toString(){
        return this.name;
    }

}

class CustomerRunner{
    public static void main ( String[] args ) {
        Customer customer = new Customer("C001", "John Doe", 123456, 1000.00);
        System.out.println(customer.getCustomerDetail());

        customer.deposit( 500.00 );
        System.out.println(customer.getCustomerDetail());

        customer.withdraw( 200.00 );
        System.out.println(customer.getCustomerDetail());

        //customer.deposit( -100 );
        //customer.withdraw( 2000 );
    }
}
