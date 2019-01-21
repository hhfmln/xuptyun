package com.xupt.domain;

import java.util.Date;

public class announcement {
    private int onlyid;
    private String announcement_name;
    private String announcement_time;
    private String announcement_content;
    private String gongneng;

    public announcement(){

    }

    public announcement(int onlyid, String announcement_name, String announcement_time, String announcement_content,String gongneng) {
        this.onlyid = onlyid;
        this.announcement_name = announcement_name;
        this.announcement_time = announcement_time;
        this.announcement_content = announcement_content;
        this.gongneng = gongneng;
    }

    public announcement(String announcement_name, String announcement_time, String announcement_content,String gongneng) {
        this.announcement_name = announcement_name;
        this.announcement_time = announcement_time;
        this.announcement_content = announcement_content;
        this.gongneng = gongneng;
    }

    public int getOnlyid() {
        return onlyid;
    }

    public void setOnlyid(int onlyid) {
        this.onlyid = onlyid;
    }

    public String getAnnouncement_name() {
        return announcement_name;
    }

    public void setAnnouncement_name(String announcement_name) {
        this.announcement_name = announcement_name;
    }

    public String getAnnouncement_time() {
        return announcement_time;
    }

    public void setAnnouncement_time(String announcement_time) {
        this.announcement_time = announcement_time;
    }

    public String getAnnouncement_content() {
        return announcement_content;
    }

    public void setAnnouncement_content(String announcement_content) {
        this.announcement_content = announcement_content;
    }

    public String getGongneng() {
        return gongneng;
    }

    public void setGongneng(String gongneng) {
        this.gongneng = gongneng;
    }
}
