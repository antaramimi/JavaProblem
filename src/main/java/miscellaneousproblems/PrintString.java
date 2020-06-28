package miscellaneousproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintString {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("antara is bad girl");
        test.add("antara is good girl");
        test.add("chocolate is tasty");
        System.out.println(groupingTheCharacter(test));
    }

    public static List<List<String>> groupingTheCharacter(List<String> arr) {

        List<List<String>> result
                = new ArrayList<>();
        List<String> aString = new ArrayList<>();
        List<String> bString = new ArrayList<>();
        List<String> cString = new ArrayList<>();

        for (String str : arr) {
            if (str.startsWith("a")) {
                aString.add(str);
            } else if (str.startsWith("b")) {
                bString.add(str);
            } else if (str.startsWith("c")) {
                cString.add(str);
            }
            result.add(aString);
            result.add(bString);
            result.add(cString);
        }
        return result;
    }

}
