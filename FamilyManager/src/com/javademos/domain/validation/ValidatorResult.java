package com.javademos.domain.validation;

public class ValidatorResult {
    private final boolean isValid;
    private String message;
    private Class failedRule;

    public ValidatorResult(boolean isValid){
        this.isValid = isValid;
    }

    public ValidatorResult(boolean isValid, String message, Class failedRule){
        this(isValid);
        this.message = message;
        this.failedRule = failedRule;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getMessage() {
        return message;
    }

    public Class getFailedRule() {
        return failedRule;
    }
}
