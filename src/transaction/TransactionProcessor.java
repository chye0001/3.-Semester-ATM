package transaction;

import account.Account;
import account.IAccount;

public class TransactionProcessor implements ITransactionProcessor {

    @Override
    public boolean doTransaction(double amount, IAccount account) {

        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }
}

