package MiscellaneousProblems;
/**
 *Write a Java program to test a number is positive or negative.
 *Test Data
 *Input number: 35
 */

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int input =scanner.nextInt();
        if(input>=0){
           System.out.println("A number is positive");
        } else
            System.out.println("A number is negative");
        }
    }

