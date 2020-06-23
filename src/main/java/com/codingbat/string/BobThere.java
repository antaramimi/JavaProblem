package com.codingbat.string;

public class BobThere {
    public boolean bobThere(String str) {
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='b'){
                if(i<str.length()-2&& str.charAt(i+2)=='b'){
                    return true;
                }
            }
        }return false;
    }

}
