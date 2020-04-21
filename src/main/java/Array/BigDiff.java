package Array;

/**
 * Questions:
 * Given an array length 1 or more of ints,
 * return the difference between the largest and smallest values in the array.
 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
 * Examples:
 * bigDiff([10, 3, 5, 6]) → 7
 * bigDiff([7, 2, 10, 9]) → 8
 * bigDiff([2, 10, 7, 2]) → 8
 */
public class BigDiff     {
    public int bigDiff(int[] nums) {
        int maxs = nums[0];
        int mins = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxs = Math.max(nums[i], maxs);
            mins = Math.min(nums[i], mins);
        }
        return maxs - mins;
    }

}
