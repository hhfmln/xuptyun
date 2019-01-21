package com.xupt.dao;

import com.xupt.domain.announcement;

import java.sql.SQLException;
import java.util.List;

public interface announcementDao {

    /*
     * 查询所有公告
     * */
    List<announcement> findAll() throws SQLException;

    /*
    * 添加公告
    * */
    void insert(announcement ann) throws SQLException;

    /*
    * 根据id查询单个公告
    * */
    announcement findAnnouncementById(int announcement_id)throws SQLException;

    /*
    * 更新公告数据
    * */
    void update(announcement ann) throws SQLException;

    /*
    * 删除公告
    * */
    void delete(int onlyid)throws SQLException;
}
