package com.concept.collection;

import java.util.ArrayList;
import java.util.List;

public class SearchTheElement {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Orange");

        if(list.contains("Banana")){
            System.out.println("True");
        }else {
            System.out.println("No element");
        }
    }
}
