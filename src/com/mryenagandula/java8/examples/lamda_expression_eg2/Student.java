package com.mryenagandula.java8.examples.lamda_expression_eg2;

public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private String standard;

    public Student(int id, String firstName, String secondName, String standard) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.standard = standard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", standard='" + standard + '\'' +
                '}';
    }
}
