package com.javademos.domain;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    public ValidatorResult validate(List<IValidatorRule> rules) throws ValidationException {
        List<ValidatorResult> failedResults = new ArrayList<>();

        for (IValidatorRule rule: rules) {
            ValidatorResult result = rule.Validate();

            if(!result.isValid()){
                failedResults.add(result);
            }
        }

        if(!failedResults.isEmpty())
            throw new ValidationException(failedResults);

        return new ValidatorResult(true,"");
    }
}
