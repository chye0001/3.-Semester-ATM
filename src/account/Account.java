package account;

import card.Card;
import customer.Customer;

public class Account implements IAccount {
    private Customer customer;
    private double balance;
    private Card card;

    public Account(Customer customer, double balance, Card card) {
        this.customer = customer;
        this.balance = balance;
        this.card = card;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}




