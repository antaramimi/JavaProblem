package miscellaneousproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintString {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("antara is bad girl");
        test.add("antara is good girl");
        test.add("chocolate is tasty");
        System.out.println(groupingTheCharacter(test));
        System.out.println(Arrays.deepToString(groupingTheCharacter2(new String[]{"antata is book", "antara", "book"})));
    }

    public static List<List<String>> groupingTheCharacter(List<String> arr) {

        List<List<String>> result = new ArrayList<>();
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
        }

        result.add(aString);
        result.add(bString);
        result.add(cString);

        return result;
    }


    public static String[][] groupingTheCharacter2(String[] arr) {
        String[][] result = new String[arr.length][];
        String[] aString = new String[arr.length];
        String[] bString = new String[arr.length];
        String[] cString = new String[arr.length];

        for (int i=0;i<arr.length;i++) {
            if (arr[i].startsWith("a")) {
                aString[i]=arr[i];
            } else if (arr[i].startsWith("b")) {
                bString[i]=arr[i];
            } else if (arr[i].startsWith("c")) {
                cString[i]=arr[i];
            }
        }

        result[0]=aString;
        result[1]=bString;
        result[2]=cString;

        return result;

    }

}


