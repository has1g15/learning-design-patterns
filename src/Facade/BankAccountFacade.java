package Facade;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberChecker;
    SecurityCodeCheck securityCodeChecker;
    FundsChecker fundsChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeToBank();
        accountNumberChecker = new AccountNumberCheck();
        securityCodeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsChecker();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double amount) {
        if(accountNumberChecker.accountActive(getAccountNumber()) &&
                securityCodeChecker.isCodeCorrect(getSecurityCode()) &&
                fundsChecker.sufficientBalance(amount)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double amount) {
        if(accountNumberChecker.accountActive(getAccountNumber()) &&
                securityCodeChecker.isCodeCorrect(getSecurityCode())) {
                fundsChecker.makeDeposit(amount);
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }
}
