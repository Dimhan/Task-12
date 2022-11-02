package com.epamjavaweb.task10class.taskvalidation.service.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private ValidationException validationException;

    private Validation(ValidatorField validatorField) {

        if (validatorField.getMapErrors() != null && !validatorField.getMapErrors().isEmpty()) {

            validationException = new ValidationException("Errors: ", validatorField.getMapErrors());
        }
    }

    public ValidationException getValidationException() {
        return validationException;
    }

    public static class ValidatorField implements ObjBuilder<Validation> {

        private static final String LOGIN_PATTERN = "([.[^@\\s]]+)@([.[^@\\s]]+)\\.([a-z]+)";
        private static final String PSW_PATTERN = "[\\d]+";

        private static final String STR_LOGIN = "login";
        private static final String STR_PASSWORD = "password";
        private static final String ERROR_MESSAGE = " Incorrect data";

        private static final Pattern LOGIN_VAL_PATTERN = Pattern.compile(LOGIN_PATTERN);
        private static final Pattern PSW_VAL_PATTERN = Pattern.compile(PSW_PATTERN);

        private Map<String, String> mapErrors = new HashMap<>();

        public Map<String, String> getMapErrors() {
            return mapErrors;
        }

        public ValidatorField loginValidator(String userLogin) {

            Matcher matcher = LOGIN_VAL_PATTERN.matcher(userLogin);
            if(userLogin == null || !matcher.matches()) {
                mapErrors.put(STR_LOGIN, ERROR_MESSAGE);
            }
            return  this;
        }

        public ValidatorField passwordValidator(String userPassword) {
            Matcher matcher = PSW_VAL_PATTERN.matcher(userPassword);
            if(userPassword == null || !matcher.matches()) {
                mapErrors.put(STR_PASSWORD, ERROR_MESSAGE);
            };
            return this;
        }

        public Validation build() {
            return new Validation(this);
        }

    }
}