import account.Account;
import account.IAccount;
import card.Card;
import card.ICard;
import card.ICardReader;
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
        String cardNumber = "";
        String pin = "";
        System.out.println("""
                **********************
                **** ATM TERMINAL ****
                **********************
                """);
        while (!cardNumber.equalsIgnoreCase("q")) {

            System.out.println("Please input card number: (q = quit)");

            cardNumber = scanner.nextLine();
            while (!cardReader.validateCard(cardNumber)) {
                System.out.println("invalid cardnumber!");
                cardNumber = scanner.nextLine();
            };
            Card card = cardReader.validateCard(cardNumber);

            System.out.println("Please input pin code:");
            int pinCode = scanner.nextInt();

            if (securitySystem.authenticate(card.getPin.equals(pinCode)) {
                System.out.println("Please input amount to withdraw:");
                double amount = scanner.nextDouble();

                boolean success = transactionProcessor.doTransaction(amount, cardNumber);
                if (success) {
                    System.out.println("Withdrawing " + amount);

                } else {
                    System.out.println("Insufficient funds :-(");
                }

            } else {
                System.out.println("Wrong pin");
            }


        }
    }
}
