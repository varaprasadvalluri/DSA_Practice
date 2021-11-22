package com.dsapractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestPositiveInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please eneter the Input --->");
        int n = sc.nextInt();
        int[] A = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            if (i == n) break;
            A[i] = sc.nextInt();

        }
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int j = 1; j <= N + 1; j++) {
            if (!set.contains(j)) {
                System.out.println("output ---->" + j);
                break;
            }
        }
        sc.close();
    }
}
