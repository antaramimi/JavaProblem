package interview;

import java.util.*;

/**
 * Given an array of integers, you have to find all pairs of elements in this array
 * such that whose sum must be equal to a given number.
 * <p>
 * For example,
 * if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
 * then you have to find all pairs of elements in this array whose sum must be 20.
 * In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
 */

public class PairofElementsInTheArray {
    public static void main(String[] args) {
        System.out.println(findThePair(new int[]{4, 6, 5, -10, 8, 5, 20}, 10));
        System.out.println(findThePairSecondMethod(new int[]{4, 6, 5, -10, 8, 5, 20}, 10));

    }

    public static List<Pair> findThePair(int[] inputArray, int number) {
        int sum = 0;
        List<Pair> lb = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                sum = inputArray[i] + inputArray[j];
                if (number == sum) {
                    Pair pair = new Pair();
                    pair.setFirstNumber(inputArray[i]);
                    pair.setSecondNumber(inputArray[j]);
                    lb.add(pair);
                } 
            }

        }
        return lb;
    }


    static class Pair {
        int firstNumber;
        int secondNumber;

        public int getFirstNumber() {
            return firstNumber;
        }

        public void setFirstNumber(int firstNumber) {
            this.firstNumber = firstNumber;
        }

        public int getSecondNumber() {
            return secondNumber;
        }

        public void setSecondNumber(int secondNumber) {
            this.secondNumber = secondNumber;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "firstNumber=" + firstNumber +
                    ", secondNumber=" + secondNumber +
                    '}';
        }
    }

    public static List<Pair> findThePairSecondMethod(int[] inputArray, int sum) {

        List<Pair> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int c : inputArray) {
            set.add(c);
        }

        for (int num : inputArray) {
            if (set.contains(sum - num)) {
                Pair pair = new Pair();
                pair.setFirstNumber(num);
                pair.setSecondNumber(sum - num);
                result.add(pair);
                set.remove(num);
                set.remove(sum - num);
            }
        }
        return result;
    }
}