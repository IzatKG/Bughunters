package oop.abstracts;

import annotation.Owner;
import annotation.Owners;

import static annotation.Owners.IZAT_K;


@Owner(IZAT_K)
public class BaseMain {
    public static void main(String[] args) {
        Developer developer = new Developer(
                "Tilek",
                25, "IT",
                1700,
                160);

        developer.setAge(30);

        Developer aktan = new Developer(
                "Aktan",
                20,
                "IT",
                1200,
                148);

        System.out.println(developer);
        System.out.println(developer.calculateSalary());
        developer.printInfo();

        System.out.println(aktan);
        System.out.println(aktan.calculateSalary());
        aktan.printInfo();

        Tester aida = new Tester(
                "Aida",
                30,
                "IT",
                130000,
                60000);

        System.out.println(aida);
        System.out.println(aida.calculateSalary());
        aida.printInfo();

        // Нельзя создать объект абстракного класса -->
        //Employee employee = new Employee();

    }
        }