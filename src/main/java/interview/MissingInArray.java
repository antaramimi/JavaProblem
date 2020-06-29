package interview;

/**
 * How do you find the missing number in a given integer array of 1 to 100?
 */

public class MissingInArray {
    public static void main(String[] args) {
        //System.out.println(missingArray(new int[]{1,2,3,5,6}));
       // System.out.println(missingArray1(new int[]{1,2,3,5,6}));


    }
    public static int missingArray(int [] arr){
        for(int i=0;i<=arr.length;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }

    public static int missingArray1(int[] arr){
        int lastNumber;
        int actualnumber=0;
        lastNumber=6;
        int expectedSum =(lastNumber * (lastNumber+1))/2;
        for(int i: arr){
            actualnumber  += i;
        }
        return expectedSum-actualnumber;
    }
}
