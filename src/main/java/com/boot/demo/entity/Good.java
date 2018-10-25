package com.boot.demo.entity;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

public class Good {
    private int goodId;
    private String goodName;
    private  Double goodPrice;
    private  int goodNum;
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date goodProdate;
    private int goodSaveTime;
    private int goodImg;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(int goodNum) {
        this.goodNum = goodNum;
    }

    public Date getGoodProdate() {
        return goodProdate;
    }

    public void setGoodProdate(Date goodProdate) {
        this.goodProdate = goodProdate;
    }

    public int getGoodSaveTime() {
        return goodSaveTime;
    }

    public void setGoodSaveTime(int goodSaveTime) {
        this.goodSaveTime = goodSaveTime;
    }

    public int getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(int goodImg) {
        this.goodImg = goodImg;
    }
}
