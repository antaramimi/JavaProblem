package interview;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzbuzz(77);
    }
    public static int fizzbuzz(int num){
        if((num%3==0) && (num%5==0)){
            System.out.println("fizzBuzz");
        }else if(num%3==0){
            System.out.println("fizz");
        }else if (num%5==0){
            System.out.println("buzz");
        }
        return num;
    }
}
