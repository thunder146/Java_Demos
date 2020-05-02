package com.javademos.domain;

import com.javademos.data.Person;

public class PersonService {

    public Person createPerson(String familyName, String name)
    {
        return new Person(familyName, name);
    }
}
