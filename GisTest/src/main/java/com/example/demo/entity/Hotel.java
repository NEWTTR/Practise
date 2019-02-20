package com.example.demo.entity;

import java.io.Serializable;

public class Hotel implements Serializable {
    private Integer hotelId;

    private String hotelName;

    private String hotelInfor;

    private String hotelTel;

    private String hotelAddress;

    private String hotelLevel;

    private Double hotelLongitude;

    private Double hotelLatitude;

    private Integer hotelPrice;

    private Double hotelScore;

    private static final long serialVersionUID = 1L;

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public String getHotelInfor() {
        return hotelInfor;
    }

    public void setHotelInfor(String hotelInfor) {
        this.hotelInfor = hotelInfor == null ? null : hotelInfor.trim();
    }

    public String getHotelTel() {
        return hotelTel;
    }

    public void setHotelTel(String hotelTel) {
        this.hotelTel = hotelTel == null ? null : hotelTel.trim();
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress == null ? null : hotelAddress.trim();
    }

    public String getHotelLevel() {
        return hotelLevel;
    }

    public void setHotelLevel(String hotelLevel) {
        this.hotelLevel = hotelLevel == null ? null : hotelLevel.trim();
    }

    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    public void setHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    public void setHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    public Integer getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(Integer hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public Double getHotelScore() {
        return hotelScore;
    }

    public void setHotelScore(Double hotelScore) {
        this.hotelScore = hotelScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hotelId=").append(hotelId);
        sb.append(", hotelName=").append(hotelName);
        sb.append(", hotelInfor=").append(hotelInfor);
        sb.append(", hotelTel=").append(hotelTel);
        sb.append(", hotelAddress=").append(hotelAddress);
        sb.append(", hotelLevel=").append(hotelLevel);
        sb.append(", hotelLongitude=").append(hotelLongitude);
        sb.append(", hotelLatitude=").append(hotelLatitude);
        sb.append(", hotelPrice=").append(hotelPrice);
        sb.append(", hotelScore=").append(hotelScore);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}