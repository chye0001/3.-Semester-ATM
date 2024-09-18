package dispenser;

public class CashDispenser implements ICashDispenser {

    @Override
    public void dispenseCash (double amount) {
        System.out.println("Dispensing cash" + amount);
    }

}

