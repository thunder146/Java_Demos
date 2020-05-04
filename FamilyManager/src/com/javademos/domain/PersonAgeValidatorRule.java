package com.javademos.domain;

public class PersonAgeValidatorRule implements IValidatorRule{
    private int age;

    public PersonAgeValidatorRule(int age){
        this.age = age;
    }

    @Override
    public ValidatorResult Validate() {
        if(age >= 0 && age <=150){
            return new ValidatorResult(true, "");
        }
        else{
            return new ValidatorResult(false, "age not valid " + age);
        }
    }
}
