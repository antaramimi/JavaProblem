package MiscellaneousProblems;

public class IsPalindrome {
    public static void main(String[] args) {
       String str="mom";
       if(isPalindrome(str)){
           System.out.println("true");

       }else {
           System.out.println("false");
       }

    }


    public static boolean isPalindrome(String str) {
        char[] orginalString=str.toCharArray();

        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(orginalString[i] !=orginalString[j]){
                return true;

            }
        }
                return true;

    }
}