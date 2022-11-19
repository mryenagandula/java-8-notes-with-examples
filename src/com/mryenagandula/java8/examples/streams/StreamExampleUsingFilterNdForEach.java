package com.mryenagandula.java8.examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* Stream Example For filter and Foreach using objects
*
* */
public class StreamExampleUsingFilterNdForEach {

    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(101,"Srikanth","Y",50000.00,"Self-Employed"));
        employees.add(new Employee(102,"Abhinay","G",50000.00,"Self-Employeed"));
        employees.add(new Employee(103,"Rajkumar","D",90000.00,"Self-Employeed"));
        employees.add(new Employee(104,"Rahul","Ch",100000.00,"Self-Employeed"));
        employees.add(new Employee(105,"Naresh","B",30000.00,"Self-Employeed"));
        employees.add(new Employee(106,"Rakesh","P",70000.00,"Self-Employeed"));
        return employees;
    }
    public static void main(String[] args) {
        System.out.println("StreamExampleUsingFilterNdForEach.main");
        List<Employee> employees = getEmployees();
        employees.stream().forEach(employee -> {
            System.out.println(employee);
        });
        System.out.println();
        employees.stream().filter(employee -> employee.getSalary() > 70000).forEach(employee -> System.out.println(employee));
        System.out.println();
        employees.stream().filter(employee -> employee.getSalary() < 70000).forEach(employee -> System.out.println(employee));
        System.out.println();
        List<Employee> filteredEmployees = employees.stream().filter(employee -> employee.getSalary() < 100000 && employee.getSalary() >80000).collect(Collectors.toList());
        System.out.println(filteredEmployees);
    }
}
