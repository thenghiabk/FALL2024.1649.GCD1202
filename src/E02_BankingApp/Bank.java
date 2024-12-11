package E02_BankingApp;

public class Bank {
    // Attributes
    private ArrayListADT<Customer> customerList;
    private QueueADT<Customer> customerQueue;
    private StackADT<String> transactionHistory;

    // Constructor
    public Bank() {
        this.customerList = new ArrayListADT<Customer>();
        this.customerQueue = new QueueADT<Customer>();
        this.transactionHistory = new StackADT<String>();

        System.out.println("A bank has been initialized.");
    }

    // Methods
    public void addCustomerToQueue(Customer customer){
        customerQueue.offer( customer );
        System.out.println("Customer " + customer.getName() + " has been added to the queue.");
    }

    public void addNewCustomer(Customer newCustomer){
        customerList.add(newCustomer);
        transactionHistory.push( newCustomer.getName() + " has been added to the bank.");
        System.out.println(newCustomer.getName() + " has been added to the bank.");
    }

    public void getAllCustomers(){
        for (int i = 0; i < customerList.size(); i++) {
            Customer customer = customerList.get(i);
            System.out.println(customer.getCustomerDetail());
        }
    }

    public void getAllCustomersInQueue () {
        System.out.println(customerQueue);
    }

    public void getTransactionHistory () {
        System.out.println(transactionHistory);
    }
}

class BankRunner{
    public static void main ( String[] args ) {
        Bank bank = new Bank();
        bank.addNewCustomer( new Customer("C001", "John", 123456, 1000.00) );
        bank.addNewCustomer( new Customer("C002", "Jane", 123457, 100.00) );
        bank.addNewCustomer( new Customer("C003", "David", 123458, 300.00) );

        bank.getAllCustomers();

        bank.addCustomerToQueue( new Customer("C004", "Ben", 123459, 1000.00) );
        bank.addCustomerToQueue( new Customer("C005", "Lucy", 123459, 1000.00) );
        bank.addCustomerToQueue( new Customer("C006", "Lily", 123459, 1000.00) );

        bank.getAllCustomersInQueue();

        bank.getTransactionHistory();
    }
}
