package codingbatpractice.array;

/**
 * Questions:
 * Return the sum of the numbers in the array, returning 0 for an empty array.
 * Except the number 13 is very unlucky,
 * so it does not count and numbers that come immediately after a 13 also do not count.
 * Examples:
 * sum13([1, 2, 2, 1]) → 6
 * sum13([1, 1]) → 2
 * sum13([1, 2, 2, 1, 13]) → 6
 */

public class Sum13 {
    public static void main(String[] args) {
        int[] abc={1,2,2,1};
        System.out.println(sum13(abc));
    }
    public static int sum13(int[] nums) {
        int sums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sums=sums+nums[i];
            }if(nums[i]==13 && i < nums.length-1){
                nums[i]=0;
                nums[i+1]=0;
            }

        }
        return sums;
    }

}
