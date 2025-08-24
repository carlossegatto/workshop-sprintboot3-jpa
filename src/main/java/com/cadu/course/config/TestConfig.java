package com.cadu.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cadu.course.entities.Category;
import com.cadu.course.entities.Order;
import com.cadu.course.entities.User;
import com.cadu.course.entities.enums.OrderStatus;
import com.cadu.course.repositories.CategoryRepository;
import com.cadu.course.repositories.OrderRepository;
import com.cadu.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Books");
		Category c3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		User u1 = new User(null, "Cadu", "cadu@gmail.com", "999999999", "123");
		User u2 = new User(null, "Monica", "monica@gmail.com", "988888888", "abc");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID , u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
