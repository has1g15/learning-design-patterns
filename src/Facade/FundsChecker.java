package Facade;

public class FundsChecker {

    private double balance = 1000.00;

    public double getBalance() {
        return balance;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        balance -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDepoisted) {
        balance += cashDepoisted;
    }

    public boolean sufficientBalance(double cashWithdrawn) {
        if (cashWithdrawn > balance) {
            System.out.println("You don't have enough money");
            System.out.println("Current balance: " + getBalance());
            return false;
        } else {
            decreaseCashInAccount(cashWithdrawn);
            System.out.println("Withdrawal complete. Current balance is " + getBalance());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete. Current balance is " + getBalance());
    }
}
