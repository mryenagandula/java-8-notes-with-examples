package com.mryenagandula.java8.examples.streams.map_and_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceExampleOne {
    public static void main(String[] args) {
        System.out.println("MapAndReduceExampleOne.main");
        List<Integer> numbersList = Arrays.asList(1,2,9,72,35,48,68,94,12);
        Integer sum = 0;
        for (Integer number: numbersList){
            sum =  sum + number;
        }
        System.out.println("Sum of all the numbers "+sum);

        Integer sumOfNumbers = numbersList.stream().mapToInt(i -> i).sum();
        System.out.println(sumOfNumbers);

        Integer sumOfNumbers2 =  numbersList.stream().reduce(0,(a, b)-> a + b);
        System.out.println(sumOfNumbers2);

        Integer sumOfNumbers3 = numbersList.stream().reduce(Integer::sum).get(); //It will give you optional value
        System.out.println(sumOfNumbers3);

        Optional<Integer> maxNumber = numbersList.stream().reduce(Integer::max);
        System.out.println(maxNumber.get());

        Integer maxNumber2 = numbersList.stream().reduce(0,(a,b)-> a > b ? a : b);
        System.out.println(maxNumber2);

        Integer minNumber = numbersList.stream().reduce(1,(a,b)-> a<b ? a : b);
        System.out.println(minNumber);

        Integer minNumber2 = numbersList.stream().reduce(Integer::min).get();
        System.out.println(minNumber2);

        Integer mulNumbers = numbersList.stream().reduce(1,(a,b) -> a * b);
        System.out.println(mulNumbers);

        List<String> listOfStrings = Arrays.asList("Core Java","Advance Java","Spring","Spring Boot","Micro Services","Hibername","Oracle");
        String longestString = listOfStrings.stream().reduce((a, b)-> a.length() > b.length() ? a : b).get();
        System.out.println(longestString);
        String lowestString = listOfStrings.stream().reduce((a,b)-> a.length() < b.length() ? a : b).get();
        System.out.println(lowestString);
    }
}
