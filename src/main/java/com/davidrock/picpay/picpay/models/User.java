package com.davidrock.picpay.picpay.models;

public class User {

    private String Name;
    private String SurName;
    private int Age;

    public User() {
    }

    public User(String name, String surName, int age) {
        Name = name;
        SurName = surName;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
