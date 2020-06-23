package com.codingbat.array;

/**
 * Given an array of ints, return the sum of the first 2 elements in the array.
 * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
 */
public class Sum22 {
    public int sum2(int[] nums) {
        int sum=0;
        for(int i=0;i<2;i++){
           sum=nums[i]+nums[i+1];
        }
        return 0;
    }
}
