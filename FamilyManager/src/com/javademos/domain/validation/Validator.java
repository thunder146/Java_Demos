package com.javademos.domain.validation;

import com.javademos.domain.validation.rules.IValidatorRule;

import java.util.ArrayList;
import java.util.List;

public final class Validator {
    private Validator(){

    }

    public static ValidatorResult validate(List<IValidatorRule> rules) throws ValidationException {
        List<ValidatorResult> failedResults = new ArrayList<>();

        for (IValidatorRule rule: rules) {
            ValidatorResult result = rule.Validate();

            if(!result.isValid()){
                failedResults.add(result);
            }
        }

        if(!failedResults.isEmpty())
            throw new ValidationException(failedResults);

        return new ValidatorResult(true);
    }
}
