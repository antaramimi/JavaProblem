package interview;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 */

public class DefangIPaddr {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char[] ch = address.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }

}
