package com.javademos.domain;

import com.javademos.data.Person;
import com.javademos.domain.validation.IValidatorRule;
import com.javademos.domain.validation.PersonAgeValidatorRule;
import com.javademos.domain.validation.ValidationException;
import com.javademos.domain.validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public Person createPerson(String familyName, String name, int age) throws ValidationException {

        List<IValidatorRule> rules = new ArrayList<>();
        rules.add(new PersonAgeValidatorRule(age));

        Validator validator = new Validator();
        validator.validate(rules);

        return new Person(familyName, name, age);
    }
}
