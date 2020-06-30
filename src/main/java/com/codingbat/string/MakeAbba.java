package com.codingbat.string;

/**
 * Question:
 * Given two strings, a and b, return the result of putting them together in the order abba,
 * e.g. "Hi" and "Bye" returns "HiByeByeHi".
 * Examples:
 * makeAbba("Hi", "Bye") → "HiByeByeHi"
 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 * makeAbba("What", "Up") → "WhatUpUpWhat"
 */
public class MakeAbba {
    public String makeAbba(String a, String b) {

        return a + b + b + a;
    }
}