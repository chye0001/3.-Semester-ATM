package transaction;

public class TransactionProcessor implements ITransactionProcessor {

    public boolean doTransaction(double amount, Object account) {

        if (account.amount >= amount) {

            account.amount -= amount;
            return true;

        } else {
            return false;
        }
    }
}

