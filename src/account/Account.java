package account;

import card.Card;
import customer.Customer;
import customer.ICustomer;

public class Account implements IAccount {
    ICustomer customer;
    double balance;

    public Account(ICustomer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean withhdraw(double amount) {
            if(amount>0 && amount<=getBalance()) {
                balance -=amount;
                System.out.println("Du har hævet: " + amount);
                return true;

            } else {
                System.out.println("Beløbet du har valgt er ikke tilgængeligt");
                return false;

            }
        }

    public ICustomer getCustomer() {
        return customer;
    }

    public void setCustomer(ICustomer customer) {
        this.customer = customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}




