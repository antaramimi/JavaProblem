package interview;
//TODO
public class FreqAlphabets {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));

    }

    public static String freqAlphabets(String s) {

        char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
                if (s.charAt(i) == '#') {
                    sb.append(arr[i]);
                }
            }

        return sb.toString();
    }
}
