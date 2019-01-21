package com.xupt.service.impl;

import com.xupt.dao.UserDao;
import com.xupt.dao.impl.UserDaoImpl;
import com.xupt.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String username, String password) throws SQLException {
        UserDao dao = new UserDaoImpl();
        dao.login(username,password);
        return false;
    }
}
