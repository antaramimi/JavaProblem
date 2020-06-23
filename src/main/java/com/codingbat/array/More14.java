package com.codingbat.array;

/**
 * Questions:
 * Given an array of ints, return true if the number of 1's is greater than the number of 4's
 * Examples:
 * more14([1, 4, 1]) → true
 * more14([1, 4, 1, 4]) → false
 * more14([1, 1]) → true
 */
public class More14 {
    public boolean more14(int[] nums) {
        int counter1=0;
        int counter4=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1&&nums[i]==4){
                counter1++;
                counter4++;
            }
        }
        if(counter1>counter4){
            return true;
        } else {
            return false;
        }

    }

}
