package com.mryenagandula.java8.examples.lamda_expression_eg2;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //Ascending
        //return o1.getFirstName().compareTo(o2.getFirstName());
        //Descending
        return o2.getFirstName().compareTo(o1.getFirstName());
    }
}
