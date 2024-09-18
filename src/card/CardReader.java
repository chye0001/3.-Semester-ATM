package card;

import account.Account;
import customer.Customer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


import static javax.swing.UIManager.put;

public class CardReader implements ICardReader {
    private final Map<String, ICard> validCards = new HashMap<String, ICard>()
    {{
        put("1234567890123456", new Card("1234567890123456","1234", new Account(new Customer("John","Ib","Knudsen"), 1000)));
        put("0000111122223333", new Card("0000111122223333","2233", new Account(new Customer("Mikkel","","Hansen"), 2000)));
    }};

    public ICard validateCard(String cardNumber) {
        if (cardNumber!= null && validCards.containsKey(cardNumber)) {
            return validCards.get(cardNumber);
        }
        return null;
    }
}
