package com.mryenagandula.java8.examples.streams;

import java.util.*;
import java.util.function.Predicate;

/*
* Streams in Java
* - Stream API is used to process collections of objects
*   A Stream is a sequence fo objects that supports various methods which
*   Can be pipelined to produce the desired result.
* - Stream is not a data structure instead it takes input from the Collections,
*   Arrays or I/O Channels
* - Stream don't change the original data structure, they only provide the results
*   As per pipelined methods.
*
*   Why we need stream ?
*   - Functional Programming
*   - Code reduce
*   - Bulk Operation
*
*   Methods
*   - Filter (Predicate Functional Interface)
*   - Foreach (Consumer Functional Interface)
* */
public class StreamExample {
    public static List<String> getNames(){
        List<String> names= new ArrayList<String>();
        names.add("Srikanth");
        names.add("Raju");
        names.add("Saikumar");
        names.add("Abhinaly");
        names.add("Devraj");
        names.add("Naresh");
        names.add("Krishna");
        names.add("Harish");
        names.add("Ajay");

        return names;
    }

    public static Map<Integer, String> getNamesMap(){
        Map<Integer, String> namesMap = new LinkedHashMap<>();
        namesMap.put(101,"Srikanth");
        namesMap.put(102,"Naveen");
        namesMap.put(103,"Rajkumar");
        namesMap.put(104,"Suresh");
        namesMap.put(105,"Dinesh");
        namesMap.put(106,"Rahul");
        namesMap.put(107,"Ramu");

        return namesMap;
    }
    public static void main(String[] args) {
        System.out.println("StreamExample.main");
        List<String> names= getNames();
        Map<Integer, String> namesMap = getNamesMap();

        /* Fetching data from list / map */
        names.forEach(name -> System.out.println(name));
        System.out.println();
        names.stream().forEach((name)-> System.out.println(name));

        System.out.println();

        namesMap.forEach((key,value)-> System.out.println(key + " : " + value));
        System.out.println();
        namesMap.entrySet().stream().forEach(value-> System.out.println(value));

        System.out.println();
        /* Filtering data from list / map */
        for (String name : names){
            if(name.toUpperCase().startsWith("S")){
                System.out.println(name);
            }
        }

        Predicate<String> predicate =  (name) -> name.toUpperCase().startsWith("A");
        System.out.println();
        names.stream().filter(predicate).forEach(value-> System.out.println(value));
        System.out.println();
        Set<Map.Entry<Integer, String>> set = namesMap.entrySet();
        for (Map.Entry<Integer, String> entry: set){
            if(entry.getKey() % 2 == 0) {
                System.out.println(entry);
            }
        }
        System.out.println();
        namesMap.entrySet().stream().filter((item)-> item.getKey() % 2 != 0).forEach(value-> System.out.println(value));
    }
}
