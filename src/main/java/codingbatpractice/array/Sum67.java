package codingbatpractice.array;

/**
 * Questions:
 * Return the sum of the numbers in the array,
 * except ignore sections of numbers starting with a 6 and extending to the next 7
 * (every 6 will be followed by at least one 7). Return 0 for no numbers.
 * Examples:
 * sum67([1, 2, 2]) → 5
 * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
 * sum67([1, 1, 6, 7, 2]) → 4
 */
//TODO
public class Sum67 {
    public static void main(String[] args) {
        int[] a = new int[]{ 2, 3, 4, 3, 3, 5, 4, 10, 9, 1, 9, 11, 15 };
        sum67(a);
    }

    public static int sum67(int[] nums) {
        int sums = 0;
        boolean ignore=false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                ignore = true;
            }
            if(nums[i]==7){
                ignore=false;
            }
            if(!ignore){
                sums+=nums[i];
                System.out.println(sums);
            }
        }
        return sums;
    }
}