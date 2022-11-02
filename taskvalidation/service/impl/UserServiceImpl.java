package com.epamjavaweb.task10class.taskvalidation.service.impl;

import com.epamjavaweb.task10class.taskvalidation.bean.User;
import com.epamjavaweb.task10class.taskvalidation.dao.DAOException;
import com.epamjavaweb.task10class.taskvalidation.dao.DAOFactory;
import com.epamjavaweb.task10class.taskvalidation.dao.UserDAO;
import com.epamjavaweb.task10class.taskvalidation.service.ServiceException;
import com.epamjavaweb.task10class.taskvalidation.service.UserService;
import com.epamjavaweb.task10class.taskvalidation.service.validation.Validation;
import com.epamjavaweb.task10class.taskvalidation.service.validation.ValidationException;

public class UserServiceImpl  implements UserService {

    @Override
    public boolean registration(User user) throws ServiceException {
        boolean checkAction;
        Validation.ValidatorField validatorField = new Validation.ValidatorField();
        Validation validation = validatorField.loginValidator(user.getLogin()).
                                passwordValidator(user.getPassword()).build();
        if(validation.getValidationException() != null) {
            throw new ValidationException();
        }
        try {
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();

            checkAction = userDAO.registration(user);

        } catch (DAOException e) {
            throw new ServiceException(e);
        }


        return checkAction;
    }
}
