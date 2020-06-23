package com.codingbat.array;


public class FirstLast6 {
    public static void main(String[] args) {
        int[] abc={};
        System.out.println(firstLast6(abc));
    }
    public static boolean firstLast6(int[] nums) {
        if (nums.length >0 && nums[0]==nums[nums.length-1]){
            return true;
        }
        return false;
    }

}
