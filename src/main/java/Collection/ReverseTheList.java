package Collection;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseTheList {
    public static void main(String[] args) {
        List<String> lb = new ArrayList<>();
        lb.add("Red");
        lb.add("Black");
        lb.add("Green");
        lb.add("Orange");
        lb.add("Pink");
        System.out.println(lb);
        Collections.reverse(lb);
        System.out.println(lb);

    }
}
