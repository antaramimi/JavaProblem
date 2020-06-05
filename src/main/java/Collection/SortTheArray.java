package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheArray {
    public static void main(String[] args) {
        List<String> lb = new ArrayList<>();
        lb.add("Orange");
        lb.add("Red");
        lb.add("Blank");
        lb.add("Pink");
        System.out.println("Before sorting the list "+ lb);
        Collections.sort(lb);
        System.out.println("After sorting the list "+ lb);

    }


}
