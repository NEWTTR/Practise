package com.example.demo.entity;

import java.io.Serializable;

public class Sight implements Serializable {
    private Integer sightId;

    private String sightName;

    private String sightBriefInfor;

    private String sightDetailInfor;

    private String sightTel;

    private String sightAddress;

    private String sightLevel;

    private Double sightLongitude;

    private Double sightLatitude;

    private Integer sightPrice;

    private Double sightScore;

    private Integer sightClicks;

    private static final long serialVersionUID = 1L;

    public Integer getSightId() {
        return sightId;
    }

    public void setSightId(Integer sightId) {
        this.sightId = sightId;
    }

    public String getSightName() {
        return sightName;
    }

    public void setSightName(String sightName) {
        this.sightName = sightName == null ? null : sightName.trim();
    }

    public String getSightBriefInfor() {
        return sightBriefInfor;
    }

    public void setSightBriefInfor(String sightBriefInfor) {
        this.sightBriefInfor = sightBriefInfor == null ? null : sightBriefInfor.trim();
    }

    public String getSightDetailInfor() {
        return sightDetailInfor;
    }

    public void setSightDetailInfor(String sightDetailInfor) {
        this.sightDetailInfor = sightDetailInfor == null ? null : sightDetailInfor.trim();
    }

    public String getSightTel() {
        return sightTel;
    }

    public void setSightTel(String sightTel) {
        this.sightTel = sightTel == null ? null : sightTel.trim();
    }

    public String getSightAddress() {
        return sightAddress;
    }

    public void setSightAddress(String sightAddress) {
        this.sightAddress = sightAddress == null ? null : sightAddress.trim();
    }

    public String getSightLevel() {
        return sightLevel;
    }

    public void setSightLevel(String sightLevel) {
        this.sightLevel = sightLevel == null ? null : sightLevel.trim();
    }

    public Double getSightLongitude() {
        return sightLongitude;
    }

    public void setSightLongitude(Double sightLongitude) {
        this.sightLongitude = sightLongitude;
    }

    public Double getSightLatitude() {
        return sightLatitude;
    }

    public void setSightLatitude(Double sightLatitude) {
        this.sightLatitude = sightLatitude;
    }

    public Integer getSightPrice() {
        return sightPrice;
    }

    public void setSightPrice(Integer sightPrice) {
        this.sightPrice = sightPrice;
    }

    public Double getSightScore() {
        return sightScore;
    }

    public void setSightScore(Double sightScore) {
        this.sightScore = sightScore;
    }

    public Integer getSightClicks() {
        return sightClicks;
    }

    public void setSightClicks(Integer sightClicks) {
        this.sightClicks = sightClicks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sightId=").append(sightId);
        sb.append(", sightName=").append(sightName);
        sb.append(", sightBriefInfor=").append(sightBriefInfor);
        sb.append(", sightDetailInfor=").append(sightDetailInfor);
        sb.append(", sightTel=").append(sightTel);
        sb.append(", sightAddress=").append(sightAddress);
        sb.append(", sightLevel=").append(sightLevel);
        sb.append(", sightLongitude=").append(sightLongitude);
        sb.append(", sightLatitude=").append(sightLatitude);
        sb.append(", sightPrice=").append(sightPrice);
        sb.append(", sightScore=").append(sightScore);
        sb.append(", sightClicks=").append(sightClicks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}