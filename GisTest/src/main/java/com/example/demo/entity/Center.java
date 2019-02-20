package com.example.demo.entity;

import java.io.Serializable;

public class Center implements Serializable {
    private Integer centerId;

    private String centerName;

    private String centerInfor;

    private Double centerLongitude;

    private Double centerLatitude;

    private String centerType;

    private Integer centerClicks;

    private static final long serialVersionUID = 1L;

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName == null ? null : centerName.trim();
    }

    public String getCenterInfor() {
        return centerInfor;
    }

    public void setCenterInfor(String centerInfor) {
        this.centerInfor = centerInfor == null ? null : centerInfor.trim();
    }

    public Double getCenterLongitude() {
        return centerLongitude;
    }

    public void setCenterLongitude(Double centerLongitude) {
        this.centerLongitude = centerLongitude;
    }

    public Double getCenterLatitude() {
        return centerLatitude;
    }

    public void setCenterLatitude(Double centerLatitude) {
        this.centerLatitude = centerLatitude;
    }

    public String getCenterType() {
        return centerType;
    }

    public void setCenterType(String centerType) {
        this.centerType = centerType == null ? null : centerType.trim();
    }

    public Integer getCenterClicks() {
        return centerClicks;
    }

    public void setCenterClicks(Integer centerClicks) {
        this.centerClicks = centerClicks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", centerId=").append(centerId);
        sb.append(", centerName=").append(centerName);
        sb.append(", centerInfor=").append(centerInfor);
        sb.append(", centerLongitude=").append(centerLongitude);
        sb.append(", centerLatitude=").append(centerLatitude);
        sb.append(", centerType=").append(centerType);
        sb.append(", centerClicks=").append(centerClicks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}