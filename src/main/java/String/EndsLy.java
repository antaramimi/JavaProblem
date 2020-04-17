package String;

/**
 * Questions:
 * Given a string, return true if it ends in "ly".
 * Examples:
 * endsLy("oddly") → true
 * endsLy("y") → false
 * endsLy("oddy") → false
 */
public class EndsLy {
    public boolean endsLy(String str) {
        if(str.length()>=2){
            String subStrings = str.substring(str.length() - 2,str.length());
            if (subStrings.equals("ly")) {
                return true;
            } else return false;
        } return false;
    }
}
