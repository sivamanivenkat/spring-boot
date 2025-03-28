package com.Venkat.springboot.demo.myapp.entity;

public class Employee {
    private String fname;
    private String lname;
    private int age;
    private int id;

    public Employee(String fname, String lname, int age, int id) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
