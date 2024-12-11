package E02_BankingApp;

public class Bank {
    // Attributes
    private ArrayListADT<Customer> customerList;

    // Constructor
    public Bank() {
        this.customerList = new ArrayListADT<Customer>();

        System.out.println("A bank has been initialized.");
    }

    // Methods
    public void addNewCustomer(Customer newCustomer){
        customerList.add(newCustomer);
        System.out.println(newCustomer.getName() + " has been added to the bank.");
    }

    public void getAllCustomers(){
        for (int i = 0; i < customerList.size(); i++) {
            Customer customer = customerList.get(i);
            System.out.println(customer.getCustomerDetail());
        }
    }
}

class BankRunner{
    public static void main ( String[] args ) {
        Bank bank = new Bank();
        bank.addNewCustomer( new Customer("C001", "John Doe", 123456, 1000.00) );
        bank.addNewCustomer( new Customer("C002", "Jane Doe", 123457, 100.00) );
        bank.addNewCustomer( new Customer("C003", "David Doe", 123458, 300.00) );

        bank.getAllCustomers();
    }
}
