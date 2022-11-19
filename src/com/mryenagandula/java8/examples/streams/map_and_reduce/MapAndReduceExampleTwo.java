package com.mryenagandula.java8.examples.streams.map_and_reduce;

import java.util.ArrayList;
import java.util.List;

public class MapAndReduceExampleTwo {
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
        System.out.println("MapAndReduceExampleTwo.main");
        List<Employee> employees = getEmployees();
        Double averageSalary = employees.stream()
                                .filter((e)-> e.getCompany().equalsIgnoreCase("TCS"))
                                .map(Employee::getSalary)
                                .mapToDouble(i->i)
                                .average()
                                .getAsDouble();
        System.out.println("Average Salary - " + averageSalary);
        Double highestSalary = employees.stream()
                .filter(e-> e.getCompany().equalsIgnoreCase("TCS"))
                .map(Employee::getSalary)
                .reduce(0.0,(e1,e2)-> e1 > e2 ? e1 : e2);
        System.out.println("Highest Salary - " + highestSalary);

        Double sumSalary = employees.stream()
                 .filter(e-> e.getCompany().equalsIgnoreCase("TCS"))
                 .map(Employee::getSalary)
                 .mapToDouble(i->i).sum();
        System.out.println("Salary Sum - " + sumSalary);

    }
}
