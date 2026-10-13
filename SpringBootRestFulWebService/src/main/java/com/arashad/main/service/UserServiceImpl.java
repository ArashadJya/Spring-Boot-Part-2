package com.arashad.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arashad.main.entity.User;
import com.arashad.main.repository.userRepository;

@Service
public class UserServiceImpl implements userService{
	
	@Autowired
	private userRepository userRepository; 
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
		
	}
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserDetails(int id) {
		return userRepository.findById(id);
	}

	@Override
	public User updateUserDetails(int id, User newuser) {
		User userdata=userRepository.findById(id).orElse(null);
		
		if(userdata!=null) {
			return userRepository.save(newuser);
		}
		else {
			throw new RuntimeException("User not found with id "+id);
		}
		
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
		
	}

}




























