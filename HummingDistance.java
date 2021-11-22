package com.dsapractice;

public class HummingDistance {
    //Bit manupulation
    public static void main(String[] args) {
        int i = 2, j = 5;
        int distance = Integer.bitCount(i ^ j);
        System.out.println("distance -->" + distance);
    }
}
