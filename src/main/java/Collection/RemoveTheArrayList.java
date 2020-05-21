package Collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveTheArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Pink");
        list.add("Blank");
        list.add("Green");
        list.add("Red");

        System.out.println(list);

        list.remove(2);

        System.out.println("After removing third element from the list:\n");

        System.out.println(list);
    }
}
