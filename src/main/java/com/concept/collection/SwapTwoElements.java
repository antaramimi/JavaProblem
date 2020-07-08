package com.concept.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElements {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("gheiif");
        list.add("fnedn");


        System.out.println(list);
        Collections.swap(list,3,list.size()-1);
        System.out.println(list);

    }
}
