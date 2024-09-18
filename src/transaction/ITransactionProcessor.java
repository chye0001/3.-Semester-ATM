package transaction;

import account.Account;
import account.IAccount;

public interface ITransactionProcessor {

    boolean doTransaction(double amount, IAccount account);

}
