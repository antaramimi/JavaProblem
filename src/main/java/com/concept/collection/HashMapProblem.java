package com.concept.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapProblem {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Ram");
        hm.put(2, "Antara");
        hm.put(3, "Pramisha");
        hm.put(4, "Arnab");


        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }


        Employee em = new Employee("ram", 12, "Science");
        Employee em1 = new Employee("geeta", 13, "arts");
        Employee em2 = new Employee("arnab", 25, "datascience");

        HashMap<Integer, Employee> emps = new HashMap<Integer, Employee>();

        emps.put(1,em);
        emps.put(2,em1);
        emps.put(3,em2);

        for(Map.Entry<Integer,Employee> m:emps.entrySet()){
           int value = m.getKey();
           Employee empValue=m.getValue();
            System.out.println(value+""+empValue);
        }


    }
}