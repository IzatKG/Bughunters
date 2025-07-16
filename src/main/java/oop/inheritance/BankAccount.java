package oop.inheritance;

public class BankAccount {
    private double balance;
    private String accountHolderName;
    private int accountNumber;

    private static final String NAME = "Bakyt";

    public BankAccount(String accountHolderName, int accountNumber,double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if(accountHolderName != null && !accountHolderName.isEmpty())
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void showInfo(){
        System.out.println("Владелец :" + accountHolderName +" , Баланс: " + balance);
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Пополнено :" + amount);
        }else {
            System.out.println("Сумма пополнения должна быть положительной");
        }
    }

    public void withdraw(double amount){
        if( amount > 0 && amount <= balance){
            balance = balance - amount;
        }else {
            System.out.println("Недостаточно средств на вашем балансе!");
        }
    }

}
