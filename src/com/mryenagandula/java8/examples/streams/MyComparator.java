package com.mryenagandula.java8.examples.streams;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // Ascending
        // return (int) (o2.getSalary() - o1.getSalary());
        // Descending
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
