package oop.inheritance;

public class SavingAccount extends BankAccount implements MyInterface{
    // процентная ставка
    private double interestRate;

    public SavingAccount(String accountHolderName, int accountNumber, double initialBalance, double interestRate) {
        super(accountHolderName, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void calculateRate() {
        if (interestRate > 0) {
            double interest = getBalance() * interestRate / 100;
            deposit(interest);
            System.out.println("Начисленные проценты " + interest);
        } else {
            System.err.println("Процентная ставка должна быть положительной");
        }
    }
}
