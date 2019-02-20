package com.example.demo.service.impl;

import com.example.demo.dao.UsersMapper;
import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void insert(Users user) {
        usersMapper.insert(user);
    }

    @Override
    public void delete(int id) {
        usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Users user) {
        usersMapper.updateByPrimaryKey(user);
    }

    @Override
    public Users select(int id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Users> selectAll() {
        return usersMapper.selectAll();
    }

    @Override
    public Users selectbyuserName(String userName) {
        return usersMapper.selectbyuserName(userName);
    }
}
