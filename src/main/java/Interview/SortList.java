package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        String[] stringList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "aug", "Sep", "Oct", "nov", "Dec" };
        System.out.println("*************");
        System.out.println(showList(stringList));

    }

    public static List<String> showList(String[] arr){

        List<String> listString = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(listString, String.CASE_INSENSITIVE_ORDER);

        return listString;

    }
}
