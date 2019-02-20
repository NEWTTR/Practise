package com.org.mapper;

import com.org.pojo.User;


public interface UserMapper {
	public void add(User user); 

        
    public User get(String username,String password); 
      
}
