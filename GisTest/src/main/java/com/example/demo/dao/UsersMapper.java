package com.example.demo.dao;

import com.example.demo.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    Users selectByPrimaryKey(Integer userId);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);

    Users selectbyuserName(String userName);
}