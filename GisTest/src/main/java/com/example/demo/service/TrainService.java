package com.example.demo.service;

import com.example.demo.entity.Train;

import java.util.List;

public interface TrainService {

    public void insert(Train train);

    public void delete(int id);

    public void update(Train train);

    public Train select(int id);

    public List<Train> selectAll();

    public List<Train> selectbyTrainNameLine(String trainNameLine);

    public Train selectbyName(String trainName);
}
