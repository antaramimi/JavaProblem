package MiscellaneousProblems;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int [] arr ={4,10,15,60,20};
        findTheLargestNumber(arr);
    }

    public static void findTheLargestNumber(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if (max < arr[i]){
            max = arr[i];
        }
        }
        System.out.println(max);
    }
}
