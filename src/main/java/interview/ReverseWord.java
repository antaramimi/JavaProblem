package interview;

/**
 * How do you reverse words in a given
 * sentence without using any library method?
 */

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String word) {

        String[] newWord = word.split("");
        String result = "";
        for (int i = newWord.length - 1; i >= 0; i--) {
            result = result + newWord[i];
        }
        return result;
    }
}

