package account;

import customer.ICustomer;

public interface IAccount {
    public double getBalance();
    public boolean withhdraw();
    ICustomer showCustomer();


}
