package interview;

/**
 * Given an integer number n, return the difference between the product of its
 * digits and the sum of its digits.
 */

public class GetTheDigit {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int  subtractProductAndSum(int n) {
        int sum =0;
        int product=1;

        while(n!=0) {
            sum=sum+(n%10);
            product=product*(n%10);
            n=n/10;
        }


        return product-sum;
    }

}

