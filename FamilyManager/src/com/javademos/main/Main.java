package com.javademos.main;

import com.javademos.data.Person;
import com.javademos.domain.PersonService;
import com.javademos.domain.validation.ValidationException;
import com.javademos.domain.validation.ValidatorResult;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        PersonService personService = new PersonService();

        try {
            Person person1 = personService.createPerson("Tester", "Tonny",
                    LocalDate.of(1975, 2,8));

            System.out.println(person1.toString());
        } catch (ValidationException e) {
            for (ValidatorResult result: e.getValidatorResults()){
                System.out.println(result.getMessage());
            }
        }
    }
}
