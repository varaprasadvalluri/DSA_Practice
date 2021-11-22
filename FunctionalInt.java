package com.practice.dsa.problems;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionalInt {

    static Function<Integer, Integer> process = input -> input + 1;//

    public static void main(String[] args) {
        System.out.println("process -->" + process.apply(1));//op -->2
        //Infy

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(2).map(t -> t[0]).forEach(x -> System.out.println(x));
    }

    //private static interface
}
