package com.educandoweb.Course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.Course.entities.User;

@RestController
@RequestMapping ( value= "/users")

public class UserResource {

	@GetMapping
	public ResponseEntity<User> finalALL(){
		User u = new User(1L, "maria", "Maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
		
	}
}
