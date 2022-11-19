package com.mryenagandula.java8.examples.predicate_ex;

import java.util.function.Predicate;

public class PredicateExampleApproach2 {

    public static void main(String[] args) {
        System.out.println("PredicateExampleApprouch2.main");
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer % 2 == 0){
                    return true;
                }
                else {
                    return false;
                }
            }
        };

        boolean isEven = predicate.test(25);
        String message = isEven ? "Even Number" : "Odd Number";
        System.out.println(message);
    }
}
