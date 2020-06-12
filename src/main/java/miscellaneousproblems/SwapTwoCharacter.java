package miscellaneousproblems;

public class SwapTwoCharacter {
    public static void main(String[] args) {
        System.out.println(reverseNumber("Antara",2,4));
    }

    public static String reverseNumber(String str,int a,int b){
        char[] myArray= str.toCharArray();
        char temp;
        temp=myArray[a];
        myArray[a]=myArray[b];
        myArray[b]=temp;
        return new String(myArray);
        }

    }

