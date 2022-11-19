package com.mryenagandula.java8.examples.streams;

import java.util.*;

public class StreamExampleSortFunctionalityMapsTwo {
    public static Map<Integer, Employee> getEmployees(){
        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
        employeeMap.put(101,new Employee(101,"Srikanth","Y",1000.00,"TCS"));
        employeeMap.put(102,new Employee(102,"Harish","D",700.00,"TCS"));
        employeeMap.put(103,new Employee(103,"Raju","D",500.00,"TCS"));
        employeeMap.put(104,new Employee(104,"Naveen","R",500.00,"TCS"));
        employeeMap.put(105,new Employee(105,"Ramu","K",900.00,"TCS"));
        employeeMap.put(106,new Employee(106,"Rakesh","P",750.00,"TCS"));
        employeeMap.put(107,new Employee(107,"Rahul","Ch",880.00,"TCS"));
        employeeMap.put(108,new Employee(108,"Madhan","M",990.00,"TCS"));
        employeeMap.put(109,new Employee(109,"Udhay","H",779.00,"TCS"));
        employeeMap.put(110,new Employee(110,"Saikumar","L",800.00,"TCS"));
        return employeeMap;
    }
    public static void main(String[] args) {
        System.out.println("StreamExampleSortFunctionalityMapsTwo.main");
        Map<Integer, Employee> employeeMap = getEmployees();
        List<Map.Entry<Integer,Employee>> employees = new ArrayList(employeeMap.entrySet());
        System.out.println();
        employees.stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);
        System.out.println();
        employees.stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(System.out::println);
    }
}
