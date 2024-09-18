package card;

public class Card implements ICard {
    private String cardNumber;
    private String pin;
    private IAccount account;

    public Card(String cardNumber, String pin, IAccount account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getPin() {
        return pin;
    }

    @Override
    public IAccount getAccount() {
        return account;
    }
}