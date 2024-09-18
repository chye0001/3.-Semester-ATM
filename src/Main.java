import TransactionProcessor.ITransactionProcessor;
import TransactionProcessor.TransactionProcessor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ITransactionProcessor transactionProcessor = new TransactionProcessor();

        Scanner scanner = new Scanner(System.in);
        String cardNumber = "";
        System.out.println("""
                **********************
                **** ATM TERMINAL ****
                **********************
                """);
        while(!cardNumber.equalsIgnoreCase("q")) {

        //if 
        System.out.println("Please input card number: (q = quit)");
        cardNumber = scanner.nextLine();
        System.out.println("Please input pin code:");
        int pinCode = scanner.nextInt();

        // if cardnumber and pin is valid, do:
            System.out.println("Please input amount to withdraw:");
            double amount = scanner.nextDouble();
            System.out.println(transactionProcessor.doTransaction(amount, cardNumber)); // hent account fra cardNumber somehow?

        }
    }
}
