package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    public void insert(User user);

    public void delete(int id);

    public void update(User user);

    public User select(int id);

    public User selectbyname(String username);

    public List<User> selectAll();
}
