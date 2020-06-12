/**
 * How do you check if a string contains only digits?
 **/

package interview;

public class StringContainInteger {
    public static void main(String[] args)
    {
        System.out.println(isNumber(""));
        System.out.println(isNumber("15445"));
        System.out.println(isNumber("ABc21314"));
        System.out.println(isNumber("101.22"));


    }

    public static boolean isNumber(String  strNum){
        if(strNum==null){
            return false;
        }
        try {
            Integer.parseInt(strNum);
        }catch (NumberFormatException e){
            return false;
        }

        return true;
    }
}
