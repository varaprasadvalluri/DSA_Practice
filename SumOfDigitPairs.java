package com.dsapractice;

import java.util.*;

public class SumOfDigitPairs {

    public static void main(String[] args) {
        System.out.println(" GrestestSum -->"+gretestNumWithDouble(99));
        int[] inputA = {42, 33, 60};
        System.out.println(" MaxSum -->" + getMaxPairWithOptimized(inputA));
        List<Integer> list = null;
        Map<Integer, List<Integer>> equalSumList = new HashMap<>();
        for (int i = 0; i < inputA.length; i++) {
            int sumKey = sumOfNumber(inputA[i]);
            System.out.println("digitSum -->" + sumKey);
            if (equalSumList.containsKey(sumKey)) {
                equalSumList.get(sumKey).add(inputA[i]);
            } else {
                System.out.println("else --");
                list = new ArrayList<>();
                list.add(inputA[i]);
                equalSumList.put(sumKey, list);
            }

        }
        //return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0: (int) res;
        //what is sum is equals and data is max
        int maxSum = 0;
        for (Map.Entry<Integer, List<Integer>> index : equalSumList.entrySet()) {
            List<Integer> sumList = index.getValue();
            if (!sumList.isEmpty() && sumList.size() > 1) {
                int k = sumList.size() - 1;
                for (int i = 0; i < sumList.size() - 1; i++) {
                    // System.out.println("--> " + sumList.get(i) + "" + sumList.get(k));
                    maxSum = Math.max(maxSum, sumList.get(i) + sumList.get(k));
                    k--;
                }
            } else {
                System.out.println("-1");
            }
            // System.out.println("key -->" + index.getKey() + " va -->" + index.getValue() + " max sum -->" + maxSum);
        }


//    }
        // System.out.println("Arrays -->"+Arrays.toString(inputB));
    }

    static int getMaxPairWithOptimized(int[] arr) {
        Map<Integer, Integer> mapSum = new HashMap<>();
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            int dsum = sumOfNumber(arr[i]);
            Integer num = mapSum.get(dsum);
            if (num != null) {
                if (arr[num] < arr[i])
                    mapSum.put(dsum, i);
                max = Math.max(max, arr[num] + arr[i]);
            } else mapSum.put(dsum, i);
        }
        return max;
    }

    static int gretestNumWithDouble(int n) {
        int dsum = sumOfNumber(n);
        dsum += dsum;
        int te = 1;
        while (te > 0) {
            te = sumOfNumber(++n);
            if (te == dsum)
                return n;
        }
        return -1;
    }

    static int sumOfNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
    }
}
