package Array;

public class SameFirstLast {
    public static void main(String[] args) {
        int[] abc={1, 2, 3};
        System.out.println(sameFirstLast(abc));
    }
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >0 && nums[0]==nums[nums.length-1]){
            return true;
        }
        return false;
    }
}
