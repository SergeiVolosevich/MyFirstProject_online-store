package by.volosevich.mystore.configuration.validation.annotations;


import by.volosevich.mystore.configuration.validation.CheckDuplicateUserName;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD, METHOD, PARAMETER, ANNOTATION_TYPE, TYPE_USE })
@Retention(RUNTIME)
@Constraint(validatedBy = CheckDuplicateUserName.class)
@Documented
@Repeatable(DuplicateUserName.List.class)

public @interface DuplicateUserName {
    String message() default "{by.volosevich.mystore.configuration.validation.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    @Target({ FIELD, METHOD, PARAMETER, ANNOTATION_TYPE })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        DuplicateUserName[] value();
    }

}
