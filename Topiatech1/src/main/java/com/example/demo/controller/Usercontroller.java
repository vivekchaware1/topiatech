package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;

@RestController
@RequestMapping("/users")
public class Usercontroller {
	
	private final UserRepo userRepo;
	
	@Autowired
	public Usercontroller(UserRepo userRepo) {
		this.userRepo=userRepo;
	}
	
	@GetMapping
	public List<User> getUser(){
		return userRepo.findAll();
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	

}
