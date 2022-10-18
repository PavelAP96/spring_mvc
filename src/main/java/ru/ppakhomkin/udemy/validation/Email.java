package ru.ppakhomkin.udemy.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmail.class)
public @interface Email {
    public String value() default "mail.ru";

    public String message() default "Not correct email";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
