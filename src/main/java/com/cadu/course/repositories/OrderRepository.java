package com.cadu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
