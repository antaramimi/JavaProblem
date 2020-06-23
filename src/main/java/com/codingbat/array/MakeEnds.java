package com.codingbat.array;

import java.util.Arrays;

/**
 * Questions:
 * Given an array of ints, return a new array length 2
 * containing the first and last elements from the original array. The original array will be length 1 or more.
 * Examples:
 * makeEnds([1, 2, 3]) → [1, 3]
 * makeEnds([1, 2, 3, 4]) → [1, 4]
 * makeEnds([7, 4, 6, 2]) → [7, 2]
 */

public class MakeEnds {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeEnds(new int[]{2,8,88,89,45,1}))) ;
    }

    public static int[] makeEnds(int[] nums) {
        return new int[]{nums[0],nums[nums.length-1]};
    }
}