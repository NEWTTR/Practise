package com.org.service;

import com.org.pojo.User;

public interface UserService {

	public void add(User user); 

    
    public User get(String username,String password); 
}
