package interview;

public class NumberOfStep {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public  static int  numberOfSteps(int num) {
        int result = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num/=2;

            } else {
                num--;
            }
            result++;
        }
        return result;
    }
}