package com.javademos.domain.validation.rules;

import com.javademos.domain.validation.ValidatorResult;

import java.time.LocalDate;

public class BirthDateValidatorRule implements IValidatorRule{
    private LocalDate birthDate;

    public BirthDateValidatorRule(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    /**
     * Earliest allowed birth date is 01. January 1900
     * Latest allowed birth date is today */
    @Override
    public ValidatorResult Validate() {
        LocalDate earliestAllowed = LocalDate.of(1900,1,1);
        LocalDate latestAllowed = LocalDate.now();

        if(birthDate.compareTo(earliestAllowed) <= -1 || birthDate.compareTo(latestAllowed) >= 1 ){
            return new ValidatorResult(false, "birth date not valid " + birthDate, this.getClass());
        }

        return new ValidatorResult(true);
    }
}
