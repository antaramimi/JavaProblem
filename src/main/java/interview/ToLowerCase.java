package interview;

public class ToLowerCase {
    public static void main(String[] args) {

    }
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public String toLowerCase2(String str){
        StringBuilder sb= new StringBuilder();
        for(int i=0 ;i<str.length();i++){
            sb.append(Character.toLowerCase(str.charAt(i)));
        }
        return sb.toString();
    }

}
