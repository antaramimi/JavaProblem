package MiscellaneousProblems;

public class NestedLoops {
    public static void main(String[] args) {
       for(int i=1;i<=8;i++){
            for(int j=1;j<i;j++){
                System.out.print(j + "");
                //System.out.print(j + "");
            }System.out.println("");
        }
    }

    public static class SkipNumbers {

        public static void skipNumbers(int[] nums){
            for(int i=0;i<nums.length;i=i+2){
               System.out.print(nums[i]);
            }
        }

    }

}