package com.capstone.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.ecommerce.dao.UserDao;
import com.capstone.ecommerce.models.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao uDao;
	
	@Override
	public User addUser(User user) {
		return uDao.save(user);
	}
	
	public List<User> getUsers() {
		return uDao.findAll();
	}
	
	public User updateUser(User user) {
		uDao.save(user);
		return user;
	}
	
	public void deleteUser(int userId) {
		User user = uDao.getReferenceById(userId);
		uDao.delete(user);
	}

}
