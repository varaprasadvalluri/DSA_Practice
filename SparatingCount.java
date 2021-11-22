package com.dsapractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SparatingCount {

    public static void main(String[] args) {
        String str = "hello uday ur age is 26 26 and your salary would be 20.0 100.00";
        Matcher stringcount = Pattern.compile("[a-z|A-Z]+\\s").matcher(str);
        Matcher intCout = Pattern.compile("\\d+\\s").matcher(str);
        Matcher doubleCount = Pattern.compile("[0-9]\\.[0-9]+\\s").matcher(str);
        System.out.println(count(doubleCount));
    }

    private static int count(Matcher m) {
        int c = 0;
        while (m.find()) {
            System.out.println("match -->" + m.group());
            c++;
        }
        return c;
    }

}
