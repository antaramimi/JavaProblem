package com.codingbat.array;

/**
 * Questions:
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
 * Examples:
 * no14([1, 2, 3]) → true
 * no14([1, 2, 3, 4]) → false
 * no14([2, 3, 4]) → true
 */
//TODO
public class No14 {
    public boolean no14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int counter1 = 0;
            int counter4 = 0;
            if (nums[i] == 1) {
                counter1++;
            }
            if (nums[i] == 4) {
                counter4++;
            }
            if (counter1 == counter4) {
                return false;
            }

        }
        return false;
    }
}
