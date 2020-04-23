package Array;

import java.util.Arrays;

/**
 * Questions:
 * Given an int array, return a new array with double the length
 * where its last element is the same as the original array,
 * and all the other elements are 0. The original array will be length 1 or more.
 * Examples:
 * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
 * makeLast([1, 2]) → [0, 0, 0, 2]
 * makeLast([3]) → [0, 3]
 *
 */
public class MakeLast {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeLast(new int[]{2, 8, 88})));
    }


    public static int[] makeLast(int[] nums) {
        int[] newArray=new int[2 * nums.length];
        newArray[newArray.length-1]=nums[nums.length - 1];
            return newArray;
    }
}

