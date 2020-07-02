package interview;

/**
 * Write a java program to remove white spaces from string.
 */

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpace("Input String : OneSpace TwoSpaces  ThreeSpaces   FourSpaces Tab End"));
    }

    public static String removeWhiteSpace(String str){
        char[] charArray= str.toCharArray();
        String stringWithoutSpaces="";
        for(int i=0;i<charArray.length;i++){
            if(!(charArray[i] == ' ')){
                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
            }
        }
        return stringWithoutSpaces;
    }
}
