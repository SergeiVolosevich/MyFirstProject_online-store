package by.volosevich.mystore.configuration.validation.annotations;


import by.volosevich.mystore.configuration.validation.CheckConfirmPassword;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CheckConfirmPassword.class)
@Documented
public @interface ConfirmPassword {
    String message() default "{by.volosevich.mystore.configuration.validation.annotations.ConfirmPassword.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
