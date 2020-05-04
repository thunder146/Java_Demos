package com.javademos.domain.validation;

public class ValidatorResult {
    private final boolean isValid;
    private final String message;

    public ValidatorResult(boolean isValid, String message){
        this.isValid = isValid;
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getMessage() {
        return message;
    }
}
