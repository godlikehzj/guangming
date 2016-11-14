package com.godlikehzj.guangming.bean;

import java.util.Date;

/**
 * Created by godlikehzj on 2016/11/10.
 */
public class Order {
    private String mname;
    private String cname;
    private String area;
    private String addr;
    private String phone;
    private String series;
    private String subType;
    private int num;
    private Date startTime;
    private Date endTime;

    public Order() {
    }

    public Order(String mname, String cname, String area, String addr, String phone, String series, String subType, int num, Date startTime, Date endTime) {
        this.mname = mname;
        this.cname = cname;
        this.area = area;
        this.addr = addr;
        this.phone = phone;
        this.series = series;
        this.subType = subType;
        this.num = num;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
