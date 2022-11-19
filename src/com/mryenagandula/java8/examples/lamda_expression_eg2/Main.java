package com.mryenagandula.java8.examples.lamda_expression_eg2;

import java.util.*;

public class Main {

    public static List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(101,"Srikanth","Y","10th"));
        students.add(new Student(102,"Raju","D","10th"));
        students.add(new Student(103,"Naveen","R","10th"));
        students.add(new Student(104,"Saikumar","L","10th"));
        students.add(new Student(105,"Abhinay","G","10th"));
        students.add(new Student(106,"Devaraju","T","10th"));
        students.add(new Student(107,"Ajay","B","10th"));
        students.add(new Student(108,"Suresh","A","12th"));
        students.add(new Student(109,"Harish","D","10th"));
        students.add(new Student(110,"Venu","B","10th"));
        return  students;
    }

    public static void main(String[] args) {
        List<Student> students = getStudents();
        Main main=new Main();
        //normal approuch
        //main.sortingApprouch1(students);

        //Using anonymous
        //main.sortingApprouch2(students);

        //Using Lamda expression
        main.sortingApprouch3(students);

    }

    public void sortingApprouch1(List<Student> students){
        System.out.println("Main.sortingApprouch1");
        students.forEach(student -> {
            System.out.println(student);
        });
        System.out.println();
        Collections.sort(students,new MyComparator());
        students.stream().forEach(student -> {
            System.out.println(student);
        });
    }

    public void sortingApprouch2(List<Student> students){
        System.out.println("Main.sortingApprouch2");
        students.forEach(student -> {
            System.out.println(student);
        });

        System.out.println();
        Collections.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
        }
    }

    public void sortingApprouch3(List<Student> students){
        System.out.println("Main.sortingApprouch3");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        Collections.sort(students,(o1, o2)-> o2.getFirstName().compareTo(o1.getFirstName()));
        students.forEach(student -> {
            System.out.println(student);
        });
    }
}
