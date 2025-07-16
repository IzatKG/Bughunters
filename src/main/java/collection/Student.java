package collection;

import lombok.ToString;

@ToString
public class Student {
    private String name;
    private int age;
    private String job;

    public Student(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
}
