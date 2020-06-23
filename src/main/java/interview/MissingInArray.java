package interview;

/**
 * How do you find the missing number in a given integer array of 1 to 100?
 */

public class MissingInArray {
    public static void main(String[] args) {
        System.out.println(missingArray(new int[]{1,2,3,5}));

    }
    public static int missingArray(int [] arr){
        //int missingNumber = 0;
        for(int i=0;i<=arr.length;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }
}
