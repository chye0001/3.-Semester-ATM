package account;

import customer.ICustomer;

public interface IAccount {
    public double getBalance();
    public boolean withhdraw(double amount);
    public void setBalance(double balance);


}
