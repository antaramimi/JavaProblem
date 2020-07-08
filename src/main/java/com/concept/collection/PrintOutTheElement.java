package com.concept.collection;

import java.util.ArrayList;
import java.util.List;

public class PrintOutTheElement {
    public static void main(String[] args) {

        List<String> arrlist=new ArrayList<>();
        arrlist.add("Red");
        arrlist.add("Green");
        arrlist.add("orange");
        arrlist.add("white");

        for(String characterCollection:arrlist){
            System.out.println(characterCollection);
        }

    }
}
