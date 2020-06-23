package com.codingbat.array;

/**
 * Questions:
 * Given an array of ints, return true if every element is a 1 or a 4.
 * Examples:
 * only14([1, 4, 1, 4]) → true
 * only14([1, 4, 2, 4]) → false
 * only14([1, 1]) → true
 */

public class Only14 {
    public boolean only14(int[] nums) {
        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] == 1 && nums[i] == 4)
                return true;
        }
        return false;
    }
    }
