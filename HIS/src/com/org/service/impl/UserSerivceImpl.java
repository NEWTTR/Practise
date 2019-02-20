package com.org.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.mapper.UserMapper;
import com.org.pojo.User;
import com.org.service.UserService;

@Service
public class UserSerivceImpl  implements UserService{

	@Autowired
	UserMapper usermapper;

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		usermapper.add(user);
	}

	@Override
	public User get(String username, String password) {
		// TODO Auto-generated method stub
		return usermapper.get(username, password);
	}
	
}
