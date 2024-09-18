package transaction;

public interface ITransactionProcessor {

    boolean doTransaction(double amount, Object account);

}
