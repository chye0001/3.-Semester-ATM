package com.atm.account;

public class Account implements IAccount {
    Customer customer;
    Card card;
    double balance;


    @Override
    public void displayBalance() {
        if ()
    }



    public Account(Customer customer, Card card, double balance) {
        this.customer = customer;
        this.card = card;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
