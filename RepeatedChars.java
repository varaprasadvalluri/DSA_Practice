package com.dsapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for (char charT : str.toCharArray()) map.put(charT, map.containsKey(charT) ? map.get(charT) + 1 : 1);
        System.out.println("Map traditional--->" + map);

        System.out.println("Map java8 -->" + str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting())));

    }
}
