package com.example.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String adderess;

    public User(){
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
        this.adderess = null;
    }

    public User(String name, int age, String phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.adderess = address;
    }

    public String getAdderess() {
        return adderess;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User DefaultUser(){
        return new User("default",0,"010-1111-2222", "서울시 강남구 테헤란로");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adderess='" + adderess + '\'' +
                '}';
    }
}
