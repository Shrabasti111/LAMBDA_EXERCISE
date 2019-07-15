package com.stackroute.lambda;
//contains the getter and setter methods of the Employee fields
public class Employee {
    int age;
    String name, lastname;

    public Employee(int age, String name, String lastname) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString() {
        return this.name + " " + this.lastname + " " + this.age;
    }

}

