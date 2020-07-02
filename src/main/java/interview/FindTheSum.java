package interview;

public class FindTheSum {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(47862));
    }
    public static int sumOfDigit(int number){
        int result = 0;
        while(number!=0){
            result=result+number%10;
            number=number/10;
        }
        return result;
    }
}
