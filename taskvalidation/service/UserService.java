package com.epamjavaweb.task10class.taskvalidation.service;

import com.epamjavaweb.task10class.taskvalidation.bean.User;

public interface UserService {
    public boolean registration(User user) throws ServiceException;
}
