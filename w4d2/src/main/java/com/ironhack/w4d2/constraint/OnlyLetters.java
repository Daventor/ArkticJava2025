package com.ironhack.w4d2.constraint;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = OnlyLettersValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OnlyLetters {
    String message() default "Can be only letters";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
