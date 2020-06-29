package interview;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagrams("Dog","god"));
        System.out.println(isAnagrams("dog","god"));

    }
    public static boolean isAnagrams(String str1,String str2){
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return isEqual(arr1,arr2);
    }

    public static boolean isEqual(char[] ar1, char[] ar2){
        // simple validation.
        if(ar1.length != ar2.length){
            return false;
        }
        for(int i=0;i<ar1.length;i++){
            char a=ar1[i];
            char b=ar2[i];
            if(a != b){
                return false;
            }
        }
        return true;
    }

}
