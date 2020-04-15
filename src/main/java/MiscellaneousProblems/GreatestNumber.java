package MiscellaneousProblems;

import java.util.Scanner;

/**
 * Question:
 * Take three numbers from the user and print the greatest number.
 * Examples:
 * Test Data
 * Input the 1st number: 25
 * Input the 2nd number: 78
 * Input the 3rd number: 87
 * Expected Output :
 * The greatest: 87
 */
public class GreatestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = scanner.nextInt();
        }
        if ((input[0] >= input[1]) && (input[0] >= input[2])) {

            System.out.println("Greatest number" + input[0]);
        } else if ((input[1] >= input[2]) && (input[1] >= input[0])) {
            System.out.println("Greatest number" + input[1]);
        } else {
            System.out.println("Greatest number" + input[2]);
        }
    }
}
