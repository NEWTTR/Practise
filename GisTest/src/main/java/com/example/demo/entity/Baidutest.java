package com.example.demo.entity;

import java.io.Serializable;

public class Baidutest implements Serializable {
    private Integer id;

    private Double baiduX;

    private Double baiduY;

    private String stationid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBaiduX() {
        return baiduX;
    }

    public void setBaiduX(Double baiduX) {
        this.baiduX = baiduX;
    }

    public Double getBaiduY() {
        return baiduY;
    }

    public void setBaiduY(Double baiduY) {
        this.baiduY = baiduY;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid == null ? null : stationid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", baiduX=").append(baiduX);
        sb.append(", baiduY=").append(baiduY);
        sb.append(", stationid=").append(stationid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}