package com.javademos.main;

import com.javademos.data.Person;
import com.javademos.domain.PersonService;
import com.javademos.domain.validation.ValidationException;
import com.javademos.domain.validation.ValidatorResult;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        PersonService personService = new PersonService();

        Person person1 = null;
        try {
            person1 = personService.createPerson("Pfeifer", "Igor", LocalDate.of(1988,7,11));

            System.out.println(person1.getName() + " is born on " + person1.getBirthDate());
        } catch (ValidationException e) {
            for (ValidatorResult result: e.getValidatorResults()){
                System.out.println(result.getMessage());
            }
        }
    }
}
