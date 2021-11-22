package com.dsapractice;

import java.util.Arrays;
import java.util.List;

public class AdjestMatrixAddition {
    public static void main(String[] args) {

        int[][] adjest = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        int k = adjest.length - 1;
        int i = 0, j = 0;
        for (int m = 0; m < adjest.length; m++) {
            for (int n = m; n < adjest.length; n++) {
                System.out.println("m + n -->" + adjest[m][m] + " k -->" + adjest[n][k - n]);
                i += adjest[m][m];
                j += adjest[n][k - n];
                break;
            }
        }
        int diff = i - j;
        System.out.println("i -->" + i + " j -->" + j + " diff -->" + Math.abs(diff));

        //left rotation
        int[] arr = {1, 2, 3, 4, 5};
        int d = 1, p = arr.length - 1;
        for (int l = 0; l < arr.length; l++) {
            if (d <= l)
                arr[l] = arr[d];
            p--;
        }
        System.out.println("arrays --->" + Arrays.toString(arr));
        Runtime.getRuntime().gc();
        Runtime.getRuntime().freeMemory();
        System.out.println("arrays After GC--->" + Arrays.toString(arr));
        //end
    }

    //Hacker rank problem
    public static int diagonalDifference(List<List<Integer>> arr) {
        int k = arr.size() - 1;
        int diff = 0, d = 0;
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).get(i) + " --> " + arr.get(i).get(k - i));
            diff += arr.get(i).get(i);
            d += arr.get(i).get(k - i);
        }
        //int dif=diff-d;
        return Math.abs(diff - d);
    }
}
