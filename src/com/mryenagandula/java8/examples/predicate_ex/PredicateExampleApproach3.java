package com.mryenagandula.java8.examples.predicate_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExampleApproach3 {
    public static void main(String[] args) {
        System.out.println("PredicateExampleApproach3.main");
        Predicate<Integer> predicate = ( integer -> integer % 2 == 0 );
        boolean isEven = predicate.test(99);
        String message = isEven ? "Even Number" : "Odd Number";
        System.out.println(message);

        List<Integer> integers = Arrays.asList(1,89,7,66,45,77,325,45,88);
        integers.stream().filter(predicate).forEach(value->{
            System.out.println("value is " + value);
        });

        List<Integer> integerList = Arrays.asList(88,96,75,66,33,22,11,99,45,65);
        integerList.stream().filter(v -> v % 2 != 0).forEach(v -> System.out.println(v));
    }
}
