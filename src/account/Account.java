package account;

import card.Card;

public class Account implements IAccount {
    Customer customer;
    double balance;
    Card card;

    public Account(Customer customer, double balance, Card card) {
        this.customer = customer;
        this.balance = balance;
        this.card = card;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount>0 && amount<=getBalance()) {
            balance -=amount;
            return true;
            System.out.println("Du har hævet: " + amount);
        } else {
            return false;
            System.out.println("Beløbet du har valgt er ikke tilgængeligt");
        }
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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

}
