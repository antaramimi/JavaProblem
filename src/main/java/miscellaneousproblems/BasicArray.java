package miscellaneousproblems;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 9, 8, 1, 7};
        System.out.println("This will print an array:");
        printArray(arr);
        System.out.println();
        System.out.println("This will print a half array:");
        printHalfArray(arr);
        System.out.println();
        System.out.println("This will print n array:");
        printArray(arr, 2);
        System.out.println();
        System.out.println("This will swap an array:");
        //swapAnArray(new int[]{2,8,88,89,45,1});
        swapAnArray(arr);
        System.out.println();
        System.out.println("This will reverse an array:");
        reverseArray(arr);
        System.out.println();
        System.out.println("This will sort an array:");
        sortArray(arr);
        System.out.println();
        System.out.println("This will return sum of an array:");
        sumArray(arr);
        System.out.println();
        System.out.println("------");
        printGrid();
        System.out.println();
        System.out.println("This will return average of an array");
        AverageArray(arr);
        System.out.println();
        System.out.println("This will return index of an array");
        indexArray(arr, 7);
        System.out.println();
        System.out.println("This will return true of an array");
        System.out.println(specialValueArray(arr, 7));
        System.out.println();
        System.out.println("This will remove an array");
        System.out.println(Arrays.toString(removeArray(arr, 7)));
        System.out.println();
        System.out.println("This will return duplicate an array");
        duplicateArray(new int[]{2, 88, 88, 45, 1});
        System.out.println();
        System.out.println("This will return common element in an array");
        commonElements(new int[]{2, 88, 88, 45, 1},new int[]{1, 88, 77, 5, 41});

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

    public static void swapAnArray(int[] arr) {
        int temp;
        temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr, i, arr.length);
            System.out.print(arr[i]);
        }
    }

    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void printGrid() {
        String[][] a = new String[10][10];
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                a[i][j] = "*";
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void AverageArray(int[] arr) {
        int sum = 0;
        int avarage = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avarage = sum / arr.length;

        }
        System.out.println(avarage);
    }

    public static void indexArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.print(i);
                break;
            }
        }
    }

    public static boolean specialValueArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static int[] removeArray(int[] arr, int n) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n)
                newArray[i] = arr[i];
        }
        return newArray;
    }

    public static void duplicateArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                System.out.println(arr[i]);
        }
    }

    public static void commonElements(int[] arr,int[] arr2) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr2[i])
                System.out.println(arr[i]);
        }
    }




}

