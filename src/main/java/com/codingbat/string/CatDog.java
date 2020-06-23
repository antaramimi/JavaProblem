package com.codingbat.string;

public class CatDog {
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'd') {
                if(i < str.length() - 2 && str.charAt(i+1) == 'o' && str.charAt(i+2)=='g'){
                    dogCount++;
                }
            }
            if (str.charAt(i) == 'c') {
                if(i < str.length() - 2 && str.charAt(i+1) == 'a' && str.charAt(i+2)=='t'){
                    catCount++;
                }
            }
        }
        return catCount==dogCount;
    }

    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
    }
}