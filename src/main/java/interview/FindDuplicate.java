package interview;


import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        List<String> lb=new ArrayList<>();
        for(int i=0;i<10;i++){
            lb.add(String.valueOf(i));
        }
        for(int i=0;i<5;i++){
            lb.add(String.valueOf(i));
        }
        System.out.println(lb);
        System.out.println(duplicateElement(lb));
        int[] arr ={1,2,3,4,5,1,2,3};
        System.out.println(Arrays.toString(n2approach(arr)));
    }


    public static Set<String> duplicateElement (List<String> listContainDuplicate){
        Set<String> resutSetlist = new HashSet<>();
        Set<String> tempSetlist = new HashSet<>();

        for(String yourInt :listContainDuplicate){
            if(!tempSetlist.add(yourInt)){
                resutSetlist.add(yourInt);
            }
        }
        return resutSetlist;
    }

    public static int[] n2approach (int[] arr) {
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    a[i] = arr[j];
                }
            }
        }
        return a;
    } 
}