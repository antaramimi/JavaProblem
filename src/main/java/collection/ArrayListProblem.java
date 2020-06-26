package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListProblem {

    public static void main(String[] args) {
        // To create array : Size is fixed.
        int[] abc = new int[3];
        abc[0] = 1;
        System.out.println(Arrays.toString(abc));

        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(10);
        ar.add("Ram");
        System.out.println(ar);
        System.out.println(ar.size());
        System.out.println("Print the arraylist");

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));

        }

        //Generic Array list
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(10);

        //Print Employee class in Arraylist
        Employee em = new Employee("RAM", 10, "chemisty");
        Employee em1 = new Employee("RAM", 10, "chemisty");
        Employee em2 = new Employee("RAM", 10, "chemisty");

        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(em);
        emp.add(em1);
        emp.add(em2);

        for (int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }

        Iterator<Employee> emps = emp.iterator();
        while (emps.hasNext()) {
             Employee employee=emps.next();
            System.out.println(employee.age);
            System.out.println(employee.name);
            System.out.println(employee.deparment);

        }

    }
}