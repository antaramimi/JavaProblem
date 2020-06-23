package interview;

public class BalancedStringSplit {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRL"));
    }

    public static int balancedStringSplit(String s) {
        int counter = 0;
        String[] arrOfStr = s.split("RL", 2);
        for (String st : arrOfStr) {
            counter++;
        }
        return counter;
    }
}
