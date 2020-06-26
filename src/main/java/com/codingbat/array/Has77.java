package com.codingbat.array;

/**
 * Given an array of ints, return true if the array contains two 7's next to each other,
 * or there are two 7's separated by one element, such as with {7, 1, 7}.
 * Examples:
 * has77([1, 7, 7]) → true
 * has77([1, 7, 1, 7]) → true
 * has77([1, 7, 1, 1, 7]) → false
 */

public class Has77 {
    public static void main(String[] args) {
        System.out.println((has77(new int[]{1,7,1,7}))) ;
    }
    public static boolean has77(int[] nums) {
        boolean number77 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                number77 = true;
            }
            if (nums[i] == 7 && nums[i + 1] !=7) {
                number77 = true;
            }
        }
        return number77;
    }
}
