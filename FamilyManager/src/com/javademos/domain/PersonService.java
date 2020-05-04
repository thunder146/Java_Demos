package com.javademos.domain;

import com.javademos.data.Person;
import com.javademos.domain.validation.rules.IValidatorRule;
import com.javademos.domain.validation.rules.BirthDateValidatorRule;
import com.javademos.domain.validation.ValidationException;
import com.javademos.domain.validation.Validator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public Person createPerson(String familyName, String name, LocalDate birthDate) throws ValidationException {

        List<IValidatorRule> rules = new ArrayList<>();
        rules.add(new BirthDateValidatorRule(birthDate));

        Validator.validate(rules);

        return new Person(familyName, name, birthDate);
    }
}