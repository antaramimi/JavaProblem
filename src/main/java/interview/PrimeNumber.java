package interview;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNumber();
        printPrimeNumber();
    }

    public static void primeNumber() {
        int number = 3;
        int temp = 0;

        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                temp += 1;
            }
        }
        if (temp > 0) {
            System.out.println("number is not prime");
        } else {
            System.out.println("number is prime");
        }
    }

    public static void printPrimeNumber() {
        for(int number=2;number<=50;number++){
            boolean isPrime = true;
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(number);
            }
        }
    }
}