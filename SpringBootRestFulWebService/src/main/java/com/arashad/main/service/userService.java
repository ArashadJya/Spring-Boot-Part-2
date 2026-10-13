package com.arashad.main.service;

import java.util.List;
import java.util.Optional;

import com.arashad.main.entity.User;

public interface userService {
	
	public User createUser(User user);
	public List<User> getAllUser();
	public Optional<User> getUserDetails(int id);
	public User updateUserDetails(int id,User user);
	public void deleteUser(int id);

}
