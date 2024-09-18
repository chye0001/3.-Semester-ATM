package dispenser;

public class CashDispenser implements ICashDispenser {

@Override
    public void DispenseCash (double amount) {
        System.out.println("Dispensing cash" + amount);
    }

}

