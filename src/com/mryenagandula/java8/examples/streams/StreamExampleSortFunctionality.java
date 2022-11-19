package com.mryenagandula.java8.examples.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamExampleSortFunctionality {
    public static void main(String[] args) {
        System.out.println("StreamExampleSortFunctionality.main");
        List<Integer> listOfNumbers= new ArrayList<Integer>();
        listOfNumbers.add(5);
        listOfNumbers.add(6);
        listOfNumbers.add(40);
        listOfNumbers.add(31);
        listOfNumbers.add(45);
        listOfNumbers.add(7);
        listOfNumbers.add(19);
        listOfNumbers.add(59);
        listOfNumbers.add(19);

        //Ascending
        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);
        System.out.println();
        //Descending
        Collections.reverse(listOfNumbers);
        System.out.println(listOfNumbers);

        System.out.println();
        //Ascending
        listOfNumbers.stream().sorted().forEach(number -> System.out.println(number));
        System.out.println();
        //Descending
        listOfNumbers.stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.println(number));
    }
}
