package String;

public class NTwice {
    public String nTwice(String str, int n) {
        String newString =str.substring(0,n)+ str.substring(str.length() - n);
        return newString;

    }

}
