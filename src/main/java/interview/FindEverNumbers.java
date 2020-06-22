package interview;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 *
 */

public class FindEverNumbers {
    public static void main(String[] args) {
        System.out.println(findNumbers2(new int[]{437,315,322,431,686,264,442}));
    }

    public static int findNumbers(int[] nums) {
        int counter = 0;

        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int findNumbers2(int[] nums){
        int evenCounter=0;
        int digitCounter=0;

        for (int num : nums) {
            while (num != 0) {
               num= num/10;
                digitCounter++;
            }
                if(digitCounter%2==0){
                    evenCounter++;
                }
                digitCounter=0;
        }
        return evenCounter;
    }
}
