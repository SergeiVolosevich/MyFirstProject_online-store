package by.volosevich.mystore.configuration.validation;

import by.volosevich.mystore.configuration.validation.annotations.DuplicateUserName;
import by.volosevich.mystore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckDuplicateUserName implements ConstraintValidator<DuplicateUserName, String> {

    @Autowired
    UserService userService;

    @Override
    public void initialize(DuplicateUserName constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean isValid=false;
        if (userService.sizeOfListUsernames(value)==0){
            return isValid=true;
        }
        else{
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("{duplicate.username}")
                    .addConstraintViolation();
        }
        return isValid;
    }
}
