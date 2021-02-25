package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
@Autowired
private DaoServiceUser service;
	
//retireveALLUsers
@GetMapping("/users")
public List<User> retireveAllUsers()
	{
		return service.findAll();
	}
	
//retrieveUser(int d)
@GetMapping("users/{id}")
public User retrieveUser(@PathVariable int id) 
{
	
	return service.findOne(id);
	
}

@PostMapping("/users")
public void createUser(@RequestBody User user)
{
	
	User savedUser = service.save(user);
}}
