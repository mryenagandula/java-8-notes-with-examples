package com.mryenagandula.java8.examples.streams.parallel_streams;

import java.util.stream.IntStream;

public class ParallelStreamExampleOne {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        System.out.println("Sequential Stream");
        start = System.currentTimeMillis();
        IntStream.range(0,100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Sequential Stream Taken time in millis - " + (end - start));

        System.out.println();
        System.out.println("Parallel Stream");
        start = System.currentTimeMillis();
        IntStream.range(0,100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Parallel Stream taken time in mills - " + (end - start));

        IntStream.range(0,10).forEach(x->{
            System.out.println("Thread :: " + Thread.currentThread().getName() + " : " + x);
        });

        IntStream.range(0,10).parallel().forEach(x->{
            System.out.println("Thread Parallel :: " + Thread.currentThread().getName() + " : " + x);
        });
    }
}
