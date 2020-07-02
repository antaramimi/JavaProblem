package interview;

public class Demo {

        static void staticMethod()
        {
            System.out.println("Static Method");
        }
    }

    class MainClass
    {
        public static void main(String[] args)
        {
           Demo a = null;

            a.staticMethod();
        }
    }

