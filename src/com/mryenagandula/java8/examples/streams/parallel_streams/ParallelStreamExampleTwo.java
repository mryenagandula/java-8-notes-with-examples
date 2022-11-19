package com.mryenagandula.java8.examples.streams.parallel_streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExampleTwo {

    public static void main(String[] args) {
        System.out.println("ParallelStreamExampleTwo.main");
        long start = 0;
        long end = 0;

        List<Employee> employees = new ArrayList<Employee>();
        for (int i = 100; i < 205; i++) {
            employees.add(new Employee(i,"Emp"+i,"Emp"+i,100.00*i ,"TCS"));
        }

        start =System.currentTimeMillis();
        Double averageSalary = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Time taken for normal stream is ::" + (end - start));

        System.out.println(averageSalary);

        start= System.currentTimeMillis();
        Double averageSalary2 = employees.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("Time taken for parallel stream is ::" + (end - start));
        System.out.println(averageSalary2);

    }
}
