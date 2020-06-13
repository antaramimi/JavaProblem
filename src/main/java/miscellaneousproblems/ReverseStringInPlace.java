package miscellaneousproblems;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        char[] arr="I hello".toCharArray();
        char[] arr1="Places".toCharArray();
        char[] arr2="Ram".toCharArray();
        System.out.println(arr);
        reverseString(arr);
        System.out.println(arr);
        System.out.println("****");
        System.out.println(arr1);
        reverseString(arr1);
        System.out.println(arr1);
        System.out.println("*****");
        System.out.println(arr2);
        reverseString(arr2);
        System.out.println(arr2);
    }

    public static void reverseString(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            reverseCharacter(chars, i, chars.length - i - 1);
        }
    }

    public static void reverseCharacter(char[] charArray,
                                        int i, int j) {
        char temp;
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }


}
