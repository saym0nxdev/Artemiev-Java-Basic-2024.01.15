package com.icloud.saym0nxdev.person;

public class Person {
    public static String personInfo(String firstName, String lastName, String city, String phoneNumber) {
        return "Call a citizen " + firstName + " " + lastName + " from the city " + city + " by calling " + phoneNumber;
    }


    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));
    }
}