package TransactionProcessor;

public class TransactionProcessor implements ITransactionProcessor {

    public String doTransaction(double amount, Object account) {


        account.amount -= amount;

        return amount.toString() + " has been withdrawn your account.";
    }



}
