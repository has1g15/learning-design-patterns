package State;

public class ATMOutOfMoney implements ATMState {

    ATMMachine atmMachine;

    public ATMOutOfMoney(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have money. You didn't enter a card");

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have money");
    }
}
