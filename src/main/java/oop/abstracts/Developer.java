package oop.abstracts;

import lombok.ToString;

@ToString(callSuper = true)
public class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, int age, String department, double hourlyRate, int hoursWorked) {
        super(name, age, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("HourlyRate " +hourlyRate);
        System.out.println("HoursWorked " +hoursWorked);
    }
}
