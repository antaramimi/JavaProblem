package miscellaneousproblems;

public class SmallestArray {
    public static void main(String[] args) {
        int[] arr ={41,15,20,16,1,44};
        findSmallestNumber(arr);
    }

    public static void findSmallestNumber(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(+min);
    }

    }


