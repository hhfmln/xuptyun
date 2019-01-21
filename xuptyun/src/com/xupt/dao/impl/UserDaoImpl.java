package com.xupt.dao.impl;

import com.xupt.dao.UserDao;
import com.xupt.util.JDBCUtil;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String username, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //得到链接对象
            conn = JDBCUtil.getConn();

            String sql = "select * from user where user_name=? and user_mima=?";

            //创建ps对象
            ps = conn.prepareStatement(sql);

            ps.setString(1,username);
            ps.setString(2,password);

            //开始执行
            rs = ps.executeQuery();

            //如果能够成功将移到下一条记录,那么表面有这个用户
            return rs.next();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn,ps,rs);
        }

        return false;
    }
}
