package ru.ppakhomkin.udemy.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmail implements ConstraintValidator<Email, String> {

    private String emailSuffix;

    @Override
    public void initialize(Email constraintAnnotation) {
        emailSuffix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.endsWith(emailSuffix);
    }
}
