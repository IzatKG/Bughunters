package collection;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {
    // Wrapper классы - объектные версии примитивных типов

    // int -------> Integer
    // double -----> Double
    // char ----> Character
    // boolean ---> Boolean
    // byte ---> Byte
    // short ---> Short
    // long ----> Long
    // float ---> Float

    public static void main(String[] args) {

        // int -->Integer(автоупаковка)
        int a = 5;
        System.out.println(Integer.valueOf(a));//

        // Integer--> int(автораспаковка)
        Integer x = 10;
        int k = x.intValue();



    }
}
