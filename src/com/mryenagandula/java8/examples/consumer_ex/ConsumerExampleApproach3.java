package com.mryenagandula.java8.examples.consumer_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleApproach3 {
    public static void main(String[] args) {
        System.out.println("ConsumerExampleApproach3.main");
        Consumer<Integer> consumer = (integer)-> System.out.println(integer);
        consumer.accept(59);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.forEach(consumer);

        List<Integer> numbers2 = Arrays.asList(20,30,40,50,60);
        // number -> System.out.println("printing:: " + number (consumer syntax);
        numbers2.forEach(number -> System.out.println("printing:: " + number));
    }
}
