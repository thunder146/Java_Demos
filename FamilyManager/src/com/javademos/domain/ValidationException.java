package com.javademos.domain;

import java.util.List;

public class ValidationException extends Exception{

    private List<ValidatorResult> validatorResults;

    public ValidationException(List<ValidatorResult> validatorResults){

        this.validatorResults = validatorResults;
    }

    public List<ValidatorResult> getValidatorResults() {
        return validatorResults;
    }
}
