package MiscellaneousProblems;

import java.util.Arrays;

public class BasicString {

    public static void main(String[] args) {

        System.out.println(copyAArray("antara"));
        System.out.println(spaceBetweenString("ramswarooppatra"));
        System.out.println(specialCharacter("ramswarooppatra"));

        String str = "MAM";

        if (isPalindrome(str)) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
        System.out.println("");


        System.out.println(concatenateString("ram s good boy ","and loves antara"));
    }


    public static String copyAArray(String str){
        char[] newArray=new char[str.length()];
        char[] array= str.toCharArray();
        for(int i=0;i<str.length();i++){
            newArray[i]=array[i];
        }
       return new String(newArray);
    }

    public static char[] copyCharacterArray(char[] c){
        char[] newCharacter=new char[c.length];
        for(int i=0;i<c.length;i++){
            newCharacter[i]=c[i];
        }
        return newCharacter;

    }

    public static String spaceBetweenString(String str){
        char[] newArray= new char[100];
        char[] array=str.toCharArray();
        int counter=0;
        for(int i=0;i<str.length();i++){
            counter++;
            if(counter==2){
                newArray[i]=' ';
                counter=0;
                i--;
            } else {
                newArray[i]=array[i];
            }
        }
        return new String(newArray);
    }


    public static String specialCharacter(String str){
        char[] resultCharArray=new char[str.length()];
        char[]  originalCharArray=str.toCharArray();
        for(int i=0;i<str.length();i++) {
            if (originalCharArray[i] == 'a' || originalCharArray[i] == 'A') {
                resultCharArray[i] = '*';
            } else {
                resultCharArray[i] = originalCharArray[i];

            }
        }
            return new String(resultCharArray);

    }

    public static boolean isPalindrome(String str){
        char [] originalString=str.toCharArray();
        for(int i=0 ,j=str.length()-1;i<j;i++,j--){
            if(originalString[i] !=originalString[j]){
                return false;
            }
        }
        return true;
    }
    
    public static String concatenateString(String str,String str2){
        String str3=str.concat(str2);
        return str3;

    }


}

