package com.cadu.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadu.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findall() {
		
		User u = new User(1L, "Cadu", "cadu@gmail.com", "53981183150", "abc123");
		return ResponseEntity.ok().body(u);
	}
}
