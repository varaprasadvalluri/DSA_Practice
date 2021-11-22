package com.practice.dsa.problems;

public class PermitationOfString {
    private void combine() {
        combine(0);
    }

    String inputStr="abc";
    StringBuilder sb = new StringBuilder();

    private void combine(int startIndex) {
        for (int i = startIndex; i < inputStr.length(); ++i) {
            sb.append(inputStr.charAt(i));
            System.out.println(sb);
            if (i < inputStr.length()) {
                combine(i + 1);
            }
            sb.setLength(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        PermitationOfString pf=new PermitationOfString();
        pf.combine();
    }
}
