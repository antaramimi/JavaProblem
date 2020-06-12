package miscellaneousproblems;

import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=scanner.nextInt();

        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<max);
            max=arr[i];

        }
       System.out.println("Max::" + max);
    }
}
