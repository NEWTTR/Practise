package com.example.demo.service;

import com.example.demo.entity.Users;

import java.util.List;

public interface UsersService {
    public void insert(Users user);

    public void delete(int id);

    public void update(Users user);

    public Users select(int id);

    public List<Users> selectAll();

    public Users selectbyuserName(String userName);
}
