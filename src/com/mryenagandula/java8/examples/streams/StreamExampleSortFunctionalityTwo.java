package com.mryenagandula.java8.examples.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamExampleSortFunctionalityTwo {
    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(101,"Srikanth","Y",5000.00,"TCS"));
        employees.add(new Employee(102,"Raju","D",4000.00,"TCS"));
        employees.add(new Employee(103,"Naveen","R",5000.00,"TCS"));
        employees.add(new Employee(104,"Abhinay","G",6000.00,"TCS"));
        employees.add(new Employee(105,"Rahul","Ch",7000.00,"TCS"));
        employees.add(new Employee(106,"Ramesh","G",9000.00,"TCS"));
        employees.add(new Employee(107,"Ajay","B",6500.00,"TCS"));
        employees.add(new Employee(108,"Devraj","T",3500.00,"TCS"));

        return  employees;
    }
    public static void main(String[] args) {
        System.out.println("StreamExampleSortFunctionalityTwo.main");
        List<Employee> employees = getEmployees();
        System.out.println(employees);
        System.out.println();
        // Anonymous function
        Collections.sort(employees,new MyComparator());
        System.out.println(employees);
        System.out.println();

        // Lambda expression
        // Descending
        Collections.sort(employees, (e1,e2)->(int)(e2.getSalary() - e1.getSalary()));
        System.out.println(employees);
        System.out.println();
        // Ascending
        Collections.sort(employees, (e1,e2)->(int)(e1.getSalary() - e2.getSalary()));
        System.out.println(employees);

        System.out.println();

        // Ascending
        employees.stream().sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).forEach(System.out::println);
        System.out.println();
        // Descending
        employees.stream().sorted((o1, o2) -> (int)(o2.getSalary() - o1.getSalary())).forEach(System.out::println);

        // Using method reference
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        System.out.println();
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }
}
