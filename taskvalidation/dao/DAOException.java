package com.epamjavaweb.task10class.taskvalidation.dao;

public class DAOException extends Exception{

    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
        System.out.println(message);
    }

    public DAOException(Exception e) {
        super(e);
    }

    public DAOException(String message, Exception e) {
        super(message, e);
    }
}

