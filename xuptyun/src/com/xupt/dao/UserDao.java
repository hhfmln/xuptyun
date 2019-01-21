package com.xupt.dao;

import java.sql.SQLException;

public interface UserDao {

    /*
    * 登录的方法
    * */
    boolean login (String username,String password);
}
