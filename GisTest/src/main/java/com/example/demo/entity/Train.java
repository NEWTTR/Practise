package com.example.demo.entity;

import java.io.Serializable;

public class Train implements Serializable {
    private Integer trainId;

    private String trainNameLine;

    private String trainName;

    private String trainInfor;

    private Double trainLongitude;

    private Double trainLatitude;

    private static final long serialVersionUID = 1L;

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public String getTrainNameLine() {
        return trainNameLine;
    }

    public void setTrainNameLine(String trainNameLine) {
        this.trainNameLine = trainNameLine == null ? null : trainNameLine.trim();
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName == null ? null : trainName.trim();
    }

    public String getTrainInfor() {
        return trainInfor;
    }

    public void setTrainInfor(String trainInfor) {
        this.trainInfor = trainInfor == null ? null : trainInfor.trim();
    }

    public Double getTrainLongitude() {
        return trainLongitude;
    }

    public void setTrainLongitude(Double trainLongitude) {
        this.trainLongitude = trainLongitude;
    }

    public Double getTrainLatitude() {
        return trainLatitude;
    }

    public void setTrainLatitude(Double trainLatitude) {
        this.trainLatitude = trainLatitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trainId=").append(trainId);
        sb.append(", trainNameLine=").append(trainNameLine);
        sb.append(", trainName=").append(trainName);
        sb.append(", trainInfor=").append(trainInfor);
        sb.append(", trainLongitude=").append(trainLongitude);
        sb.append(", trainLatitude=").append(trainLatitude);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}