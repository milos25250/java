package com.company;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person();
	    person.setFirstName("");
	    person.setLastName("");
	    person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("isTeen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("isTeen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());
    }
}
