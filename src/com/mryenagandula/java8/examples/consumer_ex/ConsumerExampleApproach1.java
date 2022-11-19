package com.mryenagandula.java8.examples.consumer_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleApproach1 implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }

    public static void main(String[] args) {
        ConsumerExampleApproach1 exampleApproach1 = new ConsumerExampleApproach1();
        exampleApproach1.accept(20);
    }
}
