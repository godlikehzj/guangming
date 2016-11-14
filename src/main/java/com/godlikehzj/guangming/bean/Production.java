package com.godlikehzj.guangming.bean;

/**
 * Created by godlikehzj on 2016/11/10.
 */
public class Production {
    private long id;
    private String series;
    private String subType;
    private int capacity;
    private float price;

    public Production() {
    }

    public Production(long id, String series, String subType, int capacity, float price) {
        this.id = id;
        this.series = series;
        this.subType = subType;
        this.capacity = capacity;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
