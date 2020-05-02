package com.javademos.main;

import com.javademos.data.Person;
import com.javademos.domain.PersonService;

public class Main {

    public static void main(String[] args){
        PersonService personService = new PersonService();

        Person person1 = personService.createPerson("Pfeifer", "Igor");

        System.out.println(person1.getName());
    }
}
