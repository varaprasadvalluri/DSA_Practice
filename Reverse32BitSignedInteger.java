package com.dsapractice;

public class Reverse32BitSignedInteger {
    public static void main(String[] args) {
        long x = -1234;
        System.out.println("reverse -->" + reverse((int) x));
    }

    static int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE ? 0 : (int) reverse;
    }
}
