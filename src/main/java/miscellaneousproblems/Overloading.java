package miscellaneousproblems;

// Java program to demonstrate working of method
// overloading in Java.

public class Overloading {

    // Overloaded sum(). This sum takes two int parameters
    public int sum(int a,int b){
        return (a+b);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int a,int b,int c){
        return a+b+c;
    }

    // Overloaded sum(). This sum takes two double parameters
    public double sum(double a,double b){
        return a+b;
    }


    public static void main(String[] args) {
        Overloading sums =new Overloading();
        System.out.println(sums.sum(10,20));
        System.out.println(sums.sum(10,30,40));
        System.out.println(sums.sum(10.2,50.5));


    }

}
