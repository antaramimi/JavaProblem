package collection;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArraylist {
    public static void main(String[] args) {
        List<String> stringFirst = new ArrayList<>();
        List<String> secondString =new ArrayList<>();

        stringFirst.add("Monday");
        stringFirst.add("Tuesday");
        stringFirst.add("Wednesday");
        stringFirst.add("Friday");

        secondString.add("Monday");
        secondString.add("Tuesday");
        secondString.add("Wednesday");
        secondString.add("gukkjhj");


        stringFirst.retainAll(secondString);
        System.out.println(stringFirst);




    }
}
