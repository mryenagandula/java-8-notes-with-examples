package com.mryenagandula.java8.examples.streams.parallel_streams;

public class Employee {
    private Integer employeeId;
    private String firstName;
    private String secondName;
    private Double salary;
    private String company;

    public Employee(Integer employeeId, String firstName, String secondName, Double salary, String company) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.company = company;
    }

    public Employee(){}

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }
}
