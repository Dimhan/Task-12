package com.epamjavaweb.task10class.taskvalidation.dao.impl;

import com.epamjavaweb.task10class.taskvalidation.bean.User;
import com.epamjavaweb.task10class.taskvalidation.dao.DAOException;
import com.epamjavaweb.task10class.taskvalidation.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean registration(User user) throws DAOException {
        return true;
    }

}
