package oop.abstracts;

import lombok.ToString;

@ToString(callSuper = true)
public class Tester extends Employee{
    private double baseSalary;
    private double bonus;

    public Tester(String name, int age, String department, double baseSalary, double bonus) {
        super(name, age, department);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Base salary :" + baseSalary);
        System.out.println("Bonus :" + bonus);
    }
}
