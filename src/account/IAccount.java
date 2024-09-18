package account;

import customer.Customer;

public interface IAccount {

    double getBalance();
    void setBalance(double balance);
    Customer getCustomer();
}
