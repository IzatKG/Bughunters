package collection;

import java.util.*;

public class MySet {
    public static void main(String[] args) {
        String[] students = {"Bakyt", "Akyl", "Aktan", "Tilek", "Akyl"};
        List<String> listOfStudents = new ArrayList<>(Arrays.asList(students));
        listOfStudents.add("Uulkan");
        System.out.println(listOfStudents);

        Set<String> newList = new TreeSet<>(listOfStudents);
        System.out.println(newList);

        Set<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(10);
        nums.add(2);
        nums.add(8);
        nums.add(9);
        nums.add(2);

        System.out.println(nums);
        int index = 0;
        for (int num : nums) {
            if (index == 3) {
                System.out.println(num);
                break;
            }
            index++;
        }

//        int index1 = 0;
//        for (int i = 0; i >= nums.size(); ) {
//            if (index1 == 3) {
//                System.out.println(i);
//                break;
//            }
//           index1++;
//        }

    }
}
