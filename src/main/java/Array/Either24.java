package Array;

import java.util.Arrays;

/**
 * Questions:
 * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
 * Examples:
 * either24([1, 2, 2]) → true
 * either24([4, 4, 1]) → true
 * either24([4, 4, 1, 2, 2]) → false
 */

public class Either24 {
    public static void main(String[] args) {
        System.out.println((either24(new int[]{4, 4, 1, 2, 2}))) ;
    }
    public static boolean either24(int[] nums) {
            boolean number22=false;
            boolean number44=false;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==2 && nums[i+1]==2){
                    number22 = true;
                }
                if(nums[i]==4 && nums[i+1]==4) {
                    number44=true;
                }
            }
            return number22 != number44 ;
        }

    }
