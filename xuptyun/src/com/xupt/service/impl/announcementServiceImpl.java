package com.xupt.service.impl;

import com.xupt.dao.impl.announcementDaoImpl;
import com.xupt.domain.announcement;
import com.xupt.dao.announcementDao;
import com.xupt.service.announcementService;

import java.sql.SQLException;
import java.util.List;

public class announcementServiceImpl implements announcementService{


    @Override
    public List<announcement> findAll() throws SQLException {
        announcementDao dao = new announcementDaoImpl();
        return dao.findAll();
    }

    @Override
    public void insert(announcement ann) throws SQLException {
        announcementDao dao = new announcementDaoImpl();
        dao.insert(ann);
    }

    @Override
    public announcement findAnnouncementById(int announcement_id) throws SQLException {
        announcementDao dao = new announcementDaoImpl();
        return dao.findAnnouncementById(announcement_id);
    }

    @Override
    public void update(announcement ann) throws SQLException {
        announcementDao dao = new announcementDaoImpl();
        dao.update(ann);
    }

    @Override
    public void delete(int onlyid) throws SQLException {
        announcementDao dao = new announcementDaoImpl();
        dao.delete(onlyid);
    }
}
