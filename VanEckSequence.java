package com.dsapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 defination problem statement --->
         You start with a number 0 at the first position. Not necessarily you have to start with a 0, but you can use any integer number to start with.
         If you have seen the number at current position before, the next number is the distance between current position and the position where you saw this number before.
         If you haven’t seen this number before, print 0.

 Algorithm to print van eck sequence -->
 step 1 -->
 */

public class VanEckSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Target Number!");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < n; i++) {
            //System.out.println("data -->"+list.get(i));
            int distance = list.subList(0, list.size() - 1).lastIndexOf(list.get(i));
            if (distance == -1) list.add(0);
            else list.add(i - distance);//current element to last element
        }
        System.out.println("list -->" + list);
        sc.close();
    }
}
