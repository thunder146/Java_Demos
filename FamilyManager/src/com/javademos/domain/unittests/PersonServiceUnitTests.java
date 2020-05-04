package com.javademos.domain.unittests;

import com.javademos.data.Person;
import com.javademos.domain.PersonService;
import com.javademos.domain.validation.ValidationException;
import com.javademos.domain.validation.ValidatorResult;
import com.javademos.domain.validation.rules.NameNotEmptyValidatorRule;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceUnitTests {
    @Test
    public void createPerson_validData_returnsValidPerson() {
        // arrange
        PersonService personService = new PersonService();

        // act
        Person person1 = null;
        try {
            person1 = personService.createPerson("Tester", "Tom",
                    LocalDate.of(1975,3,6));
        } catch (ValidationException e) {
            e.printStackTrace();
        }

        // assert
        assertNotNull(person1);
    }

    @Test
    public void createPerson_toEarlyBirthDate_validationException() {
        // arrange
        PersonService personService = new PersonService();

        // act
        ValidationException ex = assertThrows(ValidationException.class, () ->  {
            personService.createPerson("Tester", "Tom", LocalDate.of(1000,1,1));
                });

        // assert
        assertNotNull(ex.getValidatorResults());
        assertTrue(ex.getValidatorResults().toArray().length >= 1);
    }

    @Test
    public void createPerson_toAdvancedBirthDate_validationException() {
        // arrange
        PersonService personService = new PersonService();

        // act
        ValidationException ex = assertThrows(ValidationException.class, () ->  {
            personService.createPerson("Tester", "Tom", LocalDate.of(9999,1,1));
        });

        // assert
        assertNotNull(ex.getValidatorResults());
        assertTrue(ex.getValidatorResults().toArray().length >= 1);
    }

    @Test
    public void createPerson_emptyNames_validationException() {
        // arrange
        PersonService personService = new PersonService();

        // act
        ValidationException ex = assertThrows(ValidationException.class, () ->  {
            personService.createPerson("", "", LocalDate.of(2000,1,1));
        });

        // assert
        assertNotNull(ex.getValidatorResults());

        ValidatorResult firstResult = (ValidatorResult)ex.getValidatorResults().toArray()[0];
        assertTrue(firstResult.getFailedRule() == NameNotEmptyValidatorRule.class);

        ValidatorResult secondResult = (ValidatorResult)ex.getValidatorResults().toArray()[1];
        assertTrue(secondResult.getFailedRule() == NameNotEmptyValidatorRule.class);
    }
}
