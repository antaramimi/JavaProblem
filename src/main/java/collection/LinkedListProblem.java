package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProblem {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ram");
        ll.add("Antara");
        ll.add("Pramisha");
        ll.add("Arnab");

        //we will create linkedlist using for loop

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        //we will create linkedlist using advancefor loop
        System.out.println("********");
        for (String str : ll) {
            System.out.println(str);
        }

        //we will create linkedlist using iterator loop
        System.out.println("********");
        Iterator<String> newll = ll.iterator();
        while (newll.hasNext()) {
            System.out.println(newll.next());
        }

        //we will create linkedlist using while loop
        System.out.println("********");
        int i = 0;
        while (i < ll.size()) {
            System.out.println(ll.get(i));
            i++;
        }


    }

}
