package collection;

import java.util.ArrayList;
import java.util.List;

public class Practise {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(4);
        nums.add(20);
        nums.add(18);
        nums.add(28);

        System.out.println(nums);

        List<Integer> numbers =
                List.of(22,11,447,88,47);//фиксированный список)
       // numbers.add(58);
        //System.out.println(numbers);


        List<Student> students = new ArrayList<>();
        students.add(new Student("Aibek",30,"QA"));
        students.add(new Student("Aida",25,"QA"));
        students.add(new Student("Sanzhar",30,"QA"));

        for (Student student: students) {
            System.out.println(student);
        }
    }
}
