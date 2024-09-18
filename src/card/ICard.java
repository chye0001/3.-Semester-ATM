package card;


import account.IAccount;

public interface ICard {
    String getCardNumber();
    String getPin();
    IAccount getAccount();
}