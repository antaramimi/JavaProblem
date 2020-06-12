package string;

/**
 * Questions:
 * Return true if the given string contains an appearance of "xyz"
 * where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
 * Examples:
 * xyzThere("abcxyz") → true
 * xyzThere("abc.xyz") → false
 * xyzThere("xyz.abc") → true
 */

public class EndOther {
    public static void main(String[] args) {

        System.out.println(xyzThere("xyz"));
    }

    public static boolean xyzThere(String str) {

        {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'x') {
                    if (i != 0 && i < str.length() - 2 && str.charAt(i) + 1 == 'y' && str.charAt(i) + 2 == 'z' && str.charAt(i - 1) != '.') {
                        return true;
                    }
                    if (str.substring(0, 3).equals("xyz")) {
                        return true;
                    }
                }
            }
            return false;

        }

    }

}
