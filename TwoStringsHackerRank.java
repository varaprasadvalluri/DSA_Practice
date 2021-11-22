package com.dsapractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoStringsHackerRank {


    public static void main(String[] args) {
        //String s1="and" -> s2 ="art" --> than a is common pair
        //s1="be" And s2 ="cat" --> than there is common char in two strings

//Case 1 :Solution --> 1
        String s1 = "and";
        String s2 = "art";
        Set<Character> aCharSet = new HashSet<>();
        Set<Character> bCharSet = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            aCharSet.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            bCharSet.add(s2.charAt(i));
        }
        aCharSet.retainAll(bCharSet);
        if (aCharSet.size() > 0)
            System.out.println("YES");
        else System.out.println("NO");

        //Approch 2 :
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        boolean[] hash = new boolean[26];
        int a_aci = (int) 'a';//97
        System.out.println(a_aci);
        for (char c : a)
            hash[(int) c - a_aci] = true;
        for (char c : b)
            if (hash[(int) c - a_aci])
                System.out.println("YES");
        System.out.println("NO");
    }
}
