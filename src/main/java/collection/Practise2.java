package collection;

import helpermethods.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practise2 {
    public static void main(String[] args) {

        String [] fruits = {"apple", "banana","cherry","lemon"};

        List<String> myFruits = new ArrayList<>();
        myFruits.add("apple");
        myFruits.add("banana");
        myFruits.add("cherry");
        myFruits.add("lemon");

        System.out.println(Arrays.toString(fruits));
        System.out.println(myFruits);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        //преобразуем массив в список ---> Arrays.asList()
        //фиксированный список (нельзя добавлять и удалять элементы)
        List<String> list = Arrays.asList(fruits);
       // list.add("mango");
        System.out.println(list);


        List<String> listOfFruits = new ArrayList<>(Arrays.asList(fruits));
        listOfFruits.add("mango");
        System.out.println(listOfFruits);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        int [] numbers = {1,2,3,4,5,8};

        List<Integer> listOfNumbers = new ArrayList<>();
        // перебираем через foreach---->
        for (int nums: numbers) {
            listOfNumbers.add(nums);
            System.out.println(nums);
        }

        int [] myNums = { 55,1,4,88,53};
        List<Integer> listOfmyNums = Arrays
                .stream(myNums)
                .boxed()
                .toList();

        System.out.println(listOfmyNums);


        List<Double> numsList = List.of(4.1,55.0,10.1,20.8);
        Double sumOfNumbers = Util.sumList(numsList);
        System.out.println(sumOfNumbers);


        int count = Util.countWords(myFruits);
        System.out.println(count);
        }
    }

