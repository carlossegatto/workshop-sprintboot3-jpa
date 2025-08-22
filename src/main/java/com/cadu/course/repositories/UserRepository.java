package com.cadu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
