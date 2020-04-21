package Array;

/**
 * Questions:
 * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
 * Examples:
 * either24([1, 2, 2]) → true
 * either24([4, 4, 1]) → true
 * either24([4, 4, 1, 2, 2]) → false
 */
//TODO
public class Either24 {
    public boolean either24(int[] nums) {
        int counter2=0;
        int counter4=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==2 && nums[i+1]==2){
                counter2++;
            }
            if(nums[i]==4 && nums[i+1]==4) {
                counter4++;
            }
            if(counter2==counter4){
                return false;
            }
        }
        return true;
    }
}
