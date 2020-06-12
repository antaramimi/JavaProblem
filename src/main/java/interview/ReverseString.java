package interview;

public class ReverseString {

    public static void main(String[] args) {
        String name = "Antara id hhj hjjh hjhkoobuhuh";
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
