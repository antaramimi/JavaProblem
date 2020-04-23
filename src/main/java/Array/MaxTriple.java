package Array;

public class MaxTriple {
    public static void main(String[] args) {
        int[]abc={1,2,7};
        System.out.println(maxTriple(abc));
    }

    public static int maxTriple(int[] nums) {
        int max = nums[0];
        if(max < nums[nums.length / 2])
            max = nums[nums.length / 2];

        if(max < nums[nums.length - 1])
            max = nums[nums.length - 1];

        return max;


    }

}
