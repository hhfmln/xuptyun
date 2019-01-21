package com.xupt.dao.impl;

import com.xupt.dao.announcementDao;
import com.xupt.domain.announcement;
import com.xupt.util.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class announcementDaoImpl implements announcementDao{


    /*
    * 查询所有公告
    * */
    @Override
    public List<announcement> findAll() throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        return runner.query("select * from announcement",new BeanListHandler<announcement>(announcement.class));
    }

    /*
    * 添加学生
    * */
    @Override
    public void insert(announcement ann) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());

        runner.update("insert into announcement values(null,?,?,?,?)",
                ann.getAnnouncement_name(),
                ann.getAnnouncement_time(),
                ann.getAnnouncement_content(),
                ann.getGongneng());
    }


    /*
    * 根据id查询单个公告
    * */
    @Override
    public announcement findAnnouncementById(int onlyid) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        return runner.query("select * from announcement where onlyid = ?",new BeanHandler<announcement>(announcement.class),onlyid);
    }

    @Override
    public void update(announcement ann) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        runner.update("update announcement set announcement_name = ?, announcement_time = ?,announcement_content = ? where onlyid = ?",
                ann.getAnnouncement_name(),
                ann.getAnnouncement_time(),
                ann.getAnnouncement_content(),
                ann.getOnlyid()
        );
    }

    @Override
    public void delete(int onlyid) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        runner.update("delete from announcement where onlyid = ?",onlyid);
    }
}
