package com.example.demo.entity;

import java.io.Serializable;

public class Food implements Serializable {
    private Integer foodId;

    private String foodName;

    private String foodInfor;

    private String foodTel;

    private String foodAddress;

    private Double foodLongitude;

    private Double foodLatitude;

    private Integer foodPrice;

    private String foodStyle;

    private String foodRecommend;

    private static final long serialVersionUID = 1L;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getFoodInfor() {
        return foodInfor;
    }

    public void setFoodInfor(String foodInfor) {
        this.foodInfor = foodInfor == null ? null : foodInfor.trim();
    }

    public String getFoodTel() {
        return foodTel;
    }

    public void setFoodTel(String foodTel) {
        this.foodTel = foodTel == null ? null : foodTel.trim();
    }

    public String getFoodAddress() {
        return foodAddress;
    }

    public void setFoodAddress(String foodAddress) {
        this.foodAddress = foodAddress == null ? null : foodAddress.trim();
    }

    public Double getFoodLongitude() {
        return foodLongitude;
    }

    public void setFoodLongitude(Double foodLongitude) {
        this.foodLongitude = foodLongitude;
    }

    public Double getFoodLatitude() {
        return foodLatitude;
    }

    public void setFoodLatitude(Double foodLatitude) {
        this.foodLatitude = foodLatitude;
    }

    public Integer getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Integer foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodStyle() {
        return foodStyle;
    }

    public void setFoodStyle(String foodStyle) {
        this.foodStyle = foodStyle == null ? null : foodStyle.trim();
    }

    public String getFoodRecommend() {
        return foodRecommend;
    }

    public void setFoodRecommend(String foodRecommend) {
        this.foodRecommend = foodRecommend == null ? null : foodRecommend.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", foodId=").append(foodId);
        sb.append(", foodName=").append(foodName);
        sb.append(", foodInfor=").append(foodInfor);
        sb.append(", foodTel=").append(foodTel);
        sb.append(", foodAddress=").append(foodAddress);
        sb.append(", foodLongitude=").append(foodLongitude);
        sb.append(", foodLatitude=").append(foodLatitude);
        sb.append(", foodPrice=").append(foodPrice);
        sb.append(", foodStyle=").append(foodStyle);
        sb.append(", foodRecommend=").append(foodRecommend);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}