package com.dsapractice;

public class PanagramString {
    public static void main(String[] args) {
        String str = "We promptly judged antique ivory buckles for the prize";
        boolean[] hashTable = new boolean[26];
        int ascii = (int) 'a';
        for (int i = 0; i < str.length(); i++) {
//            System.out.println("char -->" + str.charAt(i));
            if (str.charAt(i) != ' ')
                hashTable[(int) Character.toLowerCase(str.charAt(i)) - ascii] = true;
        }
        for (boolean b : hashTable) {
            if (b == false) {
                System.out.println("not a panagram!");
                System.exit(1);
            }
        }
        System.out.println("panagram!");
    }
}
