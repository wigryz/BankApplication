package databases;

import account.Account;
import person.Customer.Customer;
import person.Employee.Employee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;


public class CustomersDatabase {
    private static CustomersDatabase customersDatabase = null;
    private List<Customer> customers;

    public static CustomersDatabase getInstance() {
        if(customersDatabase == null)
            customersDatabase = new CustomersDatabase();
        return customersDatabase;
    }

    private CustomersDatabase() {
        customers = CustomersFromFileReader.readCustomersDataFromFile();
        Map<String, List<Account>> accounts = AccountsFromFileReader.readAccountsDataFromFile();
        for (Customer customer : customers) {
            customer.setAccounts(accounts.get(customer.getsID()));
        }
    };

    /**
     * probably this function have to be deleted, because it does not match encapsulation
     * why not just "getCustomer(Customer)" or "getCustomer(String ID)" ?
     * have to figure it out after implementing other components of system
     * //check EmployeesDataBase also
     *
     * @return Iterable<Customer> from Hashset<Customer> customers
     */
    public List<Customer> getCustomers() { return customers; }

    /**
     *
     * @param customer is a new customer sent with an intention in adding it to DB
     * @return boolean represents result of function:
     *     *true means customer is succesfully added
     *     *false means customer already exist in database
     */
    public boolean addCustomer(Customer customer) {
        return customers.add(customer);
    }
}
