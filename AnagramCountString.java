package com.dsapractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class AnagramCountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("input -->" + input);
        int length = input.length() / 2;
        String subStr1 = input.substring(0, length);
        String subStr2 = input.substring(length, input.length());
        System.out.println("length -->" + length);
        if (subStr1.length() != subStr2.length()) {
            System.out.println("-1");
            return;
        } else {
            System.out.println("substring -->" + subStr1 + " substr2 -->" + subStr2);
            int count = 0;
            for (int i = 0; i < subStr1.length(); i++) {
                int c = subStr2.indexOf(subStr1.charAt(i));
                System.out.println("c -->" + c);
                if (c == -1) {
                    count++;
                } else {
                    subStr2 = subStr2.substring(0, c) + subStr2.substring(c + 1);
                    System.out.println("index of -->" + c + " substring after replace --->" + subStr2.substring(0, c) + "--->" + subStr2.substring(c + 1));
                }
            }
            System.out.println("count -->" + count);
        }
        sc.close();
    }
}
