package com.capstone.ecommerce.service;

import java.util.List;
import com.capstone.ecommerce.models.User;

public interface UserService {
	
	public User addUser(User user);
	
	public List<User> getUsers();
	
	public User updateUser(User user);
	
	public void deleteUser(int userId);
	
}
