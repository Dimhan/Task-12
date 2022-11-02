package com.epamjavaweb.task10class.taskvalidation.service.validation;

import com.epamjavaweb.task10class.taskvalidation.service.ServiceException;

import java.util.Map;

public class ValidationException extends ServiceException {

    public ValidationException() {
        super();
    }

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(Exception e) {
        super(e);
    }

    public ValidationException(String message, Exception e) {
        super(message, e);
    }

    public ValidationException(String message, Map<String, String> errors) {

        System.out.println(message);

        System.out.println(errors);

    }
}