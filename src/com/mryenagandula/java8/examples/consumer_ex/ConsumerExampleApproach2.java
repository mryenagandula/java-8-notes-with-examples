package com.mryenagandula.java8.examples.consumer_ex;

import java.util.function.Consumer;

public class ConsumerExampleApproach2 {
    public static void main(String[] args) {
        System.out.println("ConsumerExampleApproach2.main");
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("value of integer is "+ integer);
            }
        };

        consumer.accept(450);
    }
}
