package com.cadu.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cadu.course.entities.User;

import com.cadu.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Cadu", "cadu@gmail.com", "999999999", "123");
		User u2 = new User(null, "Monica", "monica@gmail.com", "988888888", "abc");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
