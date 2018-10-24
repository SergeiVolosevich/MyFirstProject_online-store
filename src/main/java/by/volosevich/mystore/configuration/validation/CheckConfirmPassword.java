package by.volosevich.mystore.configuration.validation;

import by.volosevich.mystore.configuration.validation.annotations.ConfirmPassword;
import by.volosevich.mystore.model.Users;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CheckConfirmPassword implements ConstraintValidator<ConfirmPassword, Users> {

    @Override
    public void initialize(ConfirmPassword constraintAnnotation) {

    }

    @Override
    public boolean isValid(Users value, ConstraintValidatorContext context) {
        boolean isValid=value.getPassword().equals(value.getCopyPassword());
        if ( !isValid ) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("{confirmPassword}")
                    .addPropertyNode("copyPassword").addConstraintViolation();
        }
        return isValid;
    }
}
