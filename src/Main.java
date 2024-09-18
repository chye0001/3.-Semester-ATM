import account.Account;
import account.IAccount;
import card.Card;
import card.ICard;
import card.ICardReader;
import customer.Customer;
import dispenser.CashDispenser;
import dispenser.ICashDispenser;
import security.ISecuritySystem;
import security.SecuritySystem;
import transaction.ITransactionProcessor;
import transaction.TransactionProcessor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ITransactionProcessor transactionProcessor = new TransactionProcessor();
        ISecuritySystem securitySystem = new SecuritySystem();
        ICashDispenser cashDispenser = new CashDispenser();
        ICardReader cardReader = new CardReader();

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                **********************
                **** ATM TERMINAL ****
                **********************
                """);

        String cardNumber = "";
        while (!cardNumber.equalsIgnoreCase("q")) {

            System.out.println("Please input card number: (q = quit)");

            cardNumber = scanner.nextLine();
            if (cardNumber.equalsIgnoreCase("q")) {
                break;
            }

            while (!cardReader.validateCard(cardNumber)) {
                System.out.println("invalid card number!");
                cardNumber = scanner.nextLine();
            };
            ICard card = cardReader.validateCard(cardNumber);

            System.out.println("Please input pin code:");
            String pinCode = scanner.nextLine();

            if (securitySystem.authenticate(card.getPin(), pinCode)) {
                Customer customer = card.getAccount().getCustomer();
                System.out.println("Hi " + customer.getFullName());
                System.out.println("Please input amount to withdraw:");
                double amount = scanner.nextDouble();

                boolean success = transactionProcessor.doTransaction(amount, card.getAccount());
                if (!success) {
                    System.out.println("Insufficient funds :-(");

                } else
                    cashDispenser.dispenseCash(amount);
                

            } else {
                System.out.println("Invalid pin code :-(");
            }
        }
    }
}
