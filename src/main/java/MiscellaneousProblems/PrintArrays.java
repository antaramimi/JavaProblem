package MiscellaneousProblems;

public class PrintArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,8,9,6};
        printArray(arr);
        System.out.println();
        printHalfArray(arr);
        System.out.println();
        printArray(arr, 2);
        System.out.println();
        swapAnArray(new int[]{2,8,88,89,45,1});

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void printHalfArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void printArray(int[] arr, int n) {
        if (n > arr.length) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void swapAnArray(int[] arr){
        int temp;
                temp=arr[0];
                arr[0]=arr[arr.length-1];
                arr[arr.length-1]=temp;
                printArray(arr);
            }


        }