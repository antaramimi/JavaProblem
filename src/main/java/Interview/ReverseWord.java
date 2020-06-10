package Interview;

/**
 * How do you reverse words in a given
 * sentence without using any library method?
 */

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseString("i hate coding"));
    }

    public static String reverseString(String word) {

        String[] newWord = word.split("");
        String result = "";

        for (int i = 0; i < newWord.length; i++) {
            if (i == newWord.length - 1) {
                result = newWord[i] + result;
            } else {
                result = "" + newWord[i] + result;
            }
        }
        return result;
    }


}

