package com.concept.java8;

public class Lambda {
    public static void main(String[] args) {

        WebPage webPage=new WebPage() {
            @Override
            public void header(String value) {
                System.out.println("Hi"+ value);
            }
        };
        webPage.header("google");

        WebPage webPage1 = value -> {
            System.out.println("hi"+value);
        };

        webPage1.header("facebook");

        //Single expression lambdas

        NumericTest isEven = (n -> (n%2)==0);
        NumericTest isNegative = (n) -> (n<2);

        System.out.println(isEven.computeTest(4));
        System.out.println(isNegative.computeTest(-5));

        //Block lambdas Concept

        MyString reverseString = (str) -> {
            String result="";

            for(int i=str.length()-1;i>=0;i--)
                result=result+str.charAt(i);
            return result;
        };

        System.out.println(reverseString.myStyringFunction("Hello"));


    }



}
