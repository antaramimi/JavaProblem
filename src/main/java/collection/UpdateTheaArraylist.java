package collection;

import java.util.ArrayList;
import java.util.List;

public class UpdateTheaArraylist {
    public static void main(String[] args) {
        List<String> updateTheList = new ArrayList<>();
        updateTheList.add("Black");
        updateTheList.add("Orange");
        updateTheList.add("Green");
        updateTheList.add("Red");
        updateTheList.add("Pink");

        System.out.println(updateTheList);
        updateTheList.set(2,"Antara");
        System.out.println(updateTheList);


    }
}
