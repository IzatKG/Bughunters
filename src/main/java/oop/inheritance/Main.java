package oop.inheritance;

import static oop.inheritance.MyInterface.NAME;

public class Main {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(
                "Aktan",
                445217867,
                5000,
                10);

        account.showInfo();
        account.deposit(-100);
        account.withdraw(4999);
        account.deposit(5889);
        account.showInfo();

        account.calculateRate();


        System.out.println("*************************************");
        SavingAccount account1 = new SavingAccount(
                "Aida",
                14521478,
                100000,
                0);

        account1.calculateRate();
        account1.showInfo();
        account1.getAccountNumber();

        account1.defaultMethod();

        System.out.println(NAME);
        System.out.println(MyInterface.AMOUNT);

    }
}
