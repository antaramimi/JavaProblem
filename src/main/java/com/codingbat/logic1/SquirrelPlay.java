package com.codingbat.logic1;

public class SquirrelPlay {
    public static void main(String[] args) {

    }


    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }
}