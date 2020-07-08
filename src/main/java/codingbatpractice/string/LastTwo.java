package codingbatpractice.string;

public class LastTwo {
    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
    }
        public static String lastTwo(String str) {
            String newString = "";
        String  newString2 = "";
        String newString3="";
        if(str.length()<2){
            return str;
        }
        if (str.length() >= 2) {
            newString2= str.substring(str.length() - 1);
            System.out.println(newString2);
            newString3 =str.substring(str.length()-2,str.length()-1);
            System.out.println(newString3);
            newString=newString+newString2+newString3;
            System.out.println(newString);




        }
        return newString;
    }
}