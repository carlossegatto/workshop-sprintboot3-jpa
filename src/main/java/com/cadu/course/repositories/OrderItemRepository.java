package com.cadu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.course.entities.OrderItem;
import com.cadu.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
