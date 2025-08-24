package com.cadu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
