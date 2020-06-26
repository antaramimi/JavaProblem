package interview;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 9, 8, 1};
        System.out.println(Arrays.toString(swapAnArray(arr)));
        System.out.println(Arrays.toString(arr));
        swapAnArray2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] swapAnArray(int[] arr) {
        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < arr.length / 2; i++) {
            a[i] = arr[i];
        }

        for (int i = arr.length/2 ,j=0; i < arr.length; i++) {
            b[j++] = arr[i];
        }

        int[] c = new int[5];
        for (int i = 0; i<b.length; i++) {
            c[i] = b[i];
        }
        for (int i = c.length/2,j=0; i<c.length; i++,j++) {
            c[i] = a[j];
        }
        return c;

    }

    public static void swapAnArray2(int[] arr){
        int temp;
        for (int i = 0,j=arr.length/2; i < arr.length / 2; i++,j++) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }


        }

}
