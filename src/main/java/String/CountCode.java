package String;

/**
 * Question:
 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 * Examples:
 * countCode("aaacodebbb") → 1
 * countCode("codexxcode") → 2
 * countCode("cozexxcope") → 2
 */

public class CountCode {
    public int countCode(String str) {
        String newString="";
        int codeCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='c'){
                if(str.charAt(i+1)=='o'&&str.charAt(i+3)=='e') {
                    codeCount++;
                } if (str.substring(i, i + 3).equals("code"))
                    codeCount++;
                }
            }
        return codeCount;


    }}
