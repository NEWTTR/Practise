package com.example.demo.dao;

import com.example.demo.entity.Train;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Repository
@Mapper
public interface TrainMapper {
    int deleteByPrimaryKey(Integer trainId);

    int insert(Train record);

    Train selectByPrimaryKey(Integer trainId);

    List<Train> selectAll();

    int updateByPrimaryKey(Train record);

    List<Train> selectbyTrainNameLine(String trainNameLine);

    Train selectbyName(String trainName);
}