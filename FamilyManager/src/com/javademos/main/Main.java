package com.javademos.main;

import com.javademos.data.Person;
import com.javademos.domain.PersonService;
import com.javademos.domain.ValidationException;
import com.javademos.domain.ValidatorResult;

public class Main {

    public static void main(String[] args){
        PersonService personService = new PersonService();

        Person person1 = null;
        try {
            person1 = personService.createPerson("Pfeifer", "Igor",999);

            System.out.println(person1.getName());
        } catch (ValidationException e) {
            for (ValidatorResult result: e.getValidatorResults()){
                System.out.println(result.getMessage());
            }
        }
    }
}
