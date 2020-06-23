package com.codingbat.string;

/**
 * Questions:
 * Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
 * You may assume that n is between 0 and the length of the string, inclusive.
 * Examples:
 * repeatEnd("Hello", 3) → "llollollo"
 * repeatEnd("Hello", 2) → "lolo"
 * repeatEnd("Hello", 1) → "o"
 */
public class RepeatEnd {

    public String repeatEnd(String str, int n) {
        String subString = str.substring(str.length() - n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(subString);
        }
        return sb.toString();
    }

    public String repeatEnds(String str, int n) {
        String newString = "";
        String subString = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            newString = newString + subString;
        }

        return newString;
    }
}
