package com.javademos.domain.validation.rules;

import com.javademos.domain.validation.ValidatorResult;

public class NameNotEmptyValidatorRule implements IValidatorRule{
    private String name;

    public NameNotEmptyValidatorRule(String name){
        this.name = name;
    }

    /**
     * Name must not be empty */
    @Override
    public ValidatorResult Validate() {
        if(name == null || name.length() == 0)
            return new ValidatorResult(false, "Name must not be empty");

        return new ValidatorResult(true,"");
    }
}
