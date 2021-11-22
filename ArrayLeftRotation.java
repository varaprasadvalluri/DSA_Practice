package com.dsapractice;

import java.util.*;

public class ArrayLeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        d = d % arr.size();
        arr.addAll(arr);
        return arr.subList(d, d + arr.size() / 2);
    }

    //divisors or number polidrom
    int numberReverse(int number) {
        int rev = 0;
        return rev;
    }

    //
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);//7)8(1 ->reminder - 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many rotation need -->");
        int d = sc.nextInt();
//Algo// rotate left by n number and re-adjest other elments
        List<Integer> copyOfArray = new ArrayList<>(arrayList);//copy becoz of array Object
        for (int i = 0; i < d; i++) { //-->1 7*1 =7, 7*2=14 same results
            copyOfArray.add(copyOfArray.remove(0));//remove the first index at each time
        }
        //TODO:Collections.rotate(arrayList, d);//this is one way but not efficent
        //  rotationArray.addAll(copyOfArray);
        System.out.println("rotationArray -->" + copyOfArray);
    }
}
