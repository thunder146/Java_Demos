package com.javademos.main;

import com.javademos.data.Family;
import com.javademos.data.Person;
import com.javademos.domain.FamilyService;
import com.javademos.domain.PersonService;
import com.javademos.domain.validation.ValidationException;
import com.javademos.domain.validation.ValidatorResult;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        PersonService personService = new PersonService();
        FamilyService familyService = new FamilyService();

        try {
            Person person1 = personService.createPerson("Tester", "Tonny",
                    LocalDate.of(1975, 2,8));
            Person person2 = personService.createPerson("Bauer", "Boris",
                    LocalDate.of(1953, 8,12));

            Family family1 = familyService.createFamily("Tester");

            familyService.addMember(family1, person1);
            familyService.addMember(family1, person2);

            System.out.println(person1.toString());
            System.out.println(family1.toString());
        } catch (ValidationException e) {
            for (ValidatorResult result: e.getValidatorResults()){
                System.out.println(result.getMessage());
            }
        }
    }
}
