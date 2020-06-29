package miscellaneousproblems;

public class CapitalLetterAfterDot {
    public static void main(String[] args) {
        System.out.println(makeCapitalLetterAfterDot("ram.isagoodboy"));
        System.out.println(makeCapitalLetterAfterDot1("ram.isagoodboy"));


    }

    public static String makeCapitalLetterAfterDot(String str){

        StringBuilder sb =new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                sb.append(Character.toUpperCase(str.charAt(i+1)));
            }
        }
            return sb.toString().trim();
    }

    public static String makeCapitalLetterAfterDot1(String str){

        char[] newCharacter = str.toCharArray();
        for(int i=0;i<newCharacter.length;i++){
            if(newCharacter[i]=='.'){
                newCharacter[i+1]=Character.toUpperCase(newCharacter[i+1]);
            }
        }
        return new String(newCharacter) ;
    }


}
