package com.epamjavaweb.task10class.taskvalidation.dao;

import com.epamjavaweb.task10class.taskvalidation.bean.User;

public interface UserDAO {
    public boolean registration(User user) throws DAOException;
}
