package pl.cz.shop.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pl.cz.shop.dto.UserDto;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {

        return UserDto.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        UserDto userDto = (UserDto) object;

        if(userDto.getEmail() == null || userDto.getEmail().isEmpty()){
            errors.rejectValue("email", null, "email should not be empty");
        }
        //prawidlowy email

        //haslo (min 3 znakow)

        //haslo == powtorzone haslo

        //    errors.rejectValue("password", null, "passwords are different");

    }
}
