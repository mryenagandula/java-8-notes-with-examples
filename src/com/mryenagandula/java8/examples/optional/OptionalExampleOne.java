package com.mryenagandula.java8.examples.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExampleOne {
    public static List<User> getUsersList(){
        List<User> users = new ArrayList<User>();
        users.add(new User(101,"Srikanth","Y","test1@gmail.com","test95",Arrays.asList("77777777777","78585229965","775822222222")));
        users.add(new User(102,"Raju","D","test2@gmail.com","test96",Arrays.asList("77887777777","780005229965","7712222222222")));
        users.add(new User(103,"Naveen","R","test3@gmail.com","test97",Arrays.asList("77770007777777","75229965")));
        users.add(new User(104,"Abhinay","G","test4@gmail.com","test98",Arrays.asList("00770007777777","7000229965")));
        users.add(new User(105,"Devraju","T","test5@gmail.com","test99",Arrays.asList("9900770007777777","77000229965")));
        users.add(new User(105,"Sai","L","test6@gmail.com","test100",Arrays.asList("100770007777777","16000229965")));
        return users;
    }
    public static User getUsersListByEmailId(String emailId) throws Exception {
        List<User> users = getUsersList();
        return users.stream()
                    .filter(user -> user.getEmail().equalsIgnoreCase(emailId))
                    .findAny()
                    .orElseThrow(()-> new Exception("no user found with this email"));
    }

    public static void main(String[] args) throws Exception {
        User user = new User(101,"Srikanth","Y",null,"test95",Arrays.asList("77777777777","78585229965","775822222222"));
        Optional optional = Optional.empty();
        System.out.println(optional);

        Optional<String> emailOptional1 = Optional.ofNullable(user.getEmail());
        if(emailOptional1.isPresent()){
            System.out.println(emailOptional1.get());
        }
        //System.out.println(emailOptional1.orElse("default@gmail.com"));
        //System.out.println(emailOptional1.get());
        //System.out.println(emailOptional1.orElseGet(()-> "default@gmail.com"));
        //System.out.println(emailOptional1.orElseThrow(()->new IllegalArgumentException("Email id not found")));
        System.out.println(emailOptional1.map(String::toUpperCase).orElse("default@gmail.com"));
        //Optional<String> emailOptional2 = Optional.of(user.getEmail());
        //System.out.println(emailOptional2);
        System.out.println(getUsersListByEmailId("test1@gmail.com"));
        System.out.println(getUsersListByEmailId("pqr"));

    }
}
