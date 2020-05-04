package com.javademos.data;

import java.time.LocalDate;

public class Person extends NamedBase {
    private final String familyName;
    private final String name;
    private LocalDate birthDate;

    public Person(String familyName, String name, LocalDate birthDate) {
        super(name);

        this.familyName = familyName;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getFamilyName() {
        return familyName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
