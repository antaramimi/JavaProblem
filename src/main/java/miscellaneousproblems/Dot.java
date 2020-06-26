package miscellaneousproblems;


public class Dot {
    public static void main(String[] args) {
        System.out.println(addDot("Rams"));
    }

    public static String addDot(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i)).append(".");
        }

        return sb.toString();
    }

}
