
package com.programandoando.hamp.daofactory;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String birthDate, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID:   " + getId() + "\n"
                + "Employee Name: " + getFirstName() + " " + getLastName() + "\n"
                + "Birth Date:    " + getBirthDate() + "\n"
                + "Salary:        " +  getSalary();
    }
}
