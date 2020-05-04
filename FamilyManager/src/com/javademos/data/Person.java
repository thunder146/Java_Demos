package com.javademos.data;

public class Person extends NamedBase {
    private final String familyName;
    private final String name;
    private final int age;

    public Person(String familyName, String name, int age) {
        // TODO call super instead of setName(...)
        this.familyName = familyName;
        this.name = name;
        this.age = age;

        setName(name);
    }

    public int getAge() {
        return age;
    }

    public String getFamilyName() {
        return familyName;
    }
}
