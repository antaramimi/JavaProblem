package miscellaneousproblems;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        reverseString("I Hate you");
    }

    public static void reverseString(String strs) {

        for (int i = 0; i < strs.length(); i++) {
            reverseCharacter(strs, i, strs.length() - 1);

        }
    }

    public static String reverseCharacter(String str, int i, int j) {
        char[] myArray = str.toCharArray();
        char temp;
        temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
        return new String(myArray);

    }


}
