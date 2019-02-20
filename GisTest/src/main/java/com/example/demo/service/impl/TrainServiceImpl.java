package com.example.demo.service.impl;

import com.example.demo.dao.TrainMapper;
import com.example.demo.entity.Train;
import com.example.demo.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainMapper trainMapper;

    @Override
    public void insert(Train train) {
        trainMapper.insert(train);
    }

    @Override
    public void delete(int id) {
        trainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Train train) {
        trainMapper.updateByPrimaryKey(train);
    }

    @Override
    public Train select(int id) {
        return trainMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Train> selectAll() {
        return trainMapper.selectAll();
    }

    @Override
    public List<Train> selectbyTrainNameLine(String trainNameLine) {
        return trainMapper.selectbyTrainNameLine(trainNameLine);
    }

    @Override
    public Train selectbyName(String trainName) {
        return trainMapper.selectbyName(trainName);
    }
}
