package miscellaneousproblems;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "Mom IS";
        if (isPalindrome(str)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }

    }


    public static boolean isPalindrome(String str) {

        str = str.replace(" ", "");
        str = str.toLowerCase();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (str.charAt(i) != str.charAt(chars.length - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
