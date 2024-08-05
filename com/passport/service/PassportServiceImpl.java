package com.passport.service;

import com.Model.Passport;
import com.customizedexception.EmployeeException;
import com.passport.dao.PassportDao;
import com.passport.dao.PassportDaoImpl;

public class PassportServiceImpl implements PassportService {
    PassportDao passportDao = new PassportDaoImpl();

    public void addPassport(Passport passport) throws EmployeeException{
        passportDao.addPassport(passport);
    }
    public Passport getPassport(int id)throws EmployeeException {
        return passportDao.getPassport(id);
    }
}