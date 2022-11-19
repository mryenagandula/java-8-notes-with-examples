package com.mryenagandula.java8.examples.streams.maps_vs_flapmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapExampleOne {
    public static List<User> getUsersList(){
        List<User> users = new ArrayList<User>();
        users.add(new User(101,"Srikanth","Y","test1@gmail.com","test95",Arrays.asList("77777777777","78585229965","775822222222")));
        users.add(new User(102,"Raju","D","test2@gmail.com","test96",Arrays.asList("77887777777","780005229965","7712222222222")));
        users.add(new User(103,"Naveen","R","test3@gmail.com","test97",Arrays.asList("77770007777777","75229965")));
        users.add(new User(104,"Abhinay","G","test4@gmail.com","test98",Arrays.asList("00770007777777","7000229965")));
        users.add(new User(105,"Devraju","T","test5@gmail.com","test99",Arrays.asList("9900770007777777","77000229965")));
        users.add(new User(105,"Sai","L","test6@gmail.com","test100",Arrays.asList("100770007777777","16000229965")));

        return  users;
    }

    public static void main(String[] args) {
        List<User> users = getUsersList();
        // map functionality data transmission it will return stream
        List<String> listOfEmailIds = users.stream().map(User::getEmail).collect(Collectors.toList());
        System.out.println(listOfEmailIds);
        System.out.println();
        users.stream().map(user -> { return  user.getFirstName().toUpperCase()+" "+user.getSecondName().toUpperCase();}).forEach(System.out::println);
        System.out.println();

        // In this case map will return stream of stream
        // e.g. [[77777777777, 78585229965, 775822222222], [77887777777, 780005229965, 7712222222222], [77770007777777, 75229965], [00770007777777, 7000229965], [9900770007777777, 77000229965], [100770007777777, 16000229965]]
        List<List<String>> listOfPhoneNumbers = users.stream().map(user -> user.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(listOfPhoneNumbers);

        System.out.println();

        // Flatmap it will accept stream of stream and return stream
        // e.g. [77777777777, 78585229965, 775822222222, 77887777777, 780005229965, 7712222222222, 77770007777777, 75229965, 00770007777777, 7000229965, 9900770007777777, 77000229965, 100770007777777, 16000229965]
        List<String> listOfPhoneNumbers2= users.stream().flatMap(user -> user.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(listOfPhoneNumbers2);


    }
}
