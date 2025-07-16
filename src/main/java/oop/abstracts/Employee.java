package oop.abstracts;

import lombok.ToString;

@ToString
public abstract class Employee {
    //Поля (свойства)
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printInfo() {
        System.out.println("Name :" + name);
        System.out.println("Age:" + age);
        System.out.println("Department :" + department);
    }

    public void retire() {
        System.out.println(name + " Вышел на пенсию.");
    }

    public abstract double calculateSalary();
}
