package Interview;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);


        for (int i = 0; i < 10; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        System.out.println("*************");
        fibonacciSeries();

    }
        public static void fibonacciSeries(){
        int[] result=new int[100];
        result[0]=0;
        result[1]=1;

        for(int i=2;i<10;i++){
            result[i]=result[i-1]+result[i-2];
        }


            for(int i=0;i<10;i++){
                System.out.println(result[i]+"");
            }



        }

    }

