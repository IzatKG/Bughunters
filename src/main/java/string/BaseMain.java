package string;

import static string.Practice.*;

public  class BaseMain {
    public  final int x = 5;

    public static void main(String[] args) {
        System.out.println(makeText("Java","Bishkek"));
        System.out.println(makeText("<<>>","Bishkek"));
        System.out.println(getColour("redSun"));
        System.out.println(getColour("blueSun"));
        System.out.println(getColour("SunBlueSun"));
        System.out.println(doConcat("Hi","Bye"));



    }
}
