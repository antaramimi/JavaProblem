package string;

/**
 * Question:
 * Given a string, return a string where for every char in the original, there are two chars.
 * Examples:
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class DoubleChar {

    public String doubleChar(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString = newString + str.charAt(i) + str.charAt(i);
        }
        return newString;
    }

}
