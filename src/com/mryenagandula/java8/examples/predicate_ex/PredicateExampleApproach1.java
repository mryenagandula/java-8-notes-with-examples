package com.mryenagandula.java8.examples.predicate_ex;

import java.util.function.Predicate;

public class PredicateExampleApproach1 implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if(integer % 2 == 0) //condition for check the number is prime or not.
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        PredicateExampleApproach1 exampleApproach1 = new PredicateExampleApproach1();
        boolean isEven = exampleApproach1.test(33);
        String message =  isEven ? "Even Number" : "Odd Number";
        System.out.println(message);
    }
}
