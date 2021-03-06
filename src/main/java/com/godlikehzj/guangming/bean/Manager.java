package com.godlikehzj.guangming.bean;

/**
 * Created by godlikehzj on 2016/11/16.
 */
public class Manager {
    private long id;
    private String name;
    private String phone;
    private String addr;
    private String area;
    private int role;

    public Manager() {
    }

    public Manager(long id, String name, String phone, String addr, String area, int role) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.area = area;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
