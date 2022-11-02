package com.epamjavaweb.task10class.taskvalidation.main;

import com.epamjavaweb.task10class.taskvalidation.bean.User;
import com.epamjavaweb.task10class.taskvalidation.service.ServiceException;
import com.epamjavaweb.task10class.taskvalidation.service.ServiceFactory;
import com.epamjavaweb.task10class.taskvalidation.service.UserService;

public class Main {
    public static void main(String[] args) throws ServiceException {

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();
        User user1 = new User("user@Login.com", "789456123");
        userService.registration(user1);
    }
}
