package com.mryenagandula.java8.examples.streams;

import java.util.*;

public class StreamExampleSortFunctionalityMaps {

    public static void main(String[] args) {
        Map<String, Integer> numbersMap = new HashMap<String, Integer>();
        numbersMap.put("nine",9);
        numbersMap.put("one",1);
        numbersMap.put("four",4);
        numbersMap.put("five",5);
        numbersMap.put("eight",8);
        numbersMap.put("two",2);
        numbersMap.put("three",3);
        numbersMap.put("six",6);
        numbersMap.put("ten",10);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(numbersMap.entrySet());
        //Using Anonymous
        Collections.sort(entries,new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        entries.forEach((e)->{
            System.out.println(e);
        });

        System.out.println();
        // Using Lambda
        Collections.sort(entries, ((o1, o2) -> o2.getValue() - o1.getValue()));
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println(entry);
        }
        System.out.println();
        //using streams
        List<Map.Entry<String, Integer>> numbers = new ArrayList<>(numbersMap.entrySet());

        //Descending
        numbers.stream().sorted((o1,o2)-> o2.getValue() - o1.getValue()).forEach(System.out::println);
        //Ascending
        System.out.println();
        numbers.stream().sorted((o1,o2)-> o1.getValue() - o2.getValue()).forEach(System.out::println);
        System.out.println();
        numbers.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println();
        numbers.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

    }
}
