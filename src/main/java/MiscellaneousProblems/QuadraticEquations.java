package MiscellaneousProblems;
/**
 * Questions:
 * Write a Java program to solve quadratic equations (use if, else if and else). Go to the editor
 * Examples:
 * Test Data
 * Input a: 1
 * Input b: 5
 * Input c: 1
 * Expected Output :
 * The roots are -0.20871215252208009 and -4.7912878474779195
 */

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        double first = 0;
        double second = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A");
        double a = scanner.nextInt();
        System.out.println("Input B");
        double b = scanner.nextInt();
        System.out.println("Input C");
        double c = scanner.nextInt();

        double result = b * b + 4.0 * a * c;
        double square = Math.sqrt(result);

        if (result > 0) {
            first = (-b + square) / (2 * a);
            second = (+b + square) / (2 * a);
            System.out.println("Roots are :: " + first + " and " + second);
        } else if (result == 0) {
            System.out.println("Root is :: " + (-b + square) / (2 * a));


        }


    }
}
