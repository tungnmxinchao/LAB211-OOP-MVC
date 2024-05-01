/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;

/**
 *
 * @author TNO
 */
public class Woker {

    private String code;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    public static final String STRING_WORKER = String.format("%-10s %-20s %-20s %-20s "
            + "%-20s %-20s", "Code", "Name", "Age", "Salary", "Date", "Status");

    public Woker() {
    }

    public Woker(String code, String name, int age, double salary, String workLocation) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-20d %-20.0f %-20s\n", code, name, age, salary, workLocation);
    }

}
